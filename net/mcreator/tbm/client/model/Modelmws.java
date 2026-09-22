package net.mcreator.tbm.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modelmws<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("themutantmobsmod", "modelmws"), "main");
   public final ModelPart bone;

   public Modelmws(ModelPart root) {
      this.bone = root.m_171324_("bone");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      partdefinition.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(0, 31).m_171488_(-13.0F, -12.0F, -11.0F, 24.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)).m_171514_(100, 0).m_171488_(-37.0F, -6.0F, -5.0F, 24.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(76, 123).m_171488_(11.0F, -6.0F, -5.0F, 24.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(92, 91).m_171488_(-7.0F, -6.0F, -37.0F, 12.0F, 6.0F, 26.0F, new CubeDeformation(0.0F)).m_171514_(0, 99).m_171488_(-7.0F, -6.0F, 11.0F, 12.0F, 6.0F, 26.0F, new CubeDeformation(0.0F)).m_171514_(0, 65).m_171488_(-13.0F, -68.0F, -11.0F, 24.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-14.0F, -75.0F, -12.0F, 26.0F, 7.0F, 24.0F, new CubeDeformation(0.0F)).m_171514_(92, 31).m_171488_(-9.0F, -56.0F, -8.0F, 16.0F, 44.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 256, 256);
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.bone.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
