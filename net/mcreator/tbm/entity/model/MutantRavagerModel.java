package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantRavagerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantRavagerModel extends GeoModel<MutantRavagerEntity> {
   public ResourceLocation getAnimationResource(MutantRavagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mr.animation.json");
   }

   public ResourceLocation getModelResource(MutantRavagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mr.geo.json");
   }

   public ResourceLocation getTextureResource(MutantRavagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
