package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantenderdragonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantenderdragonModel extends GeoModel<MutantenderdragonEntity> {
   public ResourceLocation getAnimationResource(MutantenderdragonEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mutantenderdragon.animation.json");
   }

   public ResourceLocation getModelResource(MutantenderdragonEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mutantenderdragon.geo.json");
   }

   public ResourceLocation getTextureResource(MutantenderdragonEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
