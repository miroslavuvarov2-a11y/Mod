package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modeld7;
import net.mcreator.tbm.entity.WeaponofmutantwardenEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WeaponofmutantwardenRenderer extends MobRenderer<WeaponofmutantwardenEntity, Modeld7<WeaponofmutantwardenEntity>> {
   public WeaponofmutantwardenRenderer(EntityRendererProvider.Context context) {
      super(context, new Modeld7(context.m_174023_(Modeld7.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(WeaponofmutantwardenEntity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/textured1.png");
   }
}
