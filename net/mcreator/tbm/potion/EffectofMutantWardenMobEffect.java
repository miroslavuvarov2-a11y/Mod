package net.mcreator.tbm.potion;

import java.util.function.Consumer;
import net.mcreator.tbm.procedures.EffectofMutantWardenEffectStartedappliedProcedure;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

public class EffectofMutantWardenMobEffect extends MobEffect {
   public EffectofMutantWardenMobEffect() {
      super(MobEffectCategory.NEUTRAL, -1);
   }

   public String m_19481_() {
      return "effect.themutantmobsmod.effectof_mutant_warden";
   }

   public void m_6385_(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      EffectofMutantWardenEffectStartedappliedProcedure.execute(entity.m_9236_(), entity);
   }

   public void m_6742_(LivingEntity entity, int amplifier) {
      EffectofMutantWardenEffectStartedappliedProcedure.execute(entity.m_9236_(), entity);
   }

   public boolean m_6584_(int duration, int amplifier) {
      return true;
   }

   public void initializeClient(Consumer<IClientMobEffectExtensions> consumer) {
      consumer.accept(new IClientMobEffectExtensions() {
         public boolean isVisibleInInventory(MobEffectInstance effect) {
            return false;
         }

         public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset) {
            return false;
         }

         public boolean isVisibleInGui(MobEffectInstance effect) {
            return false;
         }
      });
   }
}
