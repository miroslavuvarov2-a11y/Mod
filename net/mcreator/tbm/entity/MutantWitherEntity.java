package net.mcreator.tbm.entity;

import java.util.EnumSet;
import javax.annotation.Nullable;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.mcreator.tbm.init.ThemutantmobsmodModItems;
import net.mcreator.tbm.procedures.MutantWitherOnEntityTickUpdateProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.BossEvent.BossBarColor;
import net.minecraft.world.BossEvent.BossBarOverlay;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.animation.AnimationController.State;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class MutantWitherEntity extends Monster implements RangedAttackMob, GeoEntity {
   public static final EntityDataAccessor<Boolean> SHOOT;
   public static final EntityDataAccessor<String> ANIMATION;
   public static final EntityDataAccessor<String> TEXTURE;
   private final AnimatableInstanceCache cache;
   private boolean swinging;
   private boolean lastloop;
   private long lastSwing;
   public String animationprocedure;
   private final ServerBossEvent bossInfo;

   public MutantWitherEntity(PlayMessages.SpawnEntity packet, Level world) {
      this((EntityType)ThemutantmobsmodModEntities.MUTANT_WITHER.get(), world);
   }

   public MutantWitherEntity(EntityType<MutantWitherEntity> type, Level world) {
      super(type, world);
      this.cache = GeckoLibUtil.createInstanceCache(this);
      this.animationprocedure = "empty";
      this.bossInfo = new ServerBossEvent(this.m_5446_(), BossBarColor.PURPLE, BossBarOverlay.NOTCHED_6);
      this.f_21364_ = 2000;
      this.m_21557_(false);
      this.m_21530_();
      this.f_21342_ = new FlyingMoveControl(this, 10, true);
   }

   protected void m_8097_() {
      super.m_8097_();
      this.f_19804_.m_135372_(SHOOT, false);
      this.f_19804_.m_135372_(ANIMATION, "undefined");
      this.f_19804_.m_135372_(TEXTURE, "mutantwither");
   }

   public void setTexture(String texture) {
      this.f_19804_.m_135381_(TEXTURE, texture);
   }

   public String getTexture() {
      return (String)this.f_19804_.m_135370_(TEXTURE);
   }

   public Packet<ClientGamePacketListener> m_5654_() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   protected PathNavigation m_6037_(Level world) {
      return new FlyingPathNavigation(this, world);
   }

   protected void m_8099_() {
      super.m_8099_();
      this.f_21345_.m_25352_(1, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(2, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(3, new RandomLookAroundGoal(this));
      this.f_21345_.m_25352_(4, new FloatGoal(this));
      this.f_21345_.m_25352_(5, new Goal() {
         {
            this.m_7021_(EnumSet.of(Flag.MOVE));
         }

         public boolean m_8036_() {
            return MutantWitherEntity.this.m_5448_() != null && !MutantWitherEntity.this.m_21566_().m_24995_();
         }

         public boolean m_8045_() {
            return MutantWitherEntity.this.m_21566_().m_24995_() && MutantWitherEntity.this.m_5448_() != null && MutantWitherEntity.this.m_5448_().m_6084_();
         }

         public void m_8056_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            Vec3 vec3d = livingentity.m_20299_(1.0F);
            MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
         }

         public void m_8037_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            if (MutantWitherEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
               MutantWitherEntity.this.m_7327_(livingentity);
            } else {
               double d0 = MutantWitherEntity.this.m_20280_(livingentity);
               if (d0 < (double)16.0F) {
                  Vec3 vec3d = livingentity.m_20299_(1.0F);
                  MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
               }
            }

         }
      });
      this.f_21345_.m_25352_(6, new RandomStrollGoal(this, 0.8, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = MutantWitherEntity.this.m_217043_();
            double dir_x = MutantWitherEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = MutantWitherEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = MutantWitherEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
      this.f_21345_.m_25352_(7, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21345_.m_25352_(8, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(9, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(10, new Goal() {
         {
            this.m_7021_(EnumSet.of(Flag.MOVE));
         }

         public boolean m_8036_() {
            return MutantWitherEntity.this.m_5448_() != null && !MutantWitherEntity.this.m_21566_().m_24995_();
         }

         public boolean m_8045_() {
            return MutantWitherEntity.this.m_21566_().m_24995_() && MutantWitherEntity.this.m_5448_() != null && MutantWitherEntity.this.m_5448_().m_6084_();
         }

         public void m_8056_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            Vec3 vec3d = livingentity.m_20299_(1.0F);
            MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
         }

         public void m_8037_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            if (MutantWitherEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
               MutantWitherEntity.this.m_7327_(livingentity);
            } else {
               double d0 = MutantWitherEntity.this.m_20280_(livingentity);
               if (d0 < (double)16.0F) {
                  Vec3 vec3d = livingentity.m_20299_(1.0F);
                  MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
               }
            }

         }
      });
      this.f_21345_.m_25352_(11, new RandomStrollGoal(this, 0.8, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = MutantWitherEntity.this.m_217043_();
            double dir_x = MutantWitherEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = MutantWitherEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = MutantWitherEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
      this.f_21345_.m_25352_(12, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21345_.m_25352_(13, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(14, new NearestAttackableTargetGoal(this, Player.class, false, false));
      this.f_21346_.m_25352_(15, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(16, new Goal() {
         {
            this.m_7021_(EnumSet.of(Flag.MOVE));
         }

         public boolean m_8036_() {
            return MutantWitherEntity.this.m_5448_() != null && !MutantWitherEntity.this.m_21566_().m_24995_();
         }

         public boolean m_8045_() {
            return MutantWitherEntity.this.m_21566_().m_24995_() && MutantWitherEntity.this.m_5448_() != null && MutantWitherEntity.this.m_5448_().m_6084_();
         }

         public void m_8056_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            Vec3 vec3d = livingentity.m_20299_(1.0F);
            MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
         }

         public void m_8037_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            if (MutantWitherEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
               MutantWitherEntity.this.m_7327_(livingentity);
            } else {
               double d0 = MutantWitherEntity.this.m_20280_(livingentity);
               if (d0 < (double)16.0F) {
                  Vec3 vec3d = livingentity.m_20299_(1.0F);
                  MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
               }
            }

         }
      });
      this.f_21345_.m_25352_(17, new RandomStrollGoal(this, 0.8, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = MutantWitherEntity.this.m_217043_();
            double dir_x = MutantWitherEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = MutantWitherEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = MutantWitherEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
      this.f_21345_.m_25352_(18, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21345_.m_25352_(19, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(20, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(21, new Goal() {
         {
            this.m_7021_(EnumSet.of(Flag.MOVE));
         }

         public boolean m_8036_() {
            return MutantWitherEntity.this.m_5448_() != null && !MutantWitherEntity.this.m_21566_().m_24995_();
         }

         public boolean m_8045_() {
            return MutantWitherEntity.this.m_21566_().m_24995_() && MutantWitherEntity.this.m_5448_() != null && MutantWitherEntity.this.m_5448_().m_6084_();
         }

         public void m_8056_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            Vec3 vec3d = livingentity.m_20299_(1.0F);
            MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
         }

         public void m_8037_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            if (MutantWitherEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
               MutantWitherEntity.this.m_7327_(livingentity);
            } else {
               double d0 = MutantWitherEntity.this.m_20280_(livingentity);
               if (d0 < (double)16.0F) {
                  Vec3 vec3d = livingentity.m_20299_(1.0F);
                  MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
               }
            }

         }
      });
      this.f_21345_.m_25352_(22, new RandomStrollGoal(this, 0.8, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = MutantWitherEntity.this.m_217043_();
            double dir_x = MutantWitherEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = MutantWitherEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = MutantWitherEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
      this.f_21345_.m_25352_(23, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21345_.m_25352_(24, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(25, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(26, new Goal() {
         {
            this.m_7021_(EnumSet.of(Flag.MOVE));
         }

         public boolean m_8036_() {
            return MutantWitherEntity.this.m_5448_() != null && !MutantWitherEntity.this.m_21566_().m_24995_();
         }

         public boolean m_8045_() {
            return MutantWitherEntity.this.m_21566_().m_24995_() && MutantWitherEntity.this.m_5448_() != null && MutantWitherEntity.this.m_5448_().m_6084_();
         }

         public void m_8056_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            Vec3 vec3d = livingentity.m_20299_(1.0F);
            MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
         }

         public void m_8037_() {
            LivingEntity livingentity = MutantWitherEntity.this.m_5448_();
            if (MutantWitherEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
               MutantWitherEntity.this.m_7327_(livingentity);
            } else {
               double d0 = MutantWitherEntity.this.m_20280_(livingentity);
               if (d0 < (double)16.0F) {
                  Vec3 vec3d = livingentity.m_20299_(1.0F);
                  MutantWitherEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
               }
            }

         }
      });
      this.f_21345_.m_25352_(27, new RandomStrollGoal(this, 0.8, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = MutantWitherEntity.this.m_217043_();
            double dir_x = MutantWitherEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = MutantWitherEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = MutantWitherEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
      this.f_21345_.m_25352_(28, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21345_.m_25352_(29, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(30, new NearestAttackableTargetGoal(this, Villager.class, false, false));
      this.f_21346_.m_25352_(31, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
      this.f_21346_.m_25352_(32, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(1, new RangedAttackGoal(this, (double)1.25F, 20, 10.0F) {
         public boolean m_8045_() {
            return this.m_8036_();
         }
      });
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public boolean m_6785_(double distanceToClosestPlayer) {
      return false;
   }

   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
      super.m_7472_(source, looting, recentlyHitIn);
      this.m_19983_(new ItemStack((ItemLike)ThemutantmobsmodModItems.A_PART_OF_SIMULATED_COMMAND_BLOCK.get()));
   }

   public SoundEvent m_7515_() {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.ambient"));
   }

   public SoundEvent m_7975_(DamageSource ds) {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.hurt"));
   }

   public SoundEvent m_5592_() {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
   }

   public boolean m_142535_(float l, float d, DamageSource source) {
      return false;
   }

   public boolean m_6469_(DamageSource source, float amount) {
      if (source.m_276093_(DamageTypes.f_268631_)) {
         return false;
      } else if (!(source.m_7640_() instanceof ThrownPotion) && !(source.m_7640_() instanceof AreaEffectCloud)) {
         if (source.m_276093_(DamageTypes.f_268671_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268585_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268722_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268450_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268565_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268526_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268482_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268493_)) {
            return false;
         } else {
            return source.m_276093_(DamageTypes.f_268641_) ? false : super.m_6469_(source, amount);
         }
      } else {
         return false;
      }
   }

   public void m_6075_() {
      super.m_6075_();
      MutantWitherOnEntityTickUpdateProcedure.execute(this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), this);
      this.m_6210_();
   }

   public EntityDimensions m_6972_(Pose p_33597_) {
      return super.m_6972_(p_33597_).m_20388_(1.0F);
   }

   public void m_6504_(LivingEntity target, float flval) {
      SuperSkullEntity.shoot(this, target);
   }

   public boolean m_6072_() {
      return false;
   }

   public void m_6457_(ServerPlayer player) {
      super.m_6457_(player);
      this.bossInfo.m_6543_(player);
   }

   public void m_6452_(ServerPlayer player) {
      super.m_6452_(player);
      this.bossInfo.m_6539_(player);
   }

   public void m_8024_() {
      super.m_8024_();
      this.bossInfo.m_142711_(this.m_21223_() / this.m_21233_());
   }

   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
   }

   public void m_20242_(boolean ignored) {
      super.m_20242_(true);
   }

   public void m_8107_() {
      super.m_8107_();
      this.m_20242_(true);
   }

   public static void init() {
   }

   public static AttributeSupplier.Builder createAttributes() {
      AttributeSupplier.Builder builder = Mob.m_21552_();
      builder = builder.m_22268_(Attributes.f_22279_, (double)1.5F);
      builder = builder.m_22268_(Attributes.f_22276_, (double)800.0F);
      builder = builder.m_22268_(Attributes.f_22284_, (double)100.0F);
      builder = builder.m_22268_(Attributes.f_22281_, (double)200.0F);
      builder = builder.m_22268_(Attributes.f_22277_, (double)128.0F);
      builder = builder.m_22268_(Attributes.f_22278_, (double)1000.0F);
      builder = builder.m_22268_(Attributes.f_22280_, (double)1.5F);
      return builder;
   }

   private PlayState movementPredicate(AnimationState event) {
      return this.animationprocedure.equals("empty") ? event.setAndContinue(RawAnimation.begin().thenLoop("idle")) : PlayState.STOP;
   }

   private PlayState procedurePredicate(AnimationState event) {
      Level world = ((Entity)this).m_9236_();
      boolean loop = false;
      double x = ((Entity)this).m_20185_();
      double y = ((Entity)this).m_20186_();
      double z = ((Entity)this).m_20189_();
      if (!loop && this.lastloop) {
         this.lastloop = false;
         event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
         event.getController().forceAnimationReset();
         return PlayState.STOP;
      } else {
         if (!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == State.STOPPED) {
            if (!loop) {
               event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
               if (event.getController().getAnimationState() == State.STOPPED) {
                  this.animationprocedure = "empty";
                  event.getController().forceAnimationReset();
               }
            } else {
               event.getController().setAnimation(RawAnimation.begin().thenLoop(this.animationprocedure));
               this.lastloop = true;
            }
         }

         return PlayState.CONTINUE;
      }
   }

   protected void m_6153_() {
      ++this.f_20919_;
      if (this.f_20919_ == 20) {
         this.m_142687_(RemovalReason.KILLED);
         this.m_21226_();
      }

   }

   public String getSyncedAnimation() {
      return (String)this.f_19804_.m_135370_(ANIMATION);
   }

   public void setAnimation(String animation) {
      this.f_19804_.m_135381_(ANIMATION, animation);
   }

   public void registerControllers(AnimatableManager.ControllerRegistrar data) {
      data.add(new AnimationController[]{new AnimationController(this, "movement", 4, this::movementPredicate)});
      data.add(new AnimationController[]{new AnimationController(this, "procedure", 4, this::procedurePredicate)});
   }

   public AnimatableInstanceCache getAnimatableInstanceCache() {
      return this.cache;
   }

   static {
      SHOOT = SynchedEntityData.m_135353_(MutantWitherEntity.class, EntityDataSerializers.f_135035_);
      ANIMATION = SynchedEntityData.m_135353_(MutantWitherEntity.class, EntityDataSerializers.f_135030_);
      TEXTURE = SynchedEntityData.m_135353_(MutantWitherEntity.class, EntityDataSerializers.f_135030_);
   }

   public class RangedAttackGoal extends Goal {
      private final Mob mob;
      private final RangedAttackMob rangedAttackMob;
      @Nullable
      private LivingEntity target;
      private int attackTime;
      private final double speedModifier;
      private int seeTime;
      private final int attackIntervalMin;
      private final int attackIntervalMax;
      private final float attackRadius;
      private final float attackRadiusSqr;

      public RangedAttackGoal(RangedAttackMob p_25768_, double p_25769_, int p_25770_, float p_25771_) {
         this(p_25768_, p_25769_, p_25770_, p_25770_, p_25771_);
      }

      public RangedAttackGoal(RangedAttackMob p_25773_, double p_25774_, int p_25775_, int p_25776_, float p_25777_) {
         this.attackTime = -1;
         if (!(p_25773_ instanceof LivingEntity)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
         } else {
            this.rangedAttackMob = p_25773_;
            this.mob = (Mob)p_25773_;
            this.speedModifier = p_25774_;
            this.attackIntervalMin = p_25775_;
            this.attackIntervalMax = p_25776_;
            this.attackRadius = p_25777_;
            this.attackRadiusSqr = p_25777_ * p_25777_;
            this.m_7021_(EnumSet.of(Flag.MOVE, Flag.LOOK));
         }
      }

      public boolean m_8036_() {
         LivingEntity livingentity = this.mob.m_5448_();
         if (livingentity != null && livingentity.m_6084_()) {
            this.target = livingentity;
            return true;
         } else {
            return false;
         }
      }

      public boolean m_8045_() {
         return this.m_8036_() || this.target.m_6084_() && !this.mob.m_21573_().m_26571_();
      }

      public void m_8041_() {
         this.target = null;
         this.seeTime = 0;
         this.attackTime = -1;
         ((MutantWitherEntity)this.rangedAttackMob).f_19804_.m_135381_(MutantWitherEntity.SHOOT, false);
      }

      public boolean m_183429_() {
         return true;
      }

      public void m_8037_() {
         double d0 = this.mob.m_20275_(this.target.m_20185_(), this.target.m_20186_(), this.target.m_20189_());
         boolean flag = this.mob.m_21574_().m_148306_(this.target);
         if (flag) {
            ++this.seeTime;
         } else {
            this.seeTime = 0;
         }

         if (!(d0 > (double)this.attackRadiusSqr) && this.seeTime >= 5) {
            this.mob.m_21573_().m_26573_();
         } else {
            this.mob.m_21573_().m_5624_(this.target, this.speedModifier);
         }

         this.mob.m_21563_().m_24960_(this.target, 30.0F, 30.0F);
         if (--this.attackTime == 0) {
            if (!flag) {
               ((MutantWitherEntity)this.rangedAttackMob).f_19804_.m_135381_(MutantWitherEntity.SHOOT, false);
               return;
            }

            ((MutantWitherEntity)this.rangedAttackMob).f_19804_.m_135381_(MutantWitherEntity.SHOOT, true);
            float f = (float)Math.sqrt(d0) / this.attackRadius;
            float f1 = Mth.m_14036_(f, 0.1F, 1.0F);
            this.rangedAttackMob.m_6504_(this.target, f1);
            this.attackTime = Mth.m_14143_(f * (float)(this.attackIntervalMax - this.attackIntervalMin) + (float)this.attackIntervalMin);
         } else if (this.attackTime < 0) {
            this.attackTime = Mth.m_14107_(Mth.m_14139_(Math.sqrt(d0) / (double)this.attackRadius, (double)this.attackIntervalMin, (double)this.attackIntervalMax));
         } else {
            ((MutantWitherEntity)this.rangedAttackMob).f_19804_.m_135381_(MutantWitherEntity.SHOOT, false);
         }

      }
   }
}
