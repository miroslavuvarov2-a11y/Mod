package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantPiglinBruteEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantPiglinBruteModel extends GeoModel<MutantPiglinBruteEntity> {
   public ResourceLocation getAnimationResource(MutantPiglinBruteEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutantpiglinbrute.animation.json");
   }

   public ResourceLocation getModelResource(MutantPiglinBruteEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutantpiglinbrute.geo.json");
   }

   public ResourceLocation getTextureResource(MutantPiglinBruteEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
