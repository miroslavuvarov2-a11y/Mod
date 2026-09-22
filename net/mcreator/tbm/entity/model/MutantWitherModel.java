package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantWitherEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantWitherModel extends GeoModel<MutantWitherEntity> {
   public ResourceLocation getAnimationResource(MutantWitherEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutantwitheru6.animation.json");
   }

   public ResourceLocation getModelResource(MutantWitherEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutantwitheru6.geo.json");
   }

   public ResourceLocation getTextureResource(MutantWitherEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
