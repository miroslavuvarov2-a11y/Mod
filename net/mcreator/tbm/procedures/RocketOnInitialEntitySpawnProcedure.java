package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.init.ThemutantmobsmodModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class RocketOnInitialEntitySpawnProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         ThemutantmobsmodMod.queueServerWork(400, () -> {
            if (entity instanceof LivingEntity _entity) {
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance((MobEffect)ThemutantmobsmodModMobEffects.EFFECTOF_MUTANT_WARDEN.get(), 1000, 3));
               }
            }

         });
      }
   }
}
