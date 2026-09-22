package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.HjEntity;
import net.mcreator.tbm.entity.LkEntity;
import net.mcreator.tbm.entity.MutantDrowned3Entity;
import net.mcreator.tbm.entity.TdEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
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
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib.animatable.GeoEntity;

public class MutantDrowned3OnEntityTickUpdateProcedure {
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

         if (entity.getPersistentData().m_128459_("IA") == (double)119.0F) {
            entity.getPersistentData().m_128347_("IA", (double)Mth.m_216271_(RandomSource.m_216327_(), 120, 124));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)120.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof GeoEntity && entity instanceof MutantDrowned3Entity) {
               ((MutantDrowned3Entity)entity).setAnimation("sh");
            }

            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new TdEntity((EntityType)ThemutantmobsmodModEntities.TD.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     entityToSpawn.f_36705_ = Pickup.ALLOWED;
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 11.0F, 1);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            ThemutantmobsmodMod.queueServerWork(5, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new TdEntity((EntityType)ThemutantmobsmodModEntities.TD.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 11.0F, 1);
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
                        AbstractArrow entityToSpawn = new TdEntity((EntityType)ThemutantmobsmodModEntities.TD.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 11.0F, 1);
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
                        AbstractArrow entityToSpawn = new TdEntity((EntityType)ThemutantmobsmodModEntities.TD.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 11.0F, 1);
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
                        AbstractArrow entityToSpawn = new TdEntity((EntityType)ThemutantmobsmodModEntities.TD.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.f_36705_ = Pickup.ALLOWED;
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 11.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)124.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof GeoEntity && entity instanceof MutantDrowned3Entity) {
               ((MutantDrowned3Entity)entity).setAnimation("summon");
            }

            ThemutantmobsmodMod.queueServerWork(10, () -> {
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
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mhr")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mhr")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }

            ThemutantmobsmodMod.queueServerWork(15, () -> {
               for(int index0 = 0; index0 < 4; ++index0) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.THE_HANDOF_MUTANT_DROWNED.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)121.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof GeoEntity && entity instanceof MutantDrowned3Entity) {
               ((MutantDrowned3Entity)entity).setAnimation("summon");
            }

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
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mhr")), SoundSource.MASTER, 1.0F, 1.0F);
               } else {
                  _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mhr")), SoundSource.MASTER, 1.0F, 1.0F, false);
               }
            }

            ThemutantmobsmodMod.queueServerWork(15, () -> {
               for(int index1 = 0; index1 < 7; ++index1) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20562_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)123.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof GeoEntity && entity instanceof MutantDrowned3Entity) {
               ((MutantDrowned3Entity)entity).setAnimation("sh");
            }

            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new HjEntity((EntityType)ThemutantmobsmodModEntities.HJ.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     entityToSpawn.f_36705_ = Pickup.ALLOWED;
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 30.0F, 2);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)122.0F) {
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
            if (entity instanceof GeoEntity && entity instanceof MutantDrowned3Entity) {
               ((MutantDrowned3Entity)entity).setAnimation("attack");
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
               })).getArrow(projectileLevel, 0.0F, 0);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)320.0F) {
            entity.getPersistentData().m_128347_("IA", (double)0.0F);
         }

      }
   }
}
