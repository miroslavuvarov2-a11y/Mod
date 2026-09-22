package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.BlackHoleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlackHoleModel extends GeoModel<BlackHoleEntity> {
   public ResourceLocation getAnimationResource(BlackHoleEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/bh.animation.json");
   }

   public ResourceLocation getModelResource(BlackHoleEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/bh.geo.json");
   }

   public ResourceLocation getTextureResource(BlackHoleEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
