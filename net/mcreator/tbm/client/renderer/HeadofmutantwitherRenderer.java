package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelhomw;
import net.mcreator.tbm.entity.HeadofmutantwitherEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HeadofmutantwitherRenderer extends MobRenderer<HeadofmutantwitherEntity, Modelhomw<HeadofmutantwitherEntity>> {
   public HeadofmutantwitherRenderer(EntityRendererProvider.Context context) {
      super(context, new Modelhomw(context.m_174023_(Modelhomw.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(HeadofmutantwitherEntity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/homw.png");
   }
}
