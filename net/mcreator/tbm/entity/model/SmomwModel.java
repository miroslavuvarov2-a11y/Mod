package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.SmomwEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SmomwModel extends GeoModel<SmomwEntity> {
   public ResourceLocation getAnimationResource(SmomwEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/smomw.animation.json");
   }

   public ResourceLocation getModelResource(SmomwEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/smomw.geo.json");
   }

   public ResourceLocation getTextureResource(SmomwEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
