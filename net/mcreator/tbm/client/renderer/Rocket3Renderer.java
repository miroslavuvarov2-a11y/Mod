package net.mcreator.tbm.client.renderer;

import net.mcreator.tbm.client.model.Modelrocket2;
import net.mcreator.tbm.entity.Rocket3Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class Rocket3Renderer extends MobRenderer<Rocket3Entity, Modelrocket2<Rocket3Entity>> {
   public Rocket3Renderer(EntityRendererProvider.Context context) {
      super(context, new Modelrocket2(context.m_174023_(Modelrocket2.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(Rocket3Entity entity) {
      return new ResourceLocation("themutantmobsmod:textures/entities/rocket.png");
   }
}
