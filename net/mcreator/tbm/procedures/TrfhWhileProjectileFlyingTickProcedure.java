package net.mcreator.tbm.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.LevelAccessor;

public class TrfhWhileProjectileFlyingTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      world.m_7106_(ParticleTypes.f_123745_, x, y, z, (double)0.0F, (double)1.0F, (double)0.0F);
   }
}
