package net.mcreator.tbm.procedures;

import java.util.Comparator;
import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.ThetrueessenceEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class QeProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
            }
         }

         if (world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
            }
         }

         if (world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
            }
         }

         if (world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
            }
         }

         if (world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
            }
         }

         Vec3 _center = new Vec3(x, y, z);

         for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
            if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
               entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
            }
         }

         ThemutantmobsmodMod.queueServerWork(5, () -> {
            if (world instanceof Level _level) {
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level _level) {
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level _level) {
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level _level) {
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level _level) {
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
               }
            }

            Vec3 _center = new Vec3(x, y, z);

            for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
               if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                  entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
               }
            }

            ThemutantmobsmodMod.queueServerWork(5, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                  }
               }

               Vec3 _center = new Vec3(x, y, z);

               for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                  if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                     entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
                  }
               }

               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  Vec3 _center = new Vec3(x, y, z);

                  for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                     if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                        entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
                     }
                  }

                  ThemutantmobsmodMod.queueServerWork(5, () -> {
                     if (world instanceof Level _level) {
                        if (!_level.m_5776_()) {
                           _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                        }
                     }

                     if (world instanceof Level _level) {
                        if (!_level.m_5776_()) {
                           _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                        }
                     }

                     if (world instanceof Level _level) {
                        if (!_level.m_5776_()) {
                           _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                        }
                     }

                     if (world instanceof Level _level) {
                        if (!_level.m_5776_()) {
                           _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                        }
                     }

                     if (world instanceof Level _level) {
                        if (!_level.m_5776_()) {
                           _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                        }
                     }

                     Vec3 _center = new Vec3(x, y, z);

                     for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                        if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                           entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
                        }
                     }

                     ThemutantmobsmodMod.queueServerWork(5, () -> {
                        if (world instanceof Level _level) {
                           if (!_level.m_5776_()) {
                              _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                           }
                        }

                        if (world instanceof Level _level) {
                           if (!_level.m_5776_()) {
                              _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                           }
                        }

                        if (world instanceof Level _level) {
                           if (!_level.m_5776_()) {
                              _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                           }
                        }

                        if (world instanceof Level _level) {
                           if (!_level.m_5776_()) {
                              _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                           }
                        }

                        if (world instanceof Level _level) {
                           if (!_level.m_5776_()) {
                              _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                           }
                        }

                        Vec3 _center = new Vec3(x, y, z);

                        for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                           if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                              entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
                           }
                        }

                        ThemutantmobsmodMod.queueServerWork(5, () -> {
                           if (world instanceof Level _level) {
                              if (!_level.m_5776_()) {
                                 _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                              }
                           }

                           if (world instanceof Level _level) {
                              if (!_level.m_5776_()) {
                                 _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                              }
                           }

                           if (world instanceof Level _level) {
                              if (!_level.m_5776_()) {
                                 _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                              }
                           }

                           if (world instanceof Level _level) {
                              if (!_level.m_5776_()) {
                                 _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                              }
                           }

                           if (world instanceof Level _level) {
                              if (!_level.m_5776_()) {
                                 _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                              }
                           }

                           Vec3 _center = new Vec3(x, y, z);

                           for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                              if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                 entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
                              }
                           }

                           ThemutantmobsmodMod.queueServerWork(5, () -> {
                              if (world instanceof Level _level) {
                                 if (!_level.m_5776_()) {
                                    _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                 }
                              }

                              if (world instanceof Level _level) {
                                 if (!_level.m_5776_()) {
                                    _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                 }
                              }

                              if (world instanceof Level _level) {
                                 if (!_level.m_5776_()) {
                                    _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                 }
                              }

                              if (world instanceof Level _level) {
                                 if (!_level.m_5776_()) {
                                    _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                 }
                              }

                              if (world instanceof Level _level) {
                                 if (!_level.m_5776_()) {
                                    _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                 }
                              }

                              Vec3 _center = new Vec3(x, y, z);

                              for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                 if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                    entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
                                 }
                              }

                              ThemutantmobsmodMod.queueServerWork(5, () -> {
                                 if (world instanceof Level _level) {
                                    if (!_level.m_5776_()) {
                                       _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                    }
                                 }

                                 if (world instanceof Level _level) {
                                    if (!_level.m_5776_()) {
                                       _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                    }
                                 }

                                 if (world instanceof Level _level) {
                                    if (!_level.m_5776_()) {
                                       _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                    }
                                 }

                                 if (world instanceof Level _level) {
                                    if (!_level.m_5776_()) {
                                       _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                    }
                                 }

                                 if (world instanceof Level _level) {
                                    if (!_level.m_5776_()) {
                                       _level.m_254849_((Entity)null, x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), 4.0F, ExplosionInteraction.NONE);
                                    }
                                 }

                                 Vec3 _center = new Vec3(x, y, z);

                                 for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)30.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                    if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                       entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 50, 500));
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
      }
   }
}
