package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantWardenEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantWardenModel extends GeoModel<MutantWardenEntity> {
   public ResourceLocation getAnimationResource(MutantWardenEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mwrm21tft.animation.json");
   }

   public ResourceLocation getModelResource(MutantWardenEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mwrm21tft.geo.json");
   }

   public ResourceLocation getTextureResource(MutantWardenEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
