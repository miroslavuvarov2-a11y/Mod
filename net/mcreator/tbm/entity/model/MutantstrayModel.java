package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantstrayEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantstrayModel extends GeoModel<MutantstrayEntity> {
   public ResourceLocation getAnimationResource(MutantstrayEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutantstray.animation.json");
   }

   public ResourceLocation getModelResource(MutantstrayEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutantstray.geo.json");
   }

   public ResourceLocation getTextureResource(MutantstrayEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
