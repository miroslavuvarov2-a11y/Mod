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

public class Modelgold2<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("themutantmobsmod", "modelgold_2"), "main");
   public final ModelPart bone;
   public final ModelPart bone2;
   public final ModelPart bone3;
   public final ModelPart bone9;
   public final ModelPart bone4;
   public final ModelPart bone5;
   public final ModelPart bone6;
   public final ModelPart bone7;
   public final ModelPart bone8;

   public Modelgold2(ModelPart root) {
      this.bone = root.m_171324_("bone");
      this.bone2 = root.m_171324_("bone2");
      this.bone3 = root.m_171324_("bone3");
      this.bone9 = root.m_171324_("bone9");
      this.bone4 = root.m_171324_("bone4");
      this.bone5 = root.m_171324_("bone5");
      this.bone6 = root.m_171324_("bone6");
      this.bone7 = root.m_171324_("bone7");
      this.bone8 = root.m_171324_("bone8");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition bone = partdefinition.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
      bone.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone2 = partdefinition.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(16.0F, 18.0F, 0.0F));
      bone2.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone3 = partdefinition.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(-16.0F, 18.0F, 0.0F));
      bone3.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone9 = partdefinition.m_171599_("bone9", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(-22.0F, 18.0F, -18.0F));
      bone9.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone4 = partdefinition.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(-2.0F, 30.0F, 16.0F));
      bone4.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone5 = partdefinition.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(-2.0F, 12.0F, -18.0F));
      bone5.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone6 = partdefinition.m_171599_("bone6", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(15.0F, 21.0F, -18.0F));
      bone6.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone7 = partdefinition.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(15.0F, 21.0F, 17.0F));
      bone7.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      PartDefinition bone8 = partdefinition.m_171599_("bone8", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -11.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 0).m_171488_(-4.0F, -11.0F, 3.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(4.0F)).m_171514_(5, 2).m_171488_(-5.0F, -12.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(5, 2).m_171488_(-5.0F, -3.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(3.0F)).m_171514_(0, 4).m_171488_(-1.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171419_(-18.0F, 10.0F, 17.0F));
      bone8.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-6.0F, -13.0F, -7.0F, 7.0F, 11.0F, 0.0F, new CubeDeformation(2.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 16, 16);
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.bone.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone3.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone9.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone4.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone5.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone6.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone7.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone8.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
