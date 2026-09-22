package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantSnifferEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantSnifferModel extends GeoModel<MutantSnifferEntity> {
   public ResourceLocation getAnimationResource(MutantSnifferEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutantsniffer.animation.json");
   }

   public ResourceLocation getModelResource(MutantSnifferEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutantsniffer.geo.json");
   }

   public ResourceLocation getTextureResource(MutantSnifferEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
