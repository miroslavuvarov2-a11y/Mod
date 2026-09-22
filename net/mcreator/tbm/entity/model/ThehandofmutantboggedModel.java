package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.ThehandofmutantboggedEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ThehandofmutantboggedModel extends GeoModel<ThehandofmutantboggedEntity> {
   public ResourceLocation getAnimationResource(ThehandofmutantboggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/thomb.animation.json");
   }

   public ResourceLocation getModelResource(ThehandofmutantboggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/thomb.geo.json");
   }

   public ResourceLocation getTextureResource(ThehandofmutantboggedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
