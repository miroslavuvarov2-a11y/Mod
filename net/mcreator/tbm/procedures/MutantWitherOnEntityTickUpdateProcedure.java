package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.MutantWitherEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class MutantWitherOnEntityTickUpdateProcedure {
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

         if (entity.getPersistentData().m_128459_("IA") == (double)150.0F) {
            entity.getPersistentData().m_128347_("t", entity.getPersistentData().m_128459_("t") + (double)1.0F);
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", entity.getPersistentData().m_128459_("IA") + (double)1.0F));
         }

         if (entity.getPersistentData().m_128459_("i") == (double)3.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 20, 4));
               }
            }

            if (entity instanceof Mob) {
               Mob _mobEnt = (Mob)entity;
               var10000 = _mobEnt.m_5448_();
            } else {
               var10000 = null;
            }

            if (var10000 != null) {
               entity.getPersistentData().m_128347_("iii", entity.getPersistentData().m_128459_("iii") + (double)1.0F);
            }

            if (entity.getPersistentData().m_128459_("iii") == (double)400.0F) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.BLACK_HOLE.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               for(int index0 = 0; index0 < 5; ++index0) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                     entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                     entityToSpawn.m_20874_(true);
                     _level.m_7967_(entityToSpawn);
                  }
               }

               entity.getPersistentData().m_128347_("iii", entity.getPersistentData().m_128459_("iii") + (double)1.0F);
               ThemutantmobsmodMod.queueServerWork(80, () -> {
                  entity.getPersistentData().m_128347_("iii", (double)0.0F);
                  entity.getPersistentData().m_128347_("IA", (double)0.0F);
                  entity.getPersistentData().m_128347_("i", (double)0.0F);
                  entity.getPersistentData().m_128347_("iia", (double)0.0F);
                  entity.getPersistentData().m_128347_("t", (double)0.0F);
                  entity.getPersistentData().m_128347_("tt", (double)0.0F);
               });
            }

            if (entity instanceof MutantWitherEntity) {
               ((MutantWitherEntity)entity).setAnimation("idle3");
            }
         }

         if (entity.getPersistentData().m_128459_("i") == (double)2.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 20, 3));
               }
            }

            if (entity instanceof Mob) {
               Mob _mobEnt = (Mob)entity;
               var10000 = _mobEnt.m_5448_();
            } else {
               var10000 = null;
            }

            if (var10000 != null) {
               entity.getPersistentData().m_128347_("iia", entity.getPersistentData().m_128459_("iia") + (double)1.0F);
            }

            if (entity instanceof MutantWitherEntity) {
               ((MutantWitherEntity)entity).setAnimation("idle2");
            }

            if (entity.getPersistentData().m_128459_("iia") == (double)100.0F) {
               entity.getPersistentData().m_128347_("tt", entity.getPersistentData().m_128459_("tt") + (double)1.0F);
               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("iia", entity.getPersistentData().m_128459_("iia") + (double)1.0F));
            }

            if (entity.getPersistentData().m_128459_("tt") == (double)5.0F) {
               entity.getPersistentData().m_128347_("iia", (double)1000.0F);
               ThemutantmobsmodMod.queueServerWork(2, () -> entity.getPersistentData().m_128347_("iia", (double)1000.0F));
               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("tt", (double)0.0F));
               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("i", (double)3.0F));

               for(int index1 = 0; index1 < 5; ++index1) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                     entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                     entityToSpawn.m_20874_(true);
                     _level.m_7967_(entityToSpawn);
                  }
               }
            }

            if (entity.getPersistentData().m_128459_("iia") == (double)200.0F) {
               for(int index2 = 0; index2 < 5; ++index2) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                     entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                     entityToSpawn.m_20874_(true);
                     _level.m_7967_(entityToSpawn);
                  }
               }

               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.TOWEROFMUTANTWITHER_2.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               ThemutantmobsmodMod.queueServerWork(20, () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.TOWEROFMUTANTWITHER_2.get()).m_262496_(_level, BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10)), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }

                  ThemutantmobsmodMod.queueServerWork(20, () -> {
                     if (world instanceof ServerLevel _level) {
                        Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.TOWEROFMUTANTWITHER_2.get()).m_262496_(_level, BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10)), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                           entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                        }
                     }

                  });
               });
               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("iia", (double)0.0F));
            }
         }

         if (entity.getPersistentData().m_128459_("t") == (double)5.0F) {
            for(int index3 = 0; index3 < 5; ++index3) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                  entityToSpawn.m_20874_(true);
                  _level.m_7967_(entityToSpawn);
               }
            }

            ThemutantmobsmodMod.queueServerWork(2, () -> entity.getPersistentData().m_128347_("IA", (double)1000.0F));
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("t", (double)0.0F));
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("i", (double)2.0F));
            entity.getPersistentData().m_128347_("IA", (double)1000.0F);
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)200.0F) {
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 201, 203));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)201.0F) {
            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.HEADOFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.HEADOFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mbshot")), SoundSource.NEUTRAL, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mbshot")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 2, 3));
               }
            }

            for(int index4 = 0; index4 < 5; ++index4) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                  entityToSpawn.m_20874_(true);
                  _level.m_7967_(entityToSpawn);
               }
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)202.0F) {
            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.HANDOFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.HANDOFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.HANDOFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.HANDOFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));

            for(int index5 = 0; index5 < 5; ++index5) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                  entityToSpawn.m_20874_(true);
                  _level.m_7967_(entityToSpawn);
               }
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)203.0F) {
            for(int index6 = 0; index6 < 5; ++index6) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z)));
                  entityToSpawn.m_20874_(true);
                  _level.m_7967_(entityToSpawn);
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.TOWEROFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.TOWEROFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10)), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               ThemutantmobsmodMod.queueServerWork(20, () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.TOWEROFMUTANTWITHER.get()).m_262496_(_level, BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10)), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }

               });
            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

      }
   }
}
