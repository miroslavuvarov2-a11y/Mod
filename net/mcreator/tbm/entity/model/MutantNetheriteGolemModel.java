package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantNetheriteGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantNetheriteGolemModel extends GeoModel<MutantNetheriteGolemEntity> {
   public ResourceLocation getAnimationResource(MutantNetheriteGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mngrm.animation.json");
   }

   public ResourceLocation getModelResource(MutantNetheriteGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mngrm.geo.json");
   }

   public ResourceLocation getTextureResource(MutantNetheriteGolemEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
