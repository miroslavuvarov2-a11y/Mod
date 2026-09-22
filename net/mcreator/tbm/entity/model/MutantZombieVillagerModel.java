package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.MutantZombieVillagerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MutantZombieVillagerModel extends GeoModel<MutantZombieVillagerEntity> {
   public ResourceLocation getAnimationResource(MutantZombieVillagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mzv.animation.json");
   }

   public ResourceLocation getModelResource(MutantZombieVillagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mzv.geo.json");
   }

   public ResourceLocation getTextureResource(MutantZombieVillagerEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
