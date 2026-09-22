package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantIronGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantIronGolemModel extends GeoModel<MutantIronGolemEntity> {
   public ResourceLocation getAnimationResource(MutantIronGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mi.animation.json");
   }

   public ResourceLocation getModelResource(MutantIronGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mi.geo.json");
   }

   public ResourceLocation getTextureResource(MutantIronGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
