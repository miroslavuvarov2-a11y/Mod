package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantGhastEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantGhastModel extends GeoModel<MutantGhastEntity> {
   public ResourceLocation getAnimationResource(MutantGhastEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutantghast4.animation.json");
   }

   public ResourceLocation getModelResource(MutantGhastEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutantghast4.geo.json");
   }

   public ResourceLocation getTextureResource(MutantGhastEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
