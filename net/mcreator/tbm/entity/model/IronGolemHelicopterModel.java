package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.IronGolemHelicopterEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IronGolemHelicopterModel extends GeoModel<IronGolemHelicopterEntity> {
   public ResourceLocation getAnimationResource(IronGolemHelicopterEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/igh.animation.json");
   }

   public ResourceLocation getModelResource(IronGolemHelicopterEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/igh.geo.json");
   }

   public ResourceLocation getTextureResource(IronGolemHelicopterEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
