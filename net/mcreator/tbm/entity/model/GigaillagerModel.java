package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.GigaillagerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GigaillagerModel extends GeoModel<GigaillagerEntity> {
   public ResourceLocation getAnimationResource(GigaillagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/gigaillager.animation.json");
   }

   public ResourceLocation getModelResource(GigaillagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/gigaillager.geo.json");
   }

   public ResourceLocation getTextureResource(GigaillagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
