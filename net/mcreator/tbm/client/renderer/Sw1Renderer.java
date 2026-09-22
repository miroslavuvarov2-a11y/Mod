package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelsw2;
import net.mcreator.tbm.entity.Sw1Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class Sw1Renderer extends MobRenderer<Sw1Entity, Modelsw2<Sw1Entity>> {
   public Sw1Renderer(EntityRendererProvider.Context context) {
      super(context, new Modelsw2(context.m_174023_(Modelsw2.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(Sw1Entity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/sw2.png");
   }
}
