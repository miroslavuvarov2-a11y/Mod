package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class Sw2ProjectileHitsPlayerProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.SW_1.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)10.0F, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      ThemutantmobsmodMod.queueServerWork(20, () -> {
         if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.SW_1.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)10.0F, z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
            }
         }

      });
      ThemutantmobsmodMod.queueServerWork(40, () -> {
         if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.SW_1.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)10.0F, z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
            }
         }

      });
      ThemutantmobsmodMod.queueServerWork(60, () -> {
         if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.SW_1.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)10.0F, z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
            }
         }

      });
      ThemutantmobsmodMod.queueServerWork(80, () -> {
         if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.SW_1.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)10.0F, z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
               entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
            }
         }

      });
   }
}
