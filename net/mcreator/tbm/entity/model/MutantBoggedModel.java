package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantBoggedEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantBoggedModel extends GeoModel<MutantBoggedEntity> {
   public ResourceLocation getAnimationResource(MutantBoggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutantbogged.animation.json");
   }

   public ResourceLocation getModelResource(MutantBoggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutantbogged.geo.json");
   }

   public ResourceLocation getTextureResource(MutantBoggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
