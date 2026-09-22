package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.AmiriEntity;
import net.mcreator.tbm.entity.Rocket2Entity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class AlphaMutantIronGolemOnEntityTickUpdateProcedure {
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

         if (entity.getPersistentData().m_128459_("IA") == (double)304.0F) {
            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "effect give @e[type=minecraft:iron_golem] minecraft:resistance 10 5");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)303.0F) {
            for(int index0 = 0; index0 < 4; ++index0) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.IRON_GOLEM_HELICOPTER.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)306.0F) {
            for(int index1 = 0; index1 < 10; ++index1) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.ROCKET.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)12.0F, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)301.0F) {
            for(int index2 = 0; index2 < 5; ++index2) {
               if (world instanceof ServerLevel) {
                  ServerLevel _level = (ServerLevel)world;
                  Entity entityToSpawn = EntityType.f_20460_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)305.0F) {
            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new Rocket2Entity((EntityType)ThemutantmobsmodModEntities.ROCKET_2.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 0.0F, 1);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            ThemutantmobsmodMod.queueServerWork(40, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new Rocket2Entity((EntityType)ThemutantmobsmodModEntities.ROCKET_2.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 0.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(80, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new Rocket2Entity((EntityType)ThemutantmobsmodModEntities.ROCKET_2.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 0.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 5.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)302.0F) {
            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new AmiriEntity((EntityType)ThemutantmobsmodModEntities.AMIRI.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 15.0F, 1);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            ThemutantmobsmodMod.queueServerWork(5, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new AmiriEntity((EntityType)ThemutantmobsmodModEntities.AMIRI.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(10, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new AmiriEntity((EntityType)ThemutantmobsmodModEntities.AMIRI.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(15, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new AmiriEntity((EntityType)ThemutantmobsmodModEntities.AMIRI.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new AmiriEntity((EntityType)ThemutantmobsmodModEntities.AMIRI.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(25, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new AmiriEntity((EntityType)ThemutantmobsmodModEntities.AMIRI.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(30, () -> {
               Level projectileLevel = entity.m_9236_();
               if (!projectileLevel.m_5776_()) {
                  Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                     public Projectile getArrow(Level level, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new AmiriEntity((EntityType)ThemutantmobsmodModEntities.AMIRI.get(), level);
                        entityToSpawn.m_36781_((double)damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                     }
                  })).getArrow(projectileLevel, 15.0F, 1);
                  _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
                  _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 3.0F, 0.0F);
                  projectileLevel.m_7967_(_entityToSpawn);
               }

            });
            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)0.0F));
         }

      }
   }
}
