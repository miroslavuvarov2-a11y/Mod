package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.BoatEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BoatModel extends GeoModel<BoatEntity> {
   public ResourceLocation getAnimationResource(BoatEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/boat.animation.json");
   }

   public ResourceLocation getModelResource(BoatEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/boat.geo.json");
   }

   public ResourceLocation getTextureResource(BoatEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
