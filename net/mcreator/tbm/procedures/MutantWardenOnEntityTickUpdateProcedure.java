package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.MutantWardenEntity;
import net.mcreator.tbm.entity.SuperSonicBoomEntity;
import net.mcreator.tbm.entity.VgEntity;
import net.mcreator.tbm.entity.WomwEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
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
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class MutantWardenOnEntityTickUpdateProcedure {
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

         if (entity.getPersistentData().m_128459_("IA") == (double)299.0F) {
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 300, 309));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)308.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)2.0F));
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               ThemutantmobsmodMod.queueServerWork(10, () -> {
                  ThemutantmobsmodMod.queueServerWork(10, () -> {
                     Level projectileLevel = entity.m_9236_();
                     if (!projectileLevel.m_5776_()) {
                        Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new WomwEntity((EntityType)ThemutantmobsmodModEntities.WOMW.get(), level);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              entityToSpawn.m_20225_(true);
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel, 5.0F, 1);
                        _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                  });
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new WomwEntity((EntityType)ThemutantmobsmodModEntities.WOMW.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 5.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new WomwEntity((EntityType)ThemutantmobsmodModEntities.WOMW.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("attack5");
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)309.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 70, 255));
               }
            }

            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("attack6");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)2.0F));
            ThemutantmobsmodMod.queueServerWork(18, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.PUPPETOFMUTANTWARDEN.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(18, () -> {
               if (entity instanceof LivingEntity _entity) {
                  _entity.m_21219_();
               }

               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  if (entity instanceof LivingEntity _entity) {
                     _entity.m_21219_();
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

               });
               ThemutantmobsmodMod.queueServerWork(10, () -> {
                  if (entity instanceof LivingEntity _entity) {
                     if (!_entity.m_9236_().m_5776_()) {
                        _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 250, 3));
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
               ThemutantmobsmodMod.queueServerWork(15, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

               });
            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)307.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 70, 255));
               }
            }

            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("attack4");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)2.0F));
            ThemutantmobsmodMod.queueServerWork(60, () -> {
               if (entity instanceof LivingEntity _entity) {
                  _entity.m_21219_();
               }

               if (world instanceof ServerLevel _level) {
                  _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "effect give @e minecraft:weakness 15 255");
               }

               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  if (entity instanceof LivingEntity _entity) {
                     _entity.m_21219_();
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

               });
               ThemutantmobsmodMod.queueServerWork(10, () -> {
                  if (entity instanceof LivingEntity _entity) {
                     if (!_entity.m_9236_().m_5776_()) {
                        _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 250, 3));
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
               ThemutantmobsmodMod.queueServerWork(15, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

               });
            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)300.0F) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 200, 10));
               }
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 70, 255));
               }
            }

            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("attack2");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)2.0F));
            ThemutantmobsmodMod.queueServerWork(20, () -> {
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
               ThemutantmobsmodMod.queueServerWork(15, () -> {
                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)-10.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x + (double)10.0F, y, z, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

                  if (world instanceof Level _level) {
                     if (!_level.m_5776_()) {
                        _level.m_254849_((Entity)null, x, y, z + (double)-10.0F, 3.0F, ExplosionInteraction.NONE);
                     }
                  }

               });
            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)306.0F) {
            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.GREAT_SWORD.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)30.0F, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)2.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)305.0F) {
            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("s");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> {
               entity.getPersistentData().m_128347_("IA", (double)100.0F);
               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 25, 255));
                  }
               }

            });
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:so1")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:so1")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }

            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 5.0F, 0);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 0.5F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 5.0F, 0);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.m_9236_().m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 45, 5));
               }
            }

            ThemutantmobsmodMod.queueServerWork(10, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 0.5F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 45, 5));
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(15, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 0.5F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 45, 5));
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 0.5F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 45, 5));
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(25, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new VgEntity((EntityType)ThemutantmobsmodModEntities.VG.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 5.0F, 0);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 0.5F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 45, 5));
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)304.0F) {
            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("s2");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)2.0F));
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:so2")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:so2")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

               for(int index0 = 0; index0 < 8; ++index0) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.SOUL.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)301.0F) {
            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("attack");
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:sw1")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:sw1")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)100.0F));
            ThemutantmobsmodMod.queueServerWork(35, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 3));
                  }
               }

               if (world instanceof ServerLevel _level) {
                  _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "effect give @e themutantmobsmod:giga 1 1");
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)1.0F) {
            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("w");
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.roar")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.roar")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)303.0F) {
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:sefe2")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:sefe2")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }

            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("attack3");
            }

            ThemutantmobsmodMod.queueServerWork(40, () -> {
               if (world instanceof ServerLevel _level) {
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)6.0F, y, z)));
                  _level.m_7967_(entityToSpawn);
               }

               if (world instanceof ServerLevel _level) {
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)-6.0F, y, z)));
                  _level.m_7967_(entityToSpawn);
               }

               if (world instanceof ServerLevel _level) {
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z + (double)-6.0F)));
                  _level.m_7967_(entityToSpawn);
               }

               if (world instanceof ServerLevel _level) {
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x, y, z + (double)6.0F)));
                  _level.m_7967_(entityToSpawn);
               }

               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.break_block")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.break_block")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 250, 255));
                  }
               }

               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19619_, 250, 255));
                  }
               }

            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)2.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)302.0F) {
            if (entity instanceof MutantWardenEntity) {
               ((MutantWardenEntity)entity).setAnimation("shot");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)100.0F));
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (entity instanceof LivingEntity _entity) {
                  if (!_entity.m_9236_().m_5776_()) {
                     _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 3));
                  }
               }

               ThemutantmobsmodMod.queueServerWork(20, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(18, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(16, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(14, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(12, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(10, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(8, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(6, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(4, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               ThemutantmobsmodMod.queueServerWork(2, () -> {
                  Level projectileLevel = entity.m_9236_();
                  if (!projectileLevel.m_5776_()) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                     _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

                  if (world instanceof ServerLevel projectileLevel) {
                     Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                           entityToSpawn.m_36781_((double)damage);
                           entityToSpawn.m_36735_(knockback);
                           entityToSpawn.m_20225_(true);
                           return entityToSpawn;
                        }
                     })).getArrow(projectileLevel, 30.0F, 1);
                     _entityToSpawn.m_6034_(x, y, z);
                     _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                     projectileLevel.m_7967_(_entityToSpawn);
                  }

               });
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 30.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (world instanceof ServerLevel projectileLevel) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 30.0F, 1);
                  _entityToSpawn.m_6034_(x, y, z);
                  _entityToSpawn.m_6686_((double)1.0F, (double)1.0F, (double)1.0F, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (world instanceof ServerLevel projectileLevel) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 30.0F, 1);
                  _entityToSpawn.m_6034_(x, y, z);
                  _entityToSpawn.m_6686_((double)1.0F, (double)-4.0F, (double)1.0F, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (world instanceof ServerLevel projectileLevel) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 30.0F, 1);
                  _entityToSpawn.m_6034_(x, y, z);
                  _entityToSpawn.m_6686_((double)1.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (world instanceof ServerLevel projectileLevel) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 30.0F, 1);
                  _entityToSpawn.m_6034_(x, y, z);
                  _entityToSpawn.m_6686_((double)4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

               if (world instanceof ServerLevel projectileLevel) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new SuperSonicBoomEntity((EntityType)ThemutantmobsmodModEntities.SUPER_SONIC_BOOM.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 30.0F, 1);
                  _entityToSpawn.m_6034_(x, y, z);
                  _entityToSpawn.m_6686_((double)-4.0F, (double)4.0F, (double)1.0F, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
         }

      }
   }
}
