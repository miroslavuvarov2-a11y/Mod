package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelmws;
import net.mcreator.tbm.entity.TowerofmutantwitherEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TowerofmutantwitherRenderer extends MobRenderer<TowerofmutantwitherEntity, Modelmws<TowerofmutantwitherEntity>> {
   public TowerofmutantwitherRenderer(EntityRendererProvider.Context context) {
      super(context, new Modelmws(context.m_174023_(Modelmws.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(TowerofmutantwitherEntity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/mws.png");
   }
}
