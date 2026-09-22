package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.TheGuardOfMutantBoggedEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TheGuardOfMutantBoggedModel extends GeoModel<TheGuardOfMutantBoggedEntity> {
   public ResourceLocation getAnimationResource(TheGuardOfMutantBoggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/gomb.animation.json");
   }

   public ResourceLocation getModelResource(TheGuardOfMutantBoggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/gomb.geo.json");
   }

   public ResourceLocation getTextureResource(TheGuardOfMutantBoggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
