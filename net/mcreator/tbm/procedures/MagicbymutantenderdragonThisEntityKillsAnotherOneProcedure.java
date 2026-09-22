package net.mcreator.tbm.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class MagicbymutantenderdragonThisEntityKillsAnotherOneProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50083_.m_49966_(), 3);
   }
}
