package net.mcreator.tbm.procedures;

import javax.annotation.Nullable;
import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.MutantDrowned1Entity;
import net.mcreator.tbm.entity.MutantDrowned2Entity;
import net.mcreator.tbm.entity.MutantDrowned3Entity;
import net.mcreator.tbm.entity.MutantDrownedEntity;
import net.mcreator.tbm.entity.MutantZombieVillagerEntity;
import net.mcreator.tbm.entity.MutantZombiefiedPiglinEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib.animatable.GeoEntity;

@EventBusSubscriber
public class TrProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(LivingAttackEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity(), event.getSource().m_7639_());
      }

   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute((Event)null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof MutantZombiefiedPiglinEntity) {
            ThemutantmobsmodMod.queueServerWork(165, () -> {
               if (entity instanceof GeoEntity && entity instanceof MutantZombiefiedPiglinEntity) {
                  ((MutantZombiefiedPiglinEntity)entity).setAnimation("attack2");
               }

            });
            ThemutantmobsmodMod.queueServerWork(100, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z, 2.0F, ExplosionInteraction.NONE);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = EntityType.f_20531_.m_262496_(_level, BlockPos.m_274561_(x, y, z + (double)3.0F), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0F);
                  }
               }

               if (entity instanceof GeoEntity && entity instanceof MutantZombiefiedPiglinEntity) {
                  ((MutantZombiefiedPiglinEntity)entity).setAnimation("summon");
               }

            });
         }

         if (sourceentity instanceof MutantDrownedEntity && world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F);
            } else {
               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F, false);
            }
         }

         if (sourceentity instanceof MutantZombieVillagerEntity && world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mzvs")), SoundSource.MASTER, 1.0F, 1.0F);
            } else {
               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mzvs")), SoundSource.MASTER, 1.0F, 1.0F, false);
            }
         }

         if (sourceentity instanceof MutantDrowned1Entity && world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F);
            } else {
               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F, false);
            }
         }

         if (sourceentity instanceof MutantDrowned2Entity && world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F);
            } else {
               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F, false);
            }
         }

         if (sourceentity instanceof MutantDrowned3Entity && world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
               _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F);
            } else {
               _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mda")), SoundSource.MASTER, 1.0F, 1.0F, false);
            }
         }

      }
   }
}
