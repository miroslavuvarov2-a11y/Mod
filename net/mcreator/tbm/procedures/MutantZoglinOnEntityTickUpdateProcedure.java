package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.MutantZoglinEntity;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import software.bernie.geckolib.animatable.GeoEntity;

public class MutantZoglinOnEntityTickUpdateProcedure {
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
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 150, 152));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)150.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 38, 255));
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 38, 255));
                  }
               }

               entity.getPersistentData().m_128347_("IA", (double)0.0F);
            });
            if (entity instanceof GeoEntity && entity instanceof MutantZoglinEntity) {
               ((MutantZoglinEntity)entity).setAnimation("jump");
            }

            ThemutantmobsmodMod.queueServerWork(38, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z, 4.0F, ExplosionInteraction.NONE);
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)151.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 40, 255));
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 40, 255));
                  }
               }

               entity.getPersistentData().m_128347_("IA", (double)0.0F);
            });
            if (entity instanceof GeoEntity && entity instanceof MutantZoglinEntity) {
               ((MutantZoglinEntity)entity).setAnimation("attack2");
            }

            ThemutantmobsmodMod.queueServerWork(40, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)4.0F, y, z + (double)4.0F, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)4.0F, y, z, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)-4.0F, y, z, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z + (double)-4.0F, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z + (double)4.0F, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)-4.0F, y, z + (double)-4.0F, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)4.0F, y, z + (double)-4.0F, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x + (double)-4.0F, y, z + (double)4.0F, 4.0F, ExplosionInteraction.NONE);
                  }
               }

               ThemutantmobsmodMod.queueServerWork(1, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)7.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)-7.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)7.0F, y, z, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-7.0F, y, z, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)7.0F, y, z + (double)7.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-7.0F, y, z + (double)-7.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)7.0F, y, z + (double)-7.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-7.0F, y, z + (double)7.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

               });
               ThemutantmobsmodMod.queueServerWork(2, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)10.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)-10.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)10.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)-10.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)-10.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)10.0F, 4.0F, ExplosionInteraction.NONE);
                     }
                  }

               });
            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)152.0F) {
            if (entity instanceof GeoEntity && entity instanceof MutantZoglinEntity) {
               ((MutantZoglinEntity)entity).setAnimation("run");
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 85, 3));
               }
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 85, 1));
               }
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 85, 1));
               }
            }

            ThemutantmobsmodMod.queueServerWork(160, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            ThemutantmobsmodMod.queueServerWork(85, () -> {
               if (entity instanceof GeoEntity && entity instanceof MutantZoglinEntity) {
                  ((MutantZoglinEntity)entity).setAnimation("run");
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 85, 3));
                  }
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 85, 1));
                  }
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 85, 1));
                  }
               }

            });
         }

      }
   }
}
