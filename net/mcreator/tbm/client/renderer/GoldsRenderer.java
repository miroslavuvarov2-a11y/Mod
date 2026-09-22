package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelgold2;
import net.mcreator.tbm.entity.GoldsEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GoldsRenderer extends MobRenderer<GoldsEntity, Modelgold2<GoldsEntity>> {
   public GoldsRenderer(EntityRendererProvider.Context context) {
      super(context, new Modelgold2(context.m_174023_(Modelgold2.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(GoldsEntity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/er.png");
   }
}
