package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantZoglinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantZoglinModel extends GeoModel<MutantZoglinEntity> {
   public ResourceLocation getAnimationResource(MutantZoglinEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mzl2.animation.json");
   }

   public ResourceLocation getModelResource(MutantZoglinEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mzl2.geo.json");
   }

   public ResourceLocation getTextureResource(MutantZoglinEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
