package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelrocket;
import net.mcreator.tbm.entity.RocketEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RocketRenderer extends MobRenderer<RocketEntity, Modelrocket<RocketEntity>> {
   public RocketRenderer(EntityRendererProvider.Context context) {
      super(context, new Modelrocket(context.m_174023_(Modelrocket.LAYER_LOCATION)), 1.0F);
   }

   public ResourceLocation getTextureLocation(RocketEntity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/rocket.png");
   }
}
