package net.mcreator.tbm.procedures;

import javax.annotation.Nullable;
import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.AncientTreeEntity;
import net.mcreator.tbm.entity.MutantBoggedEntity;
import net.mcreator.tbm.entity.MutantGhastEntity;
import net.mcreator.tbm.entity.MutantPiglinBruteEntity;
import net.mcreator.tbm.entity.MutantStriderEntity;
import net.mcreator.tbm.entity.MutantWardenEntity;
import net.mcreator.tbm.entity.MutantWitherEntity;
import net.mcreator.tbm.entity.MutantenderdragonEntity;
import net.mcreator.tbm.entity.TheQueenMutantEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib.animatable.GeoEntity;

@EventBusSubscriber
public class TghrtProcedure {
   @SubscribeEvent
   public static void onEntitySpawned(EntityJoinLevelEvent event) {
      execute(event, event.getLevel(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity());
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute((Event)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof TheQueenMutantEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(50, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:tqm")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:tqm")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity instanceof MutantBoggedEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:bfd")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:bfd")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity instanceof MutantPiglinBruteEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:bfd")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:bfd")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity instanceof MutantStriderEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mst")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mst")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity instanceof MutantWitherEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:unbbt")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:unbbt")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity instanceof MutantWardenEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(40, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mwbbt")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mwbbt")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity instanceof MutantenderdragonEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:ii")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:ii")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

         if (entity instanceof AncientTreeEntity) {
            ThemutantmobsmodMod.queueServerWork(60, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_254849_((Entity)null, x, y, z, 4.0F, ExplosionInteraction.NONE);
                  }
               }

            });
         }

         if (entity instanceof MutantGhastEntity && entity instanceof GeoEntity) {
            ThemutantmobsmodMod.queueServerWork(20, () -> {
               if (world instanceof Level _level) {
                  if (!_level.m_5776_()) {
                     _level.m_5594_((Player)null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mgbt")), SoundSource.MASTER, 1.0F, 1.0F);
                  } else {
                     _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("themutantmobsmod:mgbt")), SoundSource.MASTER, 1.0F, 1.0F, false);
                  }
               }

            });
         }

      }
   }
}
