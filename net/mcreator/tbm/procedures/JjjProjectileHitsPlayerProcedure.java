package net.mcreator.tbm.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;

public class JjjProjectileHitsPlayerProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20465_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof Level _level) {
         if (!_level.m_5776_()) {
            _level.m_254849_((Entity)null, x, y, z, 4.0F, ExplosionInteraction.NONE);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)1.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)2.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)3.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)4.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)5.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)6.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)7.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)8.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)9.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)1.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)2.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)3.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)4.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)5.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)6.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)7.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)8.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-8.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-2.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-1.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-3.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-4.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-5.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-6.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-7.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-1.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-2.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-3.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-4.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-5.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-6.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-7.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-8.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-9.0F, y, z), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-1.0F, y, z + (double)-1.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-2.0F, y, z + (double)-2.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-3.0F, y, z + (double)-3.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-4.0F, y, z + (double)-4.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-5.0F, y, z + (double)-5.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-6.0F, y, z + (double)-6.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-7.0F, y, z + (double)-7.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-8.0F, y, z + (double)-8.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-9.0F, y, z + (double)-9.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)1.0F, y, z + (double)1.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)2.0F, y, z + (double)2.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)3.0F, y, z + (double)3.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)4.0F, y, z + (double)4.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)5.0F, y, z + (double)5.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)6.0F, y, z + (double)6.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)7.0F, y, z + (double)7.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)8.0F, y, z + (double)8.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)9.0F, y, z + (double)9.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)1.0F, y, z + (double)-1.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)2.0F, y, z + (double)-2.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)3.0F, y, z + (double)-3.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)4.0F, y, z + (double)-4.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)5.0F, y, z + (double)-5.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)6.0F, y, z + (double)-6.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)7.0F, y, z + (double)-7.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)8.0F, y, z + (double)-8.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)9.0F, y, z + (double)-9.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-1.0F, y, z + (double)1.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-2.0F, y, z + (double)2.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-3.0F, y, z + (double)3.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-4.0F, y, z + (double)4.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-5.0F, y, z + (double)5.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-6.0F, y, z + (double)6.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-7.0F, y, z + (double)7.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-8.0F, y, z + (double)8.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

      if (world instanceof ServerLevel _level) {
         Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-9.0F, y, z + (double)9.0F), MobSpawnType.MOB_SUMMONED);
         if (entityToSpawn != null) {
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
         }
      }

   }
}
