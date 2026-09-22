package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelat;
import net.mcreator.tbm.entity.AncientTreeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AncientTreeRenderer extends MobRenderer<AncientTreeEntity, Modelat<AncientTreeEntity>> {
   public AncientTreeRenderer(EntityRendererProvider.Context context) {
      super(context, new Modelat(context.m_174023_(Modelat.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(AncientTreeEntity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/at.png");
   }
}
