package net.mcreator.tbm.entity.model;

import net.mcreator.tbm.entity.TheHandofMutantDrownedEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TheHandofMutantDrownedModel extends GeoModel<TheHandofMutantDrownedEntity> {
   public ResourceLocation getAnimationResource(TheHandofMutantDrownedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "animations/mdsh.animation.json");
   }

   public ResourceLocation getModelResource(TheHandofMutantDrownedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "geo/mdsh.geo.json");
   }

   public ResourceLocation getTextureResource(TheHandofMutantDrownedEntity entity) {
      return new ResourceLocation("themutantmobsmod", "textures/entities/" + entity.getTexture() + ".png");
   }
}
