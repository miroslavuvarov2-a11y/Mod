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

public class ModelDeeet2<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("themutantmobsmod", "model_deeet_2"), "main");
   public final ModelPart bb_main;

   public ModelDeeet2(ModelPart root) {
      this.bb_main = root.m_171324_("bb_main");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition bb_main = partdefinition.m_171599_("bb_main", CubeListBuilder.m_171558_().m_171514_(85, 27).m_171488_(-2.0F, -58.0F, -13.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).m_171514_(64, 55).m_171488_(-3.0F, -54.0F, -9.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(84, 94).m_171488_(-24.0F, -58.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(98, 102).m_171488_(8.0F, -32.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(52, 66).m_171488_(20.0F, -54.0F, -2.0F, 5.0F, 27.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(102, 22).m_171488_(14.0F, -30.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 93).m_171488_(16.0F, -58.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 54).m_171488_(-2.0F, -50.0F, -2.0F, 4.0F, 46.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(80, 45).m_171488_(-6.0F, -54.0F, -2.0F, 12.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 54).m_171488_(-10.0F, -58.0F, -2.0F, 20.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(88, 86).m_171488_(-24.0F, -58.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(88, 78).m_171488_(16.0F, -58.0F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-24.0F, -62.0F, -2.0F, 49.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 16).m_171488_(-23.0F, -66.0F, -2.0F, 47.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 32).m_171488_(-20.0F, -68.0F, -2.0F, 42.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 44).m_171488_(-18.0F, -69.0F, -2.0F, 38.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(102, 12).m_171488_(-13.0F, -32.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(34, 62).m_171488_(-24.0F, -54.0F, -2.0F, 5.0F, 27.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(12, 101).m_171488_(-19.0F, -30.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(58, 97).m_171488_(-12.0F, -32.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(38, 97).m_171488_(-18.0F, -30.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(88, 72).m_171488_(-5.0F, -4.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(88, 66).m_171488_(-5.0F, 2.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 107).m_171488_(-5.0F, -2.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(104, 53).m_171488_(2.0F, -2.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(114, 70).m_171488_(-2.0F, 4.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(114, 48).m_171488_(-4.0F, 8.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(54, 113).m_171488_(0.0F, 8.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(44, 113).m_171488_(-2.0F, 12.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(34, 113).m_171488_(-2.0F, 24.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(110, 112).m_171488_(-4.0F, 20.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(100, 112).m_171488_(0.0F, 20.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(90, 112).m_171488_(-2.0F, 16.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(112, 84).m_171488_(-2.0F, 36.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(80, 112).m_171488_(-4.0F, 32.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(112, 61).m_171488_(0.0F, 32.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(70, 111).m_171488_(-2.0F, 28.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(24, 111).m_171488_(-2.0F, 48.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(14, 111).m_171488_(-4.0F, 44.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(110, 94).m_171488_(0.0F, 44.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(108, 42).m_171488_(-2.0F, 40.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(62, 107).m_171488_(-2.0F, 60.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(52, 107).m_171488_(-4.0F, 56.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(42, 107).m_171488_(0.0F, 56.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(32, 107).m_171488_(-2.0F, 52.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(85, 27).m_171488_(-2.0F, -58.0F, 2.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).m_171514_(64, 55).m_171488_(-3.0F, -54.0F, 2.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
      bb_main.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(78, 102).m_171488_(-21.0F, 28.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -61.0F, 6.0F, 0.0F, -1.5708F, 0.0F));
      bb_main.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(106, 0).m_171488_(-21.0F, 28.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -59.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
      bb_main.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(70, 66).m_171488_(-24.0F, 25.0F, -2.0F, 5.0F, 27.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.0F, -83.0F, -1.0F, 0.0F, -1.5272F, 0.0F));
      bb_main.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(20, 49).m_171488_(2.0F, 28.0F, -2.0F, 18.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -97.0F, 22.0F, 0.0F, 1.5708F, 0.0F));
      bb_main.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(22, 38).m_171488_(2.0F, 27.0F, -2.0F, 20.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -95.0F, 24.0F, 0.0F, 1.5708F, 0.0F));
      bb_main.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(26, 8).m_171488_(2.0F, 25.0F, -2.0F, 23.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -87.0F, 27.0F, 0.0F, 1.5708F, 0.0F));
      bb_main.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(25, 24).m_171488_(2.0F, 25.0F, -2.0F, 22.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -91.0F, 26.0F, 0.0F, 1.5708F, 0.0F));
      bb_main.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(78, 102).m_171488_(-21.0F, 28.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, -60.0F, 31.0F, 0.0F, -1.5708F, 0.0F));
      bb_main.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(106, 0).m_171488_(-21.0F, 28.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.0F, -58.0F, 37.0F, 0.0F, -1.5708F, 0.0F));
      bb_main.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(70, 66).m_171488_(-24.0F, 25.0F, -2.0F, 5.0F, 27.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.0F, -83.0F, 44.0F, 0.0F, -1.5272F, 0.0F));
      bb_main.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(26, 8).m_171488_(2.0F, 25.0F, -2.0F, 23.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 49).m_171488_(2.0F, 18.0F, -2.0F, 18.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(22, 38).m_171488_(2.0F, 19.0F, -2.0F, 20.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(25, 24).m_171488_(2.0F, 21.0F, -2.0F, 22.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -87.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 128, 128);
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.bb_main.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
