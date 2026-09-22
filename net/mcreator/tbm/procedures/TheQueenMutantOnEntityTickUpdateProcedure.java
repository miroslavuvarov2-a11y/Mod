package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.TheQueenMutantEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class TheQueenMutantOnEntityTickUpdateProcedure {
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

         if (entity.getPersistentData().m_128459_("IA") == (double)300.0F) {
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 301, 306));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)301.0F) {
            if (entity instanceof TheQueenMutantEntity) {
               ((TheQueenMutantEntity)entity).setAnimation("a1");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof TheQueenMutantEntity) {
                  ((TheQueenMutantEntity)entity).setAnimation("a1");
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  if (entity instanceof TheQueenMutantEntity) {
                     ((TheQueenMutantEntity)entity).setAnimation("a1");
                  }

                  ThemutantmobsmodMod.queueServerWork(1, () -> {
                     if (entity instanceof TheQueenMutantEntity) {
                        ((TheQueenMutantEntity)entity).setAnimation("a1");
                     }

                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               QsProcedure.execute(world, x, y, z, entity);
               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  QsProcedure.execute(world, x, y, z, entity);
                  ThemutantmobsmodMod.queueServerWork(5, () -> {
                     QsProcedure.execute(world, x, y, z, entity);
                     ThemutantmobsmodMod.queueServerWork(5, () -> {
                        QsProcedure.execute(world, x, y, z, entity);
                        ThemutantmobsmodMod.queueServerWork(5, () -> {
                           QsProcedure.execute(world, x, y, z, entity);
                           ThemutantmobsmodMod.queueServerWork(5, () -> {
                              QsProcedure.execute(world, x, y, z, entity);
                              ThemutantmobsmodMod.queueServerWork(5, () -> {
                                 QsProcedure.execute(world, x, y, z, entity);
                                 ThemutantmobsmodMod.queueServerWork(5, () -> {
                                    QsProcedure.execute(world, x, y, z, entity);
                                    ThemutantmobsmodMod.queueServerWork(5, () -> QsProcedure.execute(world, x, y, z, entity));
                                 });
                              });
                           });
                        });
                     });
                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)302.0F) {
            if (entity instanceof TheQueenMutantEntity) {
               ((TheQueenMutantEntity)entity).setAnimation("a2");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof TheQueenMutantEntity) {
                  ((TheQueenMutantEntity)entity).setAnimation("a2");
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  if (entity instanceof TheQueenMutantEntity) {
                     ((TheQueenMutantEntity)entity).setAnimation("a2");
                  }

                  ThemutantmobsmodMod.queueServerWork(1, () -> {
                     if (entity instanceof TheQueenMutantEntity) {
                        ((TheQueenMutantEntity)entity).setAnimation("a2");
                     }

                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(20, () -> QlProcedure.execute(world, x, y, z, entity));
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)303.0F) {
            if (entity instanceof TheQueenMutantEntity) {
               ((TheQueenMutantEntity)entity).setAnimation("a3");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof TheQueenMutantEntity) {
                  ((TheQueenMutantEntity)entity).setAnimation("a3");
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  if (entity instanceof TheQueenMutantEntity) {
                     ((TheQueenMutantEntity)entity).setAnimation("a3");
                  }

                  ThemutantmobsmodMod.queueServerWork(1, () -> {
                     if (entity instanceof TheQueenMutantEntity) {
                        ((TheQueenMutantEntity)entity).setAnimation("a3");
                     }

                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(15, () -> QeProcedure.execute(world, x, y, z, entity));
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)304.0F) {
            if (entity instanceof TheQueenMutantEntity) {
               ((TheQueenMutantEntity)entity).setAnimation("a4");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof TheQueenMutantEntity) {
                  ((TheQueenMutantEntity)entity).setAnimation("a4");
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  if (entity instanceof TheQueenMutantEntity) {
                     ((TheQueenMutantEntity)entity).setAnimation("a4");
                  }

                  ThemutantmobsmodMod.queueServerWork(1, () -> {
                     if (entity instanceof TheQueenMutantEntity) {
                        ((TheQueenMutantEntity)entity).setAnimation("a4");
                     }

                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               for(int index0 = 0; index0 < 3; ++index0) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20518_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               for(int index1 = 0; index1 < 5; ++index1) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20566_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               for(int index2 = 0; index2 < 7; ++index2) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20493_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               entity.getPersistentData().m_128347_("sm", (double)Mth.m_216271_(RandomSource.m_216327_(), 1, 6));
            });
            if (entity.getPersistentData().m_128459_("sm") == (double)6.0F) {
               for(int index3 = 0; index3 < 1; ++index3) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_DROWNED.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("sm", (double)0.0F));
            }

            if (entity.getPersistentData().m_128459_("sm") == (double)1.0F) {
               for(int index4 = 0; index4 < 5; ++index4) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_ZOMBIE_VILLAGER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("sm", (double)0.0F));
            }

            if (entity.getPersistentData().m_128459_("sm") == (double)2.0F) {
               for(int index5 = 0; index5 < 1; ++index5) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_ZOMBIFIED_PIGLIN.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("sm", (double)0.0F));
            }

            if (entity.getPersistentData().m_128459_("sm") == (double)3.0F) {
               for(int index6 = 0; index6 < 1; ++index6) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_ZOGLIN.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("sm", (double)0.0F));
            }

            if (entity.getPersistentData().m_128459_("sm") == (double)4.0F) {
               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("sm", (double)0.0F));

               for(int index7 = 0; index7 < 1; ++index7) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.MUTANT_RAVAGER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }
            }

            if (entity.getPersistentData().m_128459_("sm") == (double)5.0F) {
               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("sm", (double)0.0F));

               for(int index8 = 0; index8 < 3; ++index8) {
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.BOAT.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)305.0F) {
            if (entity instanceof TheQueenMutantEntity) {
               ((TheQueenMutantEntity)entity).setAnimation("a5");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof TheQueenMutantEntity) {
                  ((TheQueenMutantEntity)entity).setAnimation("a5");
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  if (entity instanceof TheQueenMutantEntity) {
                     ((TheQueenMutantEntity)entity).setAnimation("a5");
                  }

                  ThemutantmobsmodMod.queueServerWork(1, () -> {
                     if (entity instanceof TheQueenMutantEntity) {
                        ((TheQueenMutantEntity)entity).setAnimation("a5");
                     }

                  });
               });
            });
            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.THETRUEESSENCE.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)5.0F, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)306.0F) {
            if (entity instanceof TheQueenMutantEntity) {
               ((TheQueenMutantEntity)entity).setAnimation("a6");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof TheQueenMutantEntity) {
                  ((TheQueenMutantEntity)entity).setAnimation("a6");
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  if (entity instanceof TheQueenMutantEntity) {
                     ((TheQueenMutantEntity)entity).setAnimation("a6");
                  }

                  ThemutantmobsmodMod.queueServerWork(1, () -> {
                     if (entity instanceof TheQueenMutantEntity) {
                        ((TheQueenMutantEntity)entity).setAnimation("a6");
                     }

                  });
               });
            });
            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.PB.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)100.0F, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

      }
   }
}
