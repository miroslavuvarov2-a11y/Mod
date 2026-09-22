package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.GreatSwordEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GreatSwordModel extends GeoModel<GreatSwordEntity> {
   public ResourceLocation getAnimationResource(GreatSwordEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/gsw.animation.json");
   }

   public ResourceLocation getModelResource(GreatSwordEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/gsw.geo.json");
   }

   public ResourceLocation getTextureResource(GreatSwordEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
