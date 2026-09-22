package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.PBEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PBModel extends GeoModel<PBEntity> {
   public ResourceLocation getAnimationResource(PBEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/pb.animation.json");
   }

   public ResourceLocation getModelResource(PBEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/pb.geo.json");
   }

   public ResourceLocation getTextureResource(PBEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
