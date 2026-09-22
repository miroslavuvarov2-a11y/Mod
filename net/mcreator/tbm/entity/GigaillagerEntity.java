package net.mcreator.tbm.entity;

import java.util.EnumSet;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.mcreator.tbm.procedures.GigaillagerEntityIsHurtProcedure;
import net.mcreator.tbm.procedures.GigaillagerOnEntityTickUpdateProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
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
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.SpawnPlacements.Type;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap.Types;
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

public class GigaillagerEntity extends Monster implements GeoEntity {
   public static final EntityDataAccessor<Boolean> SHOOT;
   public static final EntityDataAccessor<String> ANIMATION;
   public static final EntityDataAccessor<String> TEXTURE;
   private final AnimatableInstanceCache cache;
   private boolean swinging;
   private boolean lastloop;
   private long lastSwing;
   public String animationprocedure;
   private final ServerBossEvent bossInfo;

   public GigaillagerEntity(PlayMessages.SpawnEntity packet, Level world) {
      this((EntityType)ThemutantmobsmodModEntities.GIGAILLAGER.get(), world);
   }

   public GigaillagerEntity(EntityType<GigaillagerEntity> type, Level world) {
      super(type, world);
      this.cache = GeckoLibUtil.createInstanceCache(this);
      this.animationprocedure = "empty";
      this.bossInfo = new ServerBossEvent(this.m_5446_(), BossBarColor.RED, BossBarOverlay.NOTCHED_6);
      this.f_21364_ = 0;
      this.m_21557_(false);
   }

   protected void m_8097_() {
      super.m_8097_();
      this.f_19804_.m_135372_(SHOOT, false);
      this.f_19804_.m_135372_(ANIMATION, "undefined");
      this.f_19804_.m_135372_(TEXTURE, "gigaillager");
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

   protected void m_8099_() {
      super.m_8099_();
      this.f_21345_.m_25352_(1, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21345_.m_25352_(2, new RandomStrollGoal(this, (double)1.0F));
      this.f_21346_.m_25352_(3, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(4, new RandomLookAroundGoal(this));
      this.f_21345_.m_25352_(5, new FloatGoal(this));
      this.f_21345_.m_25352_(6, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(7, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(8, new RandomStrollGoal(this, 0.8));
      this.f_21345_.m_25352_(9, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(10, new NearestAttackableTargetGoal(this, Player.class, false, false));
      this.f_21345_.m_25352_(11, new Goal() {
         {
            this.m_7021_(EnumSet.of(Flag.MOVE));
         }

         public boolean m_8036_() {
            return GigaillagerEntity.this.m_5448_() != null && !GigaillagerEntity.this.m_21566_().m_24995_();
         }

         public boolean m_8045_() {
            return GigaillagerEntity.this.m_21566_().m_24995_() && GigaillagerEntity.this.m_5448_() != null && GigaillagerEntity.this.m_5448_().m_6084_();
         }

         public void m_8056_() {
            LivingEntity livingentity = GigaillagerEntity.this.m_5448_();
            Vec3 vec3d = livingentity.m_20299_(1.0F);
            GigaillagerEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
         }

         public void m_8037_() {
            LivingEntity livingentity = GigaillagerEntity.this.m_5448_();
            if (GigaillagerEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
               GigaillagerEntity.this.m_7327_(livingentity);
            } else {
               double d0 = GigaillagerEntity.this.m_20280_(livingentity);
               if (d0 < (double)16.0F) {
                  Vec3 vec3d = livingentity.m_20299_(1.0F);
                  GigaillagerEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, (double)1.0F);
               }
            }

         }
      });
      this.f_21345_.m_25352_(12, new RandomStrollGoal(this, 0.8, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = GigaillagerEntity.this.m_217043_();
            double dir_x = GigaillagerEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = GigaillagerEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = GigaillagerEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
      this.f_21345_.m_25352_(13, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21345_.m_25352_(14, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(15, new NearestAttackableTargetGoal(this, Villager.class, false, false));
      this.f_21346_.m_25352_(16, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(17, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(18, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(19, new RandomStrollGoal(this, 0.8));
      this.f_21345_.m_25352_(20, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(21, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public SoundEvent m_7975_(DamageSource ds) {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
   }

   public SoundEvent m_5592_() {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
   }

   public boolean m_6469_(DamageSource source, float amount) {
      GigaillagerEntityIsHurtProcedure.execute(this);
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
      GigaillagerOnEntityTickUpdateProcedure.execute(this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), this);
      this.m_6210_();
   }

   public EntityDimensions m_6972_(Pose p_33597_) {
      return super.m_6972_(p_33597_).m_20388_(1.0F);
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

   public static void init() {
      SpawnPlacements.m_21754_((EntityType)ThemutantmobsmodModEntities.GIGAILLAGER.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, world, reason, pos, random));
   }

   public static AttributeSupplier.Builder createAttributes() {
      AttributeSupplier.Builder builder = Mob.m_21552_();
      builder = builder.m_22268_(Attributes.f_22279_, 0.35);
      builder = builder.m_22268_(Attributes.f_22276_, (double)750.0F);
      builder = builder.m_22268_(Attributes.f_22284_, (double)100.0F);
      builder = builder.m_22268_(Attributes.f_22281_, (double)9.0F);
      builder = builder.m_22268_(Attributes.f_22277_, (double)128.0F);
      builder = builder.m_22268_(Attributes.f_22278_, (double)1000.0F);
      return builder;
   }

   private PlayState movementPredicate(AnimationState event) {
      if (this.animationprocedure.equals("empty")) {
         return !event.isMoving() && event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F ? event.setAndContinue(RawAnimation.begin().thenLoop("idle")) : event.setAndContinue(RawAnimation.begin().thenLoop("move"));
      } else {
         return PlayState.STOP;
      }
   }

   private PlayState attackingPredicate(AnimationState event) {
      double d1 = this.m_20185_() - this.f_19790_;
      double d0 = this.m_20189_() - this.f_19792_;
      float velocity = (float)Math.sqrt(d1 * d1 + d0 * d0);
      if (this.m_21324_(event.getPartialTick()) > 0.0F && !this.swinging) {
         this.swinging = true;
         this.lastSwing = this.m_9236_().m_46467_();
      }

      if (this.swinging && this.lastSwing + 7L <= this.m_9236_().m_46467_()) {
         this.swinging = false;
      }

      if (this.swinging && event.getController().getAnimationState() == State.STOPPED) {
         event.getController().forceAnimationReset();
         return event.setAndContinue(RawAnimation.begin().thenPlay("attack2"));
      } else {
         return PlayState.CONTINUE;
      }
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
      data.add(new AnimationController[]{new AnimationController(this, "attacking", 4, this::attackingPredicate)});
      data.add(new AnimationController[]{new AnimationController(this, "procedure", 4, this::procedurePredicate)});
   }

   public AnimatableInstanceCache getAnimatableInstanceCache() {
      return this.cache;
   }

   static {
      SHOOT = SynchedEntityData.m_135353_(GigaillagerEntity.class, EntityDataSerializers.f_135035_);
      ANIMATION = SynchedEntityData.m_135353_(GigaillagerEntity.class, EntityDataSerializers.f_135030_);
      TEXTURE = SynchedEntityData.m_135353_(GigaillagerEntity.class, EntityDataSerializers.f_135030_);
   }
}
