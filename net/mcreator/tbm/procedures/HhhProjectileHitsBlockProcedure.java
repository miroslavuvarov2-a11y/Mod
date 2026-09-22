package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class HhhProjectileHitsBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      world.m_7731_(BlockPos.m_274561_(x, y + (double)1.0F, z), Blocks.f_50033_.m_49966_(), 3);
      ThemutantmobsmodMod.queueServerWork(200, () -> world.m_7731_(BlockPos.m_274561_(x, y + (double)1.0F, z), Blocks.f_50016_.m_49966_(), 3));
   }
}
