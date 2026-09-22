package net.mcreator.tbm.procedures;

import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.SmomwEntity;
import net.mcreator.tbm.init.ThemutantmobsmodModEntities;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class SmomwOnEntityTickUpdateProcedure {
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

         if (entity instanceof Mob) {
            Mob _mobEnt = (Mob)entity;
            var10000 = _mobEnt.m_5448_();
         } else {
            var10000 = null;
         }

         if (var10000 == null) {
            entity.getPersistentData().m_128347_("IA", entity.getPersistentData().m_128459_("IA") + (double)1.0F);
         }

         if (entity.m_6084_() && world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "effect give @e[type=themutantmobsmod:mutant_warden] minecraft:resistant 1 4 true");
         }

         if (entity.getPersistentData().m_128459_("IA") >= (double)900.0F) {
            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               Entity entityToSpawn = ((EntityType)ThemutantmobsmodModEntities.GREAT_SWORD.get()).m_262496_(_level, BlockPos.m_274561_(x, y + (double)30.0F, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
               }
            }

            if (entity instanceof SmomwEntity) {
               ((SmomwEntity)entity).setAnimation("attack");
            }

            ThemutantmobsmodMod.queueServerWork(1, () -> entity.getPersistentData().m_128347_("IA", (double)1.0F));
         }

      }
   }
}
