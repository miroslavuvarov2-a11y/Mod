package net.mcreator.tbm.procedures;

import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;

public class BlockGoldProjectileHitsBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof Level _level) {
         if (!_level.m_5776_()) {
            _level.m_254849_((Entity)null, x, y, z, 1.0F, ExplosionInteraction.NONE);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.GOLDS.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)10.0F, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

   }
}
