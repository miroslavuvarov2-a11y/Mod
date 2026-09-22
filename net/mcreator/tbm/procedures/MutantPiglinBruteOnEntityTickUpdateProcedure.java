package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.LkEntity;
import net.mcreator.tbm.entity.MgriEntity;
import net.mcreator.tbm.entity.MutantPiglinBruteEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
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
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

public class MutantPiglinBruteOnEntityTickUpdateProcedure {
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
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 201, 210));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)201.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack2");
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 20, 255));
               }
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
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

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)12.0F, y, z + (double)12.0F, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)-12.0F, y, z + (double)-12.0F, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)12.0F, y, z + (double)-12.0F, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)-12.0F, y, z + (double)12.0F, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)-12.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)12.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z + (double)12.0F, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z + (double)-12.0F, 3.0F, ExplosionInteraction.NONE);
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)202.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack3");
            }

            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new MgriEntity((EntityType)ThemutantmobsmodModEntities.MGRI.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     entityToSpawn.f_36705_ = Pickup.ALLOWED;
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 30.0F, 5);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            ThemutantmobsmodMod.queueServerWork(10, () -> {
               Level projectileLevel1 = entity.m_9236_();
               if (!projectileLevel1.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new MgriEntity((EntityType)ThemutantmobsmodModEntities.MGRI.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel1, 30.0F, 5);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel1.m_7967_(_entityToSpawn);
               }

               ThemutantmobsmodMod.queueServerWork(10, () -> {
                  Level projectileLevel2 = entity.m_9236_();
                  if (!projectileLevel2.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new MgriEntity((EntityType)ThemutantmobsmodModEntities.MGRI.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           entityToSpawn.f_36705_ = Pickup.ALLOWED;
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel2, 30.0F, 5);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel2.m_7967_(_entityToSpawn);
                  }

               });
            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)100.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)203.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack4");
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 30, 255));
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 30, 255));
               }
            }

            ThemutantmobsmodMod.queueServerWork(30, () -> {
               if (entity instanceof LivingEntity _entity1) {
                  if (!_entity1.m_9236_().m_5776_()) {
                     _entity1.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 200, 4));
                  }
               }

               world.m_7731_(BlockPos.m_274561_(x + (double)5.0F, y + (double)2.0F, z), Blocks.f_49991_.m_49966_(), 3);
               world.m_7731_(BlockPos.m_274561_(x + (double)-5.0F, y + (double)2.0F, z), Blocks.f_49991_.m_49966_(), 3);
               world.m_7731_(BlockPos.m_274561_(x, y + (double)2.0F, z + (double)-5.0F), Blocks.f_49991_.m_49966_(), 3);
               world.m_7731_(BlockPos.m_274561_(x, y + (double)2.0F, z + (double)5.0F), Blocks.f_49991_.m_49966_(), 3);
            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)204.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack6");
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 60, 255));
               }
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  ThemutantmobsmodMod.queueServerWork(5, () -> {
                     if (world instanceof Level _level) {
                        if (!_level.m_5776_()) {
                           _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                        }
                     }

                     ThemutantmobsmodMod.queueServerWork(5, () -> {
                        if (world instanceof Level _level) {
                           if (!_level.m_5776_()) {
                              _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                           }
                        }

                        ThemutantmobsmodMod.queueServerWork(5, () -> {
                           if (world instanceof Level _level) {
                              if (!_level.m_5776_()) {
                                 _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                              }
                           }

                           ThemutantmobsmodMod.queueServerWork(5, () -> {
                              if (world instanceof Level _level) {
                                 if (!_level.m_5776_()) {
                                    _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                                 }
                              }

                              ThemutantmobsmodMod.queueServerWork(5, () -> {
                                 if (world instanceof Level _level) {
                                    if (!_level.m_5776_()) {
                                       _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                                    }
                                 }

                                 ThemutantmobsmodMod.queueServerWork(5, () -> {
                                    if (world instanceof Level _level) {
                                       if (!_level.m_5776_()) {
                                          _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                                       }
                                    }

                                    ThemutantmobsmodMod.queueServerWork(5, () -> {
                                       if (world instanceof Level _level) {
                                          if (!_level.m_5776_()) {
                                             _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -8, 8), 4.0F, ExplosionInteraction.NONE);
                                          }
                                       }

                                    });
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

         if (entity.getPersistentData().m_128459_("IA") == (double)205.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack7");
            }

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
                  })).getArrow(projectileLevel, 0.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  Level projectileLevel1 = entity.m_9236_();
                  if (!projectileLevel1.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new LkEntity((EntityType)ThemutantmobsmodModEntities.LK.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           entityToSpawn.f_36705_ = Pickup.ALLOWED;
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel1, 0.0F, 0);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0F, 0.0F);
                     projectileLevel1.m_7967_(_entityToSpawn);
                  }

                  ThemutantmobsmodMod.queueServerWork(1, () -> {
                     Level projectileLevel2 = entity.m_9236_();
                     if (!projectileLevel2.m_5776_()) {
                        Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new LkEntity((EntityType)ThemutantmobsmodModEntities.LK.get(), level);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              entityToSpawn.m_20225_(true);
                              entityToSpawn.f_36705_ = Pickup.ALLOWED;
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel2, 0.0F, 0);
                        _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0F, 0.0F);
                        projectileLevel2.m_7967_(_entityToSpawn);
                     }

                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)100.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)206.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack8");
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.BOAT.get()).m_262496_(_level, BlockPos.m_274561_(x + (double)5.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.BOAT.get()).m_262496_(_level, BlockPos.m_274561_(x + (double)-5.0F, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)207.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack9");
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19619_, 1, 1));
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
               entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -3, 3), y, z)));
               _level.m_7967_(entityToSpawn);
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
               entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -3, 3))));
               _level.m_7967_(entityToSpawn);
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
               entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -3, 3), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -3, 3))));
               _level.m_7967_(entityToSpawn);
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)150.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)208.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack10");
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 30, 255));
               }
            }

            ThemutantmobsmodMod.queueServerWork(30, () -> {
               if (entity instanceof LivingEntity _entity1) {
                  if (!_entity1.m_9236_().m_5776_()) {
                     _entity1.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 200, 2));
                  }
               }

               if (entity instanceof LivingEntity _entity1) {
                  if (!_entity1.m_9236_().m_5776_()) {
                     _entity1.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 200, 2));
                  }
               }

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
            ThemutantmobsmodMod.queueServerWork(5, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z, 3.0F, ExplosionInteraction.NONE);
                  }
               }

               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  ThemutantmobsmodMod.queueServerWork(5, () -> {
                     if (world instanceof Level _level) {
                        if (!_level.m_5776_()) {
                           _level.m_254849_((Entity)null, x, y, z, 3.0F, ExplosionInteraction.NONE);
                        }
                     }

                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)209.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack11");
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 20, 255));
               }
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 300, 3));
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            ThemutantmobsmodMod.queueServerWork(5, () -> {
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
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)210.0F) {
            if (entity instanceof MutantPiglinBruteEntity) {
               ((MutantPiglinBruteEntity)entity).setAnimation("attack5");
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (entity instanceof LivingEntity _entity1) {
                  if (!_entity1.m_9236_().m_5776_()) {
                     _entity1.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 100, 255));
                  }
               }

               for(int i = 0; i < 100; ++i) {
                  ThemutantmobsmodMod.queueServerWork(i, () -> {
                     Level projectileLevel = entity.m_9236_();
                     if (!projectileLevel.m_5776_()) {
                        Projectile _entityToSpawn = new SmallFireball(EntityType.f_20527_, projectileLevel);
                        _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                  });
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            });
         }
      }

   }
}
