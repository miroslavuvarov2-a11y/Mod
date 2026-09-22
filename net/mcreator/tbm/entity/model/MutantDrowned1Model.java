package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantDrowned1Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantDrowned1Model extends GeoModel<MutantDrowned1Entity> {
   public ResourceLocation getAnimationResource(MutantDrowned1Entity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/md.animation.json");
   }

   public ResourceLocation getModelResource(MutantDrowned1Entity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/md.geo.json");
   }

   public ResourceLocation getTextureResource(MutantDrowned1Entity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
