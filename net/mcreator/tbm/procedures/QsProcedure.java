package net.mcreator.tbm.procedures;

import net.mcreator.tbm.entity.ThetrueessenceEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class QsProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         double length = (double)55.0F;
         double width = (double)20.0F;
         double height = (double)30.0F;
         Vec3 lookVec = entity.m_20154_().m_82541_();
         Vec3 sideVec = lookVec.m_82537_(new Vec3((double)0.0F, (double)1.0F, (double)0.0F)).m_82541_();
         if (sideVec.m_82556_() < 0.01) {
            sideVec = new Vec3((double)1.0F, (double)0.0F, (double)0.0F);
         }

         Vec3 upVec = sideVec.m_82537_(lookVec).m_82541_();
         double searchRadius = Math.max(length, Math.max(width, height));

         for(Entity entityiterator : world.m_6443_(Entity.class, entity.m_20191_().m_82400_(searchRadius), (e) -> true)) {
            if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
               Vec3 relPos = entityiterator.m_20182_().m_82546_(entity.m_20182_());
               double forwardDist = relPos.m_82526_(lookVec);
               double sideDist = Math.abs(relPos.m_82526_(sideVec));
               double upDist = Math.abs(relPos.m_82526_(upVec));
               if (forwardDist >= (double)0.0F && forwardDist <= length && sideDist <= width / (double)2.0F && upDist <= height / (double)2.0F) {
                  entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 150.0F);
               }
            }
         }

      }
   }
}
