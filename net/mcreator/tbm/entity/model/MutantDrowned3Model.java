package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantDrowned3Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantDrowned3Model extends GeoModel<MutantDrowned3Entity> {
   public ResourceLocation getAnimationResource(MutantDrowned3Entity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/md.animation.json");
   }

   public ResourceLocation getModelResource(MutantDrowned3Entity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/md.geo.json");
   }

   public ResourceLocation getTextureResource(MutantDrowned3Entity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
