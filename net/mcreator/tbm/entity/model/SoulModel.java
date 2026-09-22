package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.SoulEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SoulModel extends GeoModel<SoulEntity> {
   public ResourceLocation getAnimationResource(SoulEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/smw.animation.json");
   }

   public ResourceLocation getModelResource(SoulEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/smw.geo.json");
   }

   public ResourceLocation getTextureResource(SoulEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
