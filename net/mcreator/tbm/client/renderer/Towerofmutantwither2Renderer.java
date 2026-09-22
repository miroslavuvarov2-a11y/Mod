package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelmws;
import net.mcreator.tbm.entity.Towerofmutantwither2Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class Towerofmutantwither2Renderer extends MobRenderer<Towerofmutantwither2Entity, Modelmws<Towerofmutantwither2Entity>> {
   public Towerofmutantwither2Renderer(EntityRendererProvider.Context context) {
      super(context, new Modelmws(context.m_174023_(Modelmws.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(Towerofmutantwither2Entity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/mws.png");
   }
}
