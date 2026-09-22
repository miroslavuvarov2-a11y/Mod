package net.mcreator.tbm.procedures;

import javax.annotation.Nullable;
import net.mcreator.tbm.entity.MutantDrowned1Entity;
import net.mcreator.tbm.entity.MutantDrowned2Entity;
import net.mcreator.tbm.entity.MutantDrowned3Entity;
import net.mcreator.tbm.entity.MutantDrownedEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class TyProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(LivingAttackEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getSource().m_7639_());
      }

   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
      execute((Event)null, world, x, y, z, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
      if (sourceentity != null) {
         if (sourceentity instanceof MutantDrownedEntity) {
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-2.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-1.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)2.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)1.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }
         }

         if (sourceentity instanceof MutantDrowned1Entity) {
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-2.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-1.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)2.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)1.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }
         }

         if (sourceentity instanceof MutantDrowned2Entity) {
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-2.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-1.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)2.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)1.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }
         }

         if (sourceentity instanceof MutantDrowned3Entity) {
            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-2.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-1.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-3.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-2.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)-1.0F, y, z + (double)-3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)3.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)2.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }

            if (world instanceof Level) {
               Level _level = (Level)world;
               if (!_level.m_5776_()) {
                  _level.m_254849_((Entity)null, x + (double)1.0F, y, z + (double)3.0F, 1.0F, ExplosionInteraction.NONE);
               }
            }
         }

      }
   }
}
