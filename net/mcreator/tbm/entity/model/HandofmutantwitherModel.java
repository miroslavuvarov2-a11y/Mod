package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.HandofmutantwitherEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HandofmutantwitherModel extends GeoModel<HandofmutantwitherEntity> {
   public ResourceLocation getAnimationResource(HandofmutantwitherEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mwh.animation.json");
   }

   public ResourceLocation getModelResource(HandofmutantwitherEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mwh.geo.json");
   }

   public ResourceLocation getTextureResource(HandofmutantwitherEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
