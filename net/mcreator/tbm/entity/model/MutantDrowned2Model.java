package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantDrowned2Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantDrowned2Model extends GeoModel<MutantDrowned2Entity> {
   public ResourceLocation getAnimationResource(MutantDrowned2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/md.animation.json");
   }

   public ResourceLocation getModelResource(MutantDrowned2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/md.geo.json");
   }

   public ResourceLocation getTextureResource(MutantDrowned2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
