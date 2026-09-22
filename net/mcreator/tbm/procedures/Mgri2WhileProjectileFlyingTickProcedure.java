package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class Mgri2WhileProjectileFlyingTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_49991_.m_49966_(), 3);
      ThemutantmobsmodMod.queueServerWork(300, () -> world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_49990_.m_49966_(), 3));
      ThemutantmobsmodMod.queueServerWork(301, () -> world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50652_.m_49966_(), 3));
   }
}
