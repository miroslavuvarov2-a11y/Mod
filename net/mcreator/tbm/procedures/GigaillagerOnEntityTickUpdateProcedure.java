package net.mcreator.tbm.procedures;

import java.util.Comparator;
import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.GigaillagerEntity;
import net.mcreator.tbm.entity.JjjEntity;
import net.mcreator.tbm.entity.LkEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class GigaillagerOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         LivingEntity var10000;
         if (entity instanceof Mob) {
            Mob _mobEnt = (Mob)entity;
            var10000 = _mobEnt.m_5448_();
         } else {
            var10000 = null;
         }

         if (var10000 != null) {
            entity.getPersistentData().m_128347_("IA", entity.getPersistentData().m_128459_("IA") + (double)1.0F);
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)200.0F) {
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 201, 208));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)201.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)170.0F));
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 30, 255));
               }
            }

            for(int index0 = 0; index0 < 20; ++index0) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)2.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)3.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)4.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)5.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)6.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)7.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)8.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)9.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)2.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)3.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)4.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)5.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)6.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)7.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)8.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-8.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-2.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-4.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-5.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-6.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)-7.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-2.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-3.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-4.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-5.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-6.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-7.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-8.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-9.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-2.0F, y, z + (double)-2.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-3.0F, y, z + (double)-3.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-4.0F, y, z + (double)-4.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-5.0F, y, z + (double)-5.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-6.0F, y, z + (double)-6.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-7.0F, y, z + (double)-7.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-8.0F, y, z + (double)-8.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-9.0F, y, z + (double)-9.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)2.0F, y, z + (double)2.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)3.0F, y, z + (double)3.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)4.0F, y, z + (double)4.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)5.0F, y, z + (double)5.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)6.0F, y, z + (double)6.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)7.0F, y, z + (double)7.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)8.0F, y, z + (double)8.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)9.0F, y, z + (double)9.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)2.0F, y, z + (double)-2.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)3.0F, y, z + (double)-3.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)4.0F, y, z + (double)-4.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)5.0F, y, z + (double)-5.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)6.0F, y, z + (double)-6.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)7.0F, y, z + (double)-7.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)8.0F, y, z + (double)-8.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)9.0F, y, z + (double)-9.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-2.0F, y, z + (double)2.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-3.0F, y, z + (double)3.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-4.0F, y, z + (double)4.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-5.0F, y, z + (double)5.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-6.0F, y, z + (double)6.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-7.0F, y, z + (double)7.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-8.0F, y, z + (double)8.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20569_.m_262496_(_level, BlockPos.m_274561_(x + (double)-9.0F, y, z + (double)9.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)202.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)100.0F));
            if (entity instanceof GigaillagerEntity) {
               ((GigaillagerEntity)entity).setAnimation("attack");
            }

            ThemutantmobsmodMod.queueServerWork(15, () -> {
               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)4.0F, y, z + (double)4.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-4.0F, y, z + (double)-4.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)4.0F, y, z + (double)-4.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-4.0F, y, z + (double)4.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-4.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)4.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)4.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)-4.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

               });
               ThemutantmobsmodMod.queueServerWork(10, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)7.0F, y, z + (double)7.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-7.0F, y, z + (double)-7.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)7.0F, y, z + (double)-7.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-7.0F, y, z + (double)7.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-7.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)7.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)7.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)-7.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

               });
            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)203.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof GigaillagerEntity) {
               ((GigaillagerEntity)entity).setAnimation("attack");
            }

            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new JjjEntity((EntityType)ThemutantmobsmodModEntities.JJJ.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     entityToSpawn.f_36705_ = Pickup.ALLOWED;
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 15.0F, 1);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            ThemutantmobsmodMod.queueServerWork(5, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new JjjEntity((EntityType)ThemutantmobsmodModEntities.JJJ.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(10, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new JjjEntity((EntityType)ThemutantmobsmodModEntities.JJJ.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(15, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new JjjEntity((EntityType)ThemutantmobsmodModEntities.JJJ.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new JjjEntity((EntityType)ThemutantmobsmodModEntities.JJJ.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)204.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)100.0F));
            if (entity instanceof GigaillagerEntity) {
               ((GigaillagerEntity)entity).setAnimation("attack3");
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }

            Vec3 _center = new Vec3(x, y, z);

            for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)6.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
               if (entityiterator != entity) {
                  ThemutantmobsmodMod.queueServerWork(20, () -> entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_286979_)), 300.0F));
               }
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:ga")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:ga")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)205.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)190.0F));
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 2, 3));
               }
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)206.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof GigaillagerEntity) {
               ((GigaillagerEntity)entity).setAnimation("spaw");
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               for(int index1 = 0; index1 < 5; ++index1) {
                  if (world instanceof ServerLevel _level) {
                     LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                     entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                     entityToSpawn.m_20874_(true);
                     _level.m_7967_(entityToSpawn);
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(25, () -> {
               for(int index2 = 0; index2 < 10; ++index2) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_ZOMBIE_VILLAGER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               for(int index3 = 0; index3 < 10; ++index3) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20493_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               for(int index4 = 0; index4 < 2; ++index4) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20518_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               for(int index5 = 0; index5 < 10; ++index5) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20491_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)207.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)100.0F));
            if (entity instanceof GigaillagerEntity) {
               ((GigaillagerEntity)entity).setAnimation("attack");
            }

            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new LkEntity((EntityType)ThemutantmobsmodModEntities.LK.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     entityToSpawn.f_36705_ = Pickup.ALLOWED;
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 1.0F, 1);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            ThemutantmobsmodMod.queueServerWork(5, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new LkEntity((EntityType)ThemutantmobsmodModEntities.LK.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 1.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(10, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new LkEntity((EntityType)ThemutantmobsmodModEntities.LK.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 1.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(15, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new LkEntity((EntityType)ThemutantmobsmodModEntities.LK.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 1.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new LkEntity((EntityType)ThemutantmobsmodModEntities.LK.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 1.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)208.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 150, 3));
               }
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 150, 4));
               }
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)1350.0F) {
            entity.getPersistentData().m_128347_("IA", (double)0.0F);
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)1350.0F) {
            entity.getPersistentData().m_128347_("IA", (double)0.0F);
         }

      }
   }
}
