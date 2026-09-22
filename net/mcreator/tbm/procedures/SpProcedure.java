package net.mcreator.tbm.procedures;

import javax.annotation.Nullable;
import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.BlackHoleEntity;
import net.mcreator.tbm.entity.ThetrueessenceEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class SpProcedure {
   @SubscribeEvent
   public static void onEntitySpawned(EntityJoinLevelEvent event) {
      execute(event, event.getLevel(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity());
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute((Event)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof BlackHoleEntity) {
            ThemutantmobsmodMod.queueServerWork(100, () -> {
               for(int index0 = 0; index0 < 10; ++index0) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20497_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(80, () -> {
               entity.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 1000.0F);
               if (!entity.m_9236_().m_5776_()) {
                  entity.m_146870_();
               }

            });
         }

         if (entity instanceof ThetrueessenceEntity) {
            ThemutantmobsmodMod.queueServerWork(300, () -> {
               if (!entity.m_9236_().m_5776_()) {
                  entity.m_146870_();
               }

            });
         }

      }
   }
}
