package net.mcreator.tbm.entity;

import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.mcreator.tbm.procedures.MagicbymutantenderdragonThisEntityKillsAnotherOneProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class MagicbymutantenderdragonEntity extends Monster {
   public MagicbymutantenderdragonEntity(PlayMessages.SpawnEntity packet, Level world) {
      this((EntityType)ThemutantmobsmodModEntities.MAGICMADEBYMUTANTENDERDRAGON.get(), world);
   }

   public MagicbymutantenderdragonEntity(EntityType<MagicbymutantenderdragonEntity> type, Level world) {
      super(type, world);
      this.m_274367_(0.6F);
      this.f_21364_ = 0;
      this.m_21557_(false);
      this.m_21530_();
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
      this.f_21345_.m_25352_(11, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(12, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(13, new RandomStrollGoal(this, 0.8));
      this.f_21345_.m_25352_(14, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(15, new NearestAttackableTargetGoal(this, PathfinderMob.class, false, false));
      this.f_21345_.m_25352_(16, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(17, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(18, new RandomStrollGoal(this, 0.8));
      this.f_21345_.m_25352_(19, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(20, new NearestAttackableTargetGoal(this, Monster.class, false, false));
      this.f_21345_.m_25352_(21, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(22, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(23, new RandomStrollGoal(this, 0.8));
      this.f_21345_.m_25352_(24, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(25, new NearestAttackableTargetGoal(this, Villager.class, false, false));
      this.f_21345_.m_25352_(26, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(27, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(28, new RandomStrollGoal(this, 0.8));
      this.f_21345_.m_25352_(29, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(30, new NearestAttackableTargetGoal(this, Animal.class, false, false));
      this.f_21345_.m_25352_(31, new MeleeAttackGoal(this, 1.2, false) {
         protected double m_6639_(LivingEntity entity) {
            return (double)(this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
         }
      });
      this.f_21346_.m_25352_(32, new HurtByTargetGoal(this, new Class[0]));
      this.f_21345_.m_25352_(33, new RandomStrollGoal(this, 0.8));
      this.f_21345_.m_25352_(34, new RandomLookAroundGoal(this));
      this.f_21346_.m_25352_(35, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public boolean m_6785_(double distanceToClosestPlayer) {
      return false;
   }

   public SoundEvent m_7975_(DamageSource ds) {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
   }

   public SoundEvent m_5592_() {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
   }

   public boolean m_6469_(DamageSource source, float amount) {
      if (source.m_7640_() instanceof AbstractArrow) {
         return false;
      } else if (source.m_276093_(DamageTypes.f_268671_)) {
         return false;
      } else {
         return source.m_276093_(DamageTypes.f_268565_) ? false : super.m_6469_(source, amount);
      }
   }

   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
      super.m_5993_(entity, score, damageSource);
      MagicbymutantenderdragonThisEntityKillsAnotherOneProcedure.execute(this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_());
   }

   public static void init() {
   }

   public static AttributeSupplier.Builder createAttributes() {
      AttributeSupplier.Builder builder = Mob.m_21552_();
      builder = builder.m_22268_(Attributes.f_22279_, (double)0.5F);
      builder = builder.m_22268_(Attributes.f_22276_, (double)1.0F);
      builder = builder.m_22268_(Attributes.f_22284_, (double)0.0F);
      builder = builder.m_22268_(Attributes.f_22281_, (double)100.0F);
      builder = builder.m_22268_(Attributes.f_22277_, (double)128.0F);
      return builder;
   }
}
