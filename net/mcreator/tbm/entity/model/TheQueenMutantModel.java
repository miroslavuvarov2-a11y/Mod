package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.TheQueenMutantEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TheQueenMutantModel extends GeoModel<TheQueenMutantEntity> {
   public ResourceLocation getAnimationResource(TheQueenMutantEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/tqmt.animation.json");
   }

   public ResourceLocation getModelResource(TheQueenMutantEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/tqmt.geo.json");
   }

   public ResourceLocation getTextureResource(TheQueenMutantEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
