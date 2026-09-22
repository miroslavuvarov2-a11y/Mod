package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.ThetrueessenceEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ThetrueessenceModel extends GeoModel<ThetrueessenceEntity> {
   public ResourceLocation getAnimationResource(ThetrueessenceEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/the_true_essence.animation.json");
   }

   public ResourceLocation getModelResource(ThetrueessenceEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/the_true_essence.geo.json");
   }

   public ResourceLocation getTextureResource(ThetrueessenceEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
