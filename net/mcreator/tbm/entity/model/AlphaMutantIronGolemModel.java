package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.AlphaMutantIronGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AlphaMutantIronGolemModel extends GeoModel<AlphaMutantIronGolemEntity> {
   public ResourceLocation getAnimationResource(AlphaMutantIronGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/alphamutantirongolemv1.animation.json");
   }

   public ResourceLocation getModelResource(AlphaMutantIronGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/alphamutantirongolemv1.geo.json");
   }

   public ResourceLocation getTextureResource(AlphaMutantIronGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
