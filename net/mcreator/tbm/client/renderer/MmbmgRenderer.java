package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modeledds;
import net.mcreator.tbm.entity.MmbmgEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MmbmgRenderer extends MobRenderer<MmbmgEntity, Modeledds<MmbmgEntity>> {
   public MmbmgRenderer(EntityRendererProvider.Context context) {
      super(context, new Modeledds(context.m_174023_(Modeledds.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(MmbmgEntity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/dry.png");
   }
}
