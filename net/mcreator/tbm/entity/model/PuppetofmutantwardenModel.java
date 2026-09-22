package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.PuppetofmutantwardenEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PuppetofmutantwardenModel extends GeoModel<PuppetofmutantwardenEntity> {
   public ResourceLocation getAnimationResource(PuppetofmutantwardenEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/pomw.animation.json");
   }

   public ResourceLocation getModelResource(PuppetofmutantwardenEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/pomw.geo.json");
   }

   public ResourceLocation getTextureResource(PuppetofmutantwardenEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
