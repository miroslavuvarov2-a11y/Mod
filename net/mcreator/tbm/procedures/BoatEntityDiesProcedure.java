package net.mcreator.tbm.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class BoatEntityDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      for(int index0 = 0; index0 < 5; ++index0) {
         if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = EntityType.f_20512_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
            }
         }
      }

   }
}
