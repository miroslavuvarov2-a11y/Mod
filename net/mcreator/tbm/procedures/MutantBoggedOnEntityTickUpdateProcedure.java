package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.MbbEntity;
import net.mcreator.tbm.entity.MsbuEntity;
import net.mcreator.tbm.entity.MutantBoggedEntity;
import net.mcreator.tbm.entity.TrfhEntity;
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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraftforge.registries.ForgeRegistries;

public class MutantBoggedOnEntityTickUpdateProcedure {
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

         if (entity.getPersistentData().m_128459_("IA") == (double)149.0F) {
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 150, 157));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)156.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 1, 1));
               }
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 1));
               }
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 1, 1));
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               ThemutantmobsmodMod.queueServerWork(3, () -> {
                  ThemutantmobsmodMod.queueServerWork(3, () -> {
                     ThemutantmobsmodMod.queueServerWork(3, () -> {
                        ThemutantmobsmodMod.queueServerWork(3, () -> {
                           ThemutantmobsmodMod.queueServerWork(3, () -> {
                              ThemutantmobsmodMod.queueServerWork(3, () -> {
                                 ThemutantmobsmodMod.queueServerWork(3, () -> {
                                    ThemutantmobsmodMod.queueServerWork(3, () -> {
                                       ThemutantmobsmodMod.queueServerWork(3, () -> {
                                          ThemutantmobsmodMod.queueServerWork(3, () -> {
                                             ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                   Level projectileLevel = entity.m_9236_();
                                                   if (!projectileLevel.m_5776_()) {
                                                      Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                         public Projectile getArrow(Level level, float damage, int knockback) {
                                                            AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                                            entityToSpawn.m_36781_((double)damage);
                                                            entityToSpawn.m_36735_(knockback);
                                                            entityToSpawn.m_20225_(true);
                                                            return entityToSpawn;
                                                         }
                                                      })).getArrow(projectileLevel, 20.0F, 1);
                                                      _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                      _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                                      projectileLevel.m_7967_(_entityToSpawn);
                                                   }

                                                });
                                                Level projectileLevel = entity.m_9236_();
                                                if (!projectileLevel.m_5776_()) {
                                                   Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                      public Projectile getArrow(Level level, float damage, int knockback) {
                                                         AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                                         entityToSpawn.m_36781_((double)damage);
                                                         entityToSpawn.m_36735_(knockback);
                                                         entityToSpawn.m_20225_(true);
                                                         return entityToSpawn;
                                                      }
                                                   })).getArrow(projectileLevel, 20.0F, 1);
                                                   _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                   _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                                   projectileLevel.m_7967_(_entityToSpawn);
                                                }

                                             });
                                             Level projectileLevel = entity.m_9236_();
                                             if (!projectileLevel.m_5776_()) {
                                                Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                   public Projectile getArrow(Level level, float damage, int knockback) {
                                                      AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                                      entityToSpawn.m_36781_((double)damage);
                                                      entityToSpawn.m_36735_(knockback);
                                                      entityToSpawn.m_20225_(true);
                                                      return entityToSpawn;
                                                   }
                                                })).getArrow(projectileLevel, 20.0F, 1);
                                                _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                                projectileLevel.m_7967_(_entityToSpawn);
                                             }

                                          });
                                          Level projectileLevel = entity.m_9236_();
                                          if (!projectileLevel.m_5776_()) {
                                             Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                public Projectile getArrow(Level level, float damage, int knockback) {
                                                   AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                                   entityToSpawn.m_36781_((double)damage);
                                                   entityToSpawn.m_36735_(knockback);
                                                   entityToSpawn.m_20225_(true);
                                                   return entityToSpawn;
                                                }
                                             })).getArrow(projectileLevel, 20.0F, 1);
                                             _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                             _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                             projectileLevel.m_7967_(_entityToSpawn);
                                          }

                                       });
                                       Level projectileLevel = entity.m_9236_();
                                       if (!projectileLevel.m_5776_()) {
                                          Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                             public Projectile getArrow(Level level, float damage, int knockback) {
                                                AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                                entityToSpawn.m_36781_((double)damage);
                                                entityToSpawn.m_36735_(knockback);
                                                entityToSpawn.m_20225_(true);
                                                return entityToSpawn;
                                             }
                                          })).getArrow(projectileLevel, 20.0F, 1);
                                          _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                          _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                          projectileLevel.m_7967_(_entityToSpawn);
                                       }

                                    });
                                    Level projectileLevel = entity.m_9236_();
                                    if (!projectileLevel.m_5776_()) {
                                       Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                          public Projectile getArrow(Level level, float damage, int knockback) {
                                             AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                             entityToSpawn.m_36781_((double)damage);
                                             entityToSpawn.m_36735_(knockback);
                                             entityToSpawn.m_20225_(true);
                                             return entityToSpawn;
                                          }
                                       })).getArrow(projectileLevel, 20.0F, 1);
                                       _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                       _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                       projectileLevel.m_7967_(_entityToSpawn);
                                    }

                                 });
                                 Level projectileLevel = entity.m_9236_();
                                 if (!projectileLevel.m_5776_()) {
                                    Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                       public Projectile getArrow(Level level, float damage, int knockback) {
                                          AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                          entityToSpawn.m_36781_((double)damage);
                                          entityToSpawn.m_36735_(knockback);
                                          entityToSpawn.m_20225_(true);
                                          return entityToSpawn;
                                       }
                                    })).getArrow(projectileLevel, 20.0F, 1);
                                    _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                    _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                    projectileLevel.m_7967_(_entityToSpawn);
                                 }

                              });
                              Level projectileLevel = entity.m_9236_();
                              if (!projectileLevel.m_5776_()) {
                                 Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                    public Projectile getArrow(Level level, float damage, int knockback) {
                                       AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                       entityToSpawn.m_36781_((double)damage);
                                       entityToSpawn.m_36735_(knockback);
                                       entityToSpawn.m_20225_(true);
                                       return entityToSpawn;
                                    }
                                 })).getArrow(projectileLevel, 20.0F, 1);
                                 _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                 _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                                 projectileLevel.m_7967_(_entityToSpawn);
                              }

                           });
                           Level projectileLevel = entity.m_9236_();
                           if (!projectileLevel.m_5776_()) {
                              Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                 public Projectile getArrow(Level level, float damage, int knockback) {
                                    AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                    entityToSpawn.m_36781_((double)damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    return entityToSpawn;
                                 }
                              })).getArrow(projectileLevel, 20.0F, 1);
                              _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                              _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                              projectileLevel.m_7967_(_entityToSpawn);
                           }

                        });
                        Level projectileLevel = entity.m_9236_();
                        if (!projectileLevel.m_5776_()) {
                           Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                              public Projectile getArrow(Level level, float damage, int knockback) {
                                 AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                                 entityToSpawn.m_36781_((double)damage);
                                 entityToSpawn.m_36735_(knockback);
                                 entityToSpawn.m_20225_(true);
                                 return entityToSpawn;
                              }
                           })).getArrow(projectileLevel, 20.0F, 1);
                           _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                           _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                           projectileLevel.m_7967_(_entityToSpawn);
                        }

                     });
                     Level projectileLevel = entity.m_9236_();
                     if (!projectileLevel.m_5776_()) {
                        Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              entityToSpawn.m_20225_(true);
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel, 20.0F, 1);
                        _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                  });
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 20.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new TrfhEntity((EntityType)ThemutantmobsmodModEntities.TRFH.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 20.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("attack7");
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)155.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("attack3");
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 120, 3));
                  }
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 60, 255));
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)157.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("summon");
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               for(int index0 = 0; index0 < 10; ++index0) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.THE_GUARD_OF_MUTANT_BOGGED.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)154.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("summon");
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               for(int index1 = 0; index1 < 5; ++index1) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.THEHANDOFMUTANTBOGGED.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)153.0F) {
            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("attack2");
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crossbow.loading_end")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crossbow.loading_end")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }

            ThemutantmobsmodMod.queueServerWork(20, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new MbbEntity((EntityType)ThemutantmobsmodModEntities.MBB.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 3));
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mbshot")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mbshot")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)152.0F) {
            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("attack5");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            ThemutantmobsmodMod.queueServerWork(15, () -> {
               if (world instanceof ServerLevel projectileLevel) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new MsbuEntity((EntityType)ThemutantmobsmodModEntities.MSBU.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 1);
                  _entityToSpawn.m_6034_(x, y, z);
                  _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  ThemutantmobsmodMod.queueServerWork(5, () -> {
                     ThemutantmobsmodMod.queueServerWork(5, () -> {
                        ThemutantmobsmodMod.queueServerWork(5, () -> {
                           ThemutantmobsmodMod.queueServerWork(5, () -> {
                              if (world instanceof ServerLevel projectileLevel) {
                                 Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                    public Projectile getArrow(Level level, float damage, int knockback) {
                                       AbstractArrow entityToSpawn = new MsbuEntity((EntityType)ThemutantmobsmodModEntities.MSBU.get(), level);
                                       entityToSpawn.m_36781_((double)damage);
                                       entityToSpawn.m_36735_(knockback);
                                       entityToSpawn.m_20225_(true);
                                       return entityToSpawn;
                                    }
                                 })).getArrow(projectileLevel, 5.0F, 1);
                                 _entityToSpawn.m_6034_(x, y, z);
                                 _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                                 projectileLevel.m_7967_(_entityToSpawn);
                              }

                           });
                           if (world instanceof ServerLevel projectileLevel) {
                              Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                 public Projectile getArrow(Level level, float damage, int knockback) {
                                    AbstractArrow entityToSpawn = new MsbuEntity((EntityType)ThemutantmobsmodModEntities.MSBU.get(), level);
                                    entityToSpawn.m_36781_((double)damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    return entityToSpawn;
                                 }
                              })).getArrow(projectileLevel, 5.0F, 1);
                              _entityToSpawn.m_6034_(x, y, z);
                              _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                              projectileLevel.m_7967_(_entityToSpawn);
                           }

                        });
                        if (world instanceof ServerLevel projectileLevel) {
                           Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                              public Projectile getArrow(Level level, float damage, int knockback) {
                                 AbstractArrow entityToSpawn = new MsbuEntity((EntityType)ThemutantmobsmodModEntities.MSBU.get(), level);
                                 entityToSpawn.m_36781_((double)damage);
                                 entityToSpawn.m_36735_(knockback);
                                 entityToSpawn.m_20225_(true);
                                 return entityToSpawn;
                              }
                           })).getArrow(projectileLevel, 5.0F, 1);
                           _entityToSpawn.m_6034_(x, y, z);
                           _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                           projectileLevel.m_7967_(_entityToSpawn);
                        }

                     });
                     if (world instanceof ServerLevel projectileLevel) {
                        Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new MsbuEntity((EntityType)ThemutantmobsmodModEntities.MSBU.get(), level);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              entityToSpawn.m_20225_(true);
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel, 5.0F, 1);
                        _entityToSpawn.m_6034_(x, y, z);
                        _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                  });
                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new MsbuEntity((EntityType)ThemutantmobsmodModEntities.MSBU.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 5.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)150.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 120, 3));
               }
            }

            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("attack6");
            }

            ThemutantmobsmodMod.queueServerWork(15, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               ThemutantmobsmodMod.queueServerWork(3, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 5.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  ThemutantmobsmodMod.queueServerWork(3, () -> {
                     Level projectileLevel = entity.m_9236_();
                     if (!projectileLevel.m_5776_()) {
                        Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel, 5.0F, 1);
                        _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                     ThemutantmobsmodMod.queueServerWork(3, () -> {
                        ThemutantmobsmodMod.queueServerWork(3, () -> {
                           ThemutantmobsmodMod.queueServerWork(3, () -> {
                              ThemutantmobsmodMod.queueServerWork(3, () -> {
                                 ThemutantmobsmodMod.queueServerWork(3, () -> {
                                    ThemutantmobsmodMod.queueServerWork(3, () -> {
                                       ThemutantmobsmodMod.queueServerWork(3, () -> {
                                          ThemutantmobsmodMod.queueServerWork(3, () -> {
                                             ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                   ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                      ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                         ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                            ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                               ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                                  ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                                     ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                                        ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                                           ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                                              ThemutantmobsmodMod.queueServerWork(3, () -> {
                                                                                 Level projectileLevel = entity.m_9236_();
                                                                                 if (!projectileLevel.m_5776_()) {
                                                                                    Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                                       public Projectile getArrow(Level level, float damage, int knockback) {
                                                                                          AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                                          entityToSpawn.m_36781_((double)damage);
                                                                                          entityToSpawn.m_36735_(knockback);
                                                                                          return entityToSpawn;
                                                                                       }
                                                                                    })).getArrow(projectileLevel, 5.0F, 1);
                                                                                    _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                                                    _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                                                    projectileLevel.m_7967_(_entityToSpawn);
                                                                                 }

                                                                              });
                                                                              Level projectileLevel = entity.m_9236_();
                                                                              if (!projectileLevel.m_5776_()) {
                                                                                 Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                                    public Projectile getArrow(Level level, float damage, int knockback) {
                                                                                       AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                                       entityToSpawn.m_36781_((double)damage);
                                                                                       entityToSpawn.m_36735_(knockback);
                                                                                       return entityToSpawn;
                                                                                    }
                                                                                 })).getArrow(projectileLevel, 5.0F, 1);
                                                                                 _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                                                 _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                                                 projectileLevel.m_7967_(_entityToSpawn);
                                                                              }

                                                                           });
                                                                           Level projectileLevel = entity.m_9236_();
                                                                           if (!projectileLevel.m_5776_()) {
                                                                              Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                                 public Projectile getArrow(Level level, float damage, int knockback) {
                                                                                    AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                                    entityToSpawn.m_36781_((double)damage);
                                                                                    entityToSpawn.m_36735_(knockback);
                                                                                    return entityToSpawn;
                                                                                 }
                                                                              })).getArrow(projectileLevel, 5.0F, 1);
                                                                              _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                                              _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                                              projectileLevel.m_7967_(_entityToSpawn);
                                                                           }

                                                                        });
                                                                        Level projectileLevel = entity.m_9236_();
                                                                        if (!projectileLevel.m_5776_()) {
                                                                           Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                              public Projectile getArrow(Level level, float damage, int knockback) {
                                                                                 AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                                 entityToSpawn.m_36781_((double)damage);
                                                                                 entityToSpawn.m_36735_(knockback);
                                                                                 return entityToSpawn;
                                                                              }
                                                                           })).getArrow(projectileLevel, 5.0F, 1);
                                                                           _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                                           _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                                           projectileLevel.m_7967_(_entityToSpawn);
                                                                        }

                                                                     });
                                                                     Level projectileLevel = entity.m_9236_();
                                                                     if (!projectileLevel.m_5776_()) {
                                                                        Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                           public Projectile getArrow(Level level, float damage, int knockback) {
                                                                              AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                              entityToSpawn.m_36781_((double)damage);
                                                                              entityToSpawn.m_36735_(knockback);
                                                                              return entityToSpawn;
                                                                           }
                                                                        })).getArrow(projectileLevel, 5.0F, 1);
                                                                        _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                                        projectileLevel.m_7967_(_entityToSpawn);
                                                                     }

                                                                  });
                                                                  Level projectileLevel = entity.m_9236_();
                                                                  if (!projectileLevel.m_5776_()) {
                                                                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                        public Projectile getArrow(Level level, float damage, int knockback) {
                                                                           AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                           entityToSpawn.m_36781_((double)damage);
                                                                           entityToSpawn.m_36735_(knockback);
                                                                           return entityToSpawn;
                                                                        }
                                                                     })).getArrow(projectileLevel, 5.0F, 1);
                                                                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                                     projectileLevel.m_7967_(_entityToSpawn);
                                                                  }

                                                               });
                                                               Level projectileLevel = entity.m_9236_();
                                                               if (!projectileLevel.m_5776_()) {
                                                                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                     public Projectile getArrow(Level level, float damage, int knockback) {
                                                                        AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                        entityToSpawn.m_36781_((double)damage);
                                                                        entityToSpawn.m_36735_(knockback);
                                                                        return entityToSpawn;
                                                                     }
                                                                  })).getArrow(projectileLevel, 5.0F, 1);
                                                                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                                  projectileLevel.m_7967_(_entityToSpawn);
                                                               }

                                                            });
                                                            Level projectileLevel = entity.m_9236_();
                                                            if (!projectileLevel.m_5776_()) {
                                                               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                                  public Projectile getArrow(Level level, float damage, int knockback) {
                                                                     AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                     entityToSpawn.m_36781_((double)damage);
                                                                     entityToSpawn.m_36735_(knockback);
                                                                     return entityToSpawn;
                                                                  }
                                                               })).getArrow(projectileLevel, 5.0F, 1);
                                                               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                               projectileLevel.m_7967_(_entityToSpawn);
                                                            }

                                                         });
                                                         Level projectileLevel = entity.m_9236_();
                                                         if (!projectileLevel.m_5776_()) {
                                                            Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                               public Projectile getArrow(Level level, float damage, int knockback) {
                                                                  AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                                  entityToSpawn.m_36781_((double)damage);
                                                                  entityToSpawn.m_36735_(knockback);
                                                                  return entityToSpawn;
                                                               }
                                                            })).getArrow(projectileLevel, 5.0F, 1);
                                                            _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                            _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                            projectileLevel.m_7967_(_entityToSpawn);
                                                         }

                                                      });
                                                      Level projectileLevel = entity.m_9236_();
                                                      if (!projectileLevel.m_5776_()) {
                                                         Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                            public Projectile getArrow(Level level, float damage, int knockback) {
                                                               AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                               entityToSpawn.m_36781_((double)damage);
                                                               entityToSpawn.m_36735_(knockback);
                                                               return entityToSpawn;
                                                            }
                                                         })).getArrow(projectileLevel, 5.0F, 1);
                                                         _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                         _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                         projectileLevel.m_7967_(_entityToSpawn);
                                                      }

                                                   });
                                                   Level projectileLevel = entity.m_9236_();
                                                   if (!projectileLevel.m_5776_()) {
                                                      Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                         public Projectile getArrow(Level level, float damage, int knockback) {
                                                            AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                            entityToSpawn.m_36781_((double)damage);
                                                            entityToSpawn.m_36735_(knockback);
                                                            return entityToSpawn;
                                                         }
                                                      })).getArrow(projectileLevel, 5.0F, 1);
                                                      _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                      _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                      projectileLevel.m_7967_(_entityToSpawn);
                                                   }

                                                });
                                                Level projectileLevel = entity.m_9236_();
                                                if (!projectileLevel.m_5776_()) {
                                                   Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                      public Projectile getArrow(Level level, float damage, int knockback) {
                                                         AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                         entityToSpawn.m_36781_((double)damage);
                                                         entityToSpawn.m_36735_(knockback);
                                                         return entityToSpawn;
                                                      }
                                                   })).getArrow(projectileLevel, 5.0F, 1);
                                                   _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                   _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                   projectileLevel.m_7967_(_entityToSpawn);
                                                }

                                             });
                                             Level projectileLevel = entity.m_9236_();
                                             if (!projectileLevel.m_5776_()) {
                                                Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                   public Projectile getArrow(Level level, float damage, int knockback) {
                                                      AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                      entityToSpawn.m_36781_((double)damage);
                                                      entityToSpawn.m_36735_(knockback);
                                                      return entityToSpawn;
                                                   }
                                                })).getArrow(projectileLevel, 5.0F, 1);
                                                _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                                projectileLevel.m_7967_(_entityToSpawn);
                                             }

                                          });
                                          Level projectileLevel = entity.m_9236_();
                                          if (!projectileLevel.m_5776_()) {
                                             Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                                public Projectile getArrow(Level level, float damage, int knockback) {
                                                   AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                   entityToSpawn.m_36781_((double)damage);
                                                   entityToSpawn.m_36735_(knockback);
                                                   return entityToSpawn;
                                                }
                                             })).getArrow(projectileLevel, 5.0F, 1);
                                             _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                             _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                             projectileLevel.m_7967_(_entityToSpawn);
                                          }

                                       });
                                       Level projectileLevel = entity.m_9236_();
                                       if (!projectileLevel.m_5776_()) {
                                          Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                             public Projectile getArrow(Level level, float damage, int knockback) {
                                                AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                                entityToSpawn.m_36781_((double)damage);
                                                entityToSpawn.m_36735_(knockback);
                                                return entityToSpawn;
                                             }
                                          })).getArrow(projectileLevel, 5.0F, 1);
                                          _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                          _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                          projectileLevel.m_7967_(_entityToSpawn);
                                       }

                                    });
                                    Level projectileLevel = entity.m_9236_();
                                    if (!projectileLevel.m_5776_()) {
                                       Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                          public Projectile getArrow(Level level, float damage, int knockback) {
                                             AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                             entityToSpawn.m_36781_((double)damage);
                                             entityToSpawn.m_36735_(knockback);
                                             return entityToSpawn;
                                          }
                                       })).getArrow(projectileLevel, 5.0F, 1);
                                       _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                       _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                       projectileLevel.m_7967_(_entityToSpawn);
                                    }

                                 });
                                 Level projectileLevel = entity.m_9236_();
                                 if (!projectileLevel.m_5776_()) {
                                    Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                       public Projectile getArrow(Level level, float damage, int knockback) {
                                          AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                          entityToSpawn.m_36781_((double)damage);
                                          entityToSpawn.m_36735_(knockback);
                                          return entityToSpawn;
                                       }
                                    })).getArrow(projectileLevel, 5.0F, 1);
                                    _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                    _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                    projectileLevel.m_7967_(_entityToSpawn);
                                 }

                              });
                              Level projectileLevel = entity.m_9236_();
                              if (!projectileLevel.m_5776_()) {
                                 Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                    public Projectile getArrow(Level level, float damage, int knockback) {
                                       AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                       entityToSpawn.m_36781_((double)damage);
                                       entityToSpawn.m_36735_(knockback);
                                       return entityToSpawn;
                                    }
                                 })).getArrow(projectileLevel, 5.0F, 1);
                                 _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                                 _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                                 projectileLevel.m_7967_(_entityToSpawn);
                              }

                           });
                           Level projectileLevel = entity.m_9236_();
                           if (!projectileLevel.m_5776_()) {
                              Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                                 public Projectile getArrow(Level level, float damage, int knockback) {
                                    AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                    entityToSpawn.m_36781_((double)damage);
                                    entityToSpawn.m_36735_(knockback);
                                    return entityToSpawn;
                                 }
                              })).getArrow(projectileLevel, 5.0F, 1);
                              _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                              _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                              projectileLevel.m_7967_(_entityToSpawn);
                           }

                        });
                        Level projectileLevel = entity.m_9236_();
                        if (!projectileLevel.m_5776_()) {
                           Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                              public Projectile getArrow(Level level, float damage, int knockback) {
                                 AbstractArrow entityToSpawn = new Arrow(EntityType.f_20548_, level);
                                 entityToSpawn.m_36781_((double)damage);
                                 entityToSpawn.m_36735_(knockback);
                                 return entityToSpawn;
                              }
                           })).getArrow(projectileLevel, 5.0F, 1);
                           _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                           _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                           projectileLevel.m_7967_(_entityToSpawn);
                        }

                     });
                  });
               });
            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)151.0F) {
            if (entity instanceof MutantBoggedEntity) {
               ((MutantBoggedEntity)entity).setAnimation("attack4");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            ThemutantmobsmodMod.queueServerWork(15, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -10, 10), 4.0F, ExplosionInteraction.NONE);
                  }
               }

            });
         }

      }
   }
}
