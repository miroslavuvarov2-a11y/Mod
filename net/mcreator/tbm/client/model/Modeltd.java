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

public class Modeltd<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("themutantmobsmod", "modeltd"), "main");
   public final ModelPart arm;

   public Modeltd(ModelPart root) {
      this.arm = root.m_171324_("arm");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition arm = partdefinition.m_171599_("arm", CubeListBuilder.m_171558_(), PartPose.m_171423_(-26.0F, -3.746F, 26.1322F, 3.1416F, -1.5272F, 3.1416F));
      PartDefinition rarm2 = arm.m_171599_("rarm2", CubeListBuilder.m_171558_(), PartPose.m_171419_(-24.0F, 0.0F, -11.0F));
      PartDefinition bone10 = rarm2.m_171599_("bone10", CubeListBuilder.m_171558_().m_171514_(150, 41).m_171488_(-7.0F, -32.0F, -42.0F, 4.0F, 0.0F, 59.0F, new CubeDeformation(0.0F)).m_171514_(150, 41).m_171488_(-7.0F, -33.0F, -42.0F, 4.0F, 0.0F, 59.0F, new CubeDeformation(0.0F)).m_171514_(150, 41).m_171488_(-7.0F, -34.0F, -42.0F, 4.0F, 0.0F, 59.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 26.0F, -49.0F, -1.5708F, 0.0F, 0.0F));
      bone10.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(101, 94).m_171488_(-1.0F, -28.0F, 46.0F, 13.0F, 2.0F, 13.0F, new CubeDeformation(4.0F)).m_171514_(101, 94).m_171488_(-1.0F, -29.0F, 46.0F, 13.0F, 2.0F, 13.0F, new CubeDeformation(4.0F)).m_171514_(101, 94).m_171488_(-1.0F, -30.0F, 46.0F, 13.0F, 3.0F, 13.0F, new CubeDeformation(4.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 512, 512);
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.arm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
