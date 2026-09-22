package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.level.block.Blocks;

public class EctileFlyingTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50083_.m_49966_(), 3);
      ThemutantmobsmodMod.queueServerWork(20, () -> {
         if (world instanceof Level _level) {
            if (!_level.m_5776_()) {
               _level.m_254849_((Entity)null, x, y, z, 3.0F, ExplosionInteraction.NONE);
            }
         }

      });
   }
}
