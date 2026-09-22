package net.mcreator.tbm.potion;

import net.mcreator.tbm.procedures.GigaEffectStartedappliedProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class GigaMobEffect extends MobEffect {
   public GigaMobEffect() {
      super(MobEffectCategory.HARMFUL, -13434880);
   }

   public String m_19481_() {
      return "effect.themutantmobsmod.giga";
   }

   public void m_6385_(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      GigaEffectStartedappliedProcedure.execute(entity.m_9236_(), entity);
   }

   public void m_6742_(LivingEntity entity, int amplifier) {
      GigaEffectStartedappliedProcedure.execute(entity.m_9236_(), entity);
   }

   public boolean m_6584_(int duration, int amplifier) {
      return true;
   }
}
