package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantDrownedEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantDrownedModel extends GeoModel<MutantDrownedEntity> {
   public ResourceLocation getAnimationResource(MutantDrownedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/md.animation.json");
   }

   public ResourceLocation getModelResource(MutantDrownedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/md.geo.json");
   }

   public ResourceLocation getTextureResource(MutantDrownedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
