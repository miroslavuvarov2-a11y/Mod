package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantZombiefiedPiglinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantZombiefiedPiglinModel extends GeoModel<MutantZombiefiedPiglinEntity> {
   public ResourceLocation getAnimationResource(MutantZombiefiedPiglinEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mzfp.animation.json");
   }

   public ResourceLocation getModelResource(MutantZombiefiedPiglinEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mzfp.geo.json");
   }

   public ResourceLocation getTextureResource(MutantZombiefiedPiglinEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
