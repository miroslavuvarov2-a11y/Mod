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

public class Modelat<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("themutantmobsmod", "modelat"), "main");
   public final ModelPart bone;
   public final ModelPart bone2;
   public final ModelPart bone3;

   public Modelat(ModelPart root) {
      this.bone = root.m_171324_("bone");
      this.bone2 = root.m_171324_("bone2");
      this.bone3 = root.m_171324_("bone3");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      partdefinition.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.0F, -54.0F, -4.0F, 8.0F, 54.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
      partdefinition.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-2.0F, -34.0F, -3.0F, 6.0F, 34.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -30.0F, 0.0F, -0.2986F, -0.0651F, -0.2084F));
      partdefinition.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(32, 40).m_171488_(-1.0F, -34.0F, -2.0F, 4.0F, 34.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-7.0F, -61.0F, 10.0F, -0.549F, -0.2324F, -0.8492F));
      return LayerDefinition.m_171565_(meshdefinition, 128, 128);
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.bone.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone3.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
