package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class YtProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel _level0) {
         if (_level0.m_8843_(BlockPos.m_274561_(x, y, z))) {
            ThemutantmobsmodMod.queueServerWork(200, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_DROWNED.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANTSTRAY.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               ThemutantmobsmodMod.queueServerWork(2000, () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.GIGAILLAGER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_RAVAGER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }

               });
            });
         }
      }

   }
}
