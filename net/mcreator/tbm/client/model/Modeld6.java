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

public class Modeld6<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("themutantmobsmod", "modeld_6"), "main");
   public final ModelPart bone3;
   public final ModelPart bone2;
   public final ModelPart bone;
   public final ModelPart bone4;

   public Modeld6(ModelPart root) {
      this.bone3 = root.m_171324_("bone3");
      this.bone2 = this.bone3.m_171324_("bone2");
      this.bone = this.bone3.m_171324_("bone");
      this.bone4 = this.bone3.m_171324_("bone4");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition bone3 = partdefinition.m_171599_("bone3", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 3.1416F));
      bone3.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(136, 140).m_171488_(-3.0F, -4.0F, -26.0F, 6.0F, 4.0F, 50.0F, new CubeDeformation(0.0F)).m_171514_(128, 194).m_171488_(-3.0F, -8.0F, -37.0F, 6.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).m_171514_(192, 194).m_171488_(-3.0F, -8.0F, 11.0F, 6.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).m_171514_(46, 224).m_171488_(-3.0F, -65.0F, -43.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(224, 63).m_171488_(-3.0F, -65.0F, 26.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(224, 84).m_171488_(-3.0F, -12.0F, -43.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(92, 224).m_171488_(-3.0F, -12.0F, 26.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(186, 0).m_171488_(-3.0F, -61.0F, -45.0F, 6.0F, 49.0F, 13.0F, new CubeDeformation(0.0F)).m_171514_(186, 62).m_171488_(-3.0F, -61.0F, 32.0F, 6.0F, 49.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
      bone3.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(24, 140).m_171488_(-3.0F, -4.0F, -26.0F, 6.0F, 4.0F, 50.0F, new CubeDeformation(0.0F)).m_171514_(0, 194).m_171488_(-3.0F, -8.0F, -37.0F, 6.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).m_171514_(64, 194).m_171488_(-3.0F, -8.0F, 11.0F, 6.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).m_171514_(0, 224).m_171488_(-3.0F, -65.0F, -43.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(224, 42).m_171488_(-3.0F, -65.0F, 26.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(224, 0).m_171488_(-3.0F, -12.0F, -43.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(224, 21).m_171488_(-3.0F, -12.0F, 26.0F, 6.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).m_171514_(148, 0).m_171488_(-3.0F, -61.0F, -45.0F, 6.0F, 49.0F, 13.0F, new CubeDeformation(0.0F)).m_171514_(148, 62).m_171488_(-3.0F, -61.0F, 32.0F, 6.0F, 49.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      PartDefinition bone4 = bone3.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.0F, -181.0F, -4.0F, 5.0F, 177.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(24, 0).m_171488_(-2.0F, -194.0F, -31.0F, 5.0F, 13.0F, 57.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      bone4.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(24, 70).m_171488_(-2.0F, -13.0F, -31.0F, 5.0F, 13.0F, 57.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.0F, -181.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 512, 512);
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.bone3.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
