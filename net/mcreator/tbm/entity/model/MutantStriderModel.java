package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantStriderEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantStriderModel extends GeoModel<MutantStriderEntity> {
   public ResourceLocation getAnimationResource(MutantStriderEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutant_strider.animation.json");
   }

   public ResourceLocation getModelResource(MutantStriderEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutant_strider.geo.json");
   }

   public ResourceLocation getTextureResource(MutantStriderEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
