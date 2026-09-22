package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.GigaillagerV2Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GigaillagerV2Model extends GeoModel<GigaillagerV2Entity> {
   public ResourceLocation getAnimationResource(GigaillagerV2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/dark_magicv2.animation.json");
   }

   public ResourceLocation getModelResource(GigaillagerV2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/dark_magicv2.geo.json");
   }

   public ResourceLocation getTextureResource(GigaillagerV2Entity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
