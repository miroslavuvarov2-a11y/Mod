package net.mcreator.tbm.entity;

import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.mcreator.tbm.procedures.MmbmgEntityFallsProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class MmbmgEntity extends Monster {
   public MmbmgEntity(PlayMessages.SpawnEntity packet, Level world) {
      this((EntityType)ThemutantmobsmodModEntities.MMBMG.get(), world);
   }

   public MmbmgEntity(EntityType<MmbmgEntity> type, Level world) {
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

   public boolean m_142535_(float l, float d, DamageSource source) {
      MmbmgEntityFallsProcedure.execute(this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_());
      return super.m_142535_(l, d, source);
   }

   public static void init() {
   }

   public static AttributeSupplier.Builder createAttributes() {
      AttributeSupplier.Builder builder = Mob.m_21552_();
      builder = builder.m_22268_(Attributes.f_22279_, (double)0.0F);
      builder = builder.m_22268_(Attributes.f_22276_, (double)1.0F);
      builder = builder.m_22268_(Attributes.f_22284_, (double)0.0F);
      builder = builder.m_22268_(Attributes.f_22281_, (double)0.0F);
      builder = builder.m_22268_(Attributes.f_22277_, (double)16.0F);
      return builder;
   }
}
