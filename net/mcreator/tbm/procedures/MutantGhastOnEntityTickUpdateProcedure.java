package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.Mgri2Entity;
import net.mcreator.tbm.entity.MutantGhastEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class MutantGhastOnEntityTickUpdateProcedure {
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

         if (entity.getPersistentData().m_128459_("IA") == (double)165.0F) {
            if (entity instanceof MutantGhastEntity) {
               ((MutantGhastEntity)entity).setAnimation("attack2");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", entity.getPersistentData().m_128459_("IA") + (double)1.0F));
            Level projectileLevel = entity.m_9236_();
            if (!projectileLevel.m_5776_()) {
               Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new Mgri2Entity((EntityType)ThemutantmobsmodModEntities.MGRI_2.get(), level);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     entityToSpawn.f_36705_ = Pickup.ALLOWED;
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, 50.0F, 1);
               _entityToSpawn.m_6034_(entity.m_20185_(), entity.m_20188_() - 0.1, entity.m_20189_());
               _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)300.0F) {
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               for(int index0 = 0; index0 < 3; ++index0) {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = EntityType.f_20453_.m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                     }
                  }
               }

            });
            if (entity instanceof MutantGhastEntity) {
               ((MutantGhastEntity)entity).setAnimation("attack3");
            }
         }

         if (entity.getPersistentData().m_128459_("IA") == (double)310.0F) {
            entity.getPersistentData().m_128347_("IA", (double)0.0F);
         }

      }
   }
}
