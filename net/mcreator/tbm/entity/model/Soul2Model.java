package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.Soul2Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class Soul2Model extends GeoModel<Soul2Entity> {
   public ResourceLocation getAnimationResource(Soul2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/smw.animation.json");
   }

   public ResourceLocation getModelResource(Soul2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/smw.geo.json");
   }

   public ResourceLocation getTextureResource(Soul2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
