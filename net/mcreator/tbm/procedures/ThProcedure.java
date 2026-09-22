package net.mcreator.tbm.procedures;

import javax.annotation.Nullable;
import net.mcreator.tbm.entity.MutantDrowned1Entity;
import net.mcreator.tbm.entity.MutantDrowned2Entity;
import net.mcreator.tbm.entity.MutantDrowned3Entity;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import software.bernie.geckolib.animatable.GeoEntity;

@EventBusSubscriber
public class ThProcedure {
   @SubscribeEvent
   public static void onEntitySpawned(EntityJoinLevelEvent event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute((Event)null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof MutantDrowned1Entity && entity instanceof GeoEntity && entity instanceof MutantDrowned1Entity) {
            ((MutantDrowned1Entity)entity).setAnimation("dead");
         }

         if (entity instanceof MutantDrowned2Entity && entity instanceof GeoEntity && entity instanceof MutantDrowned2Entity) {
            ((MutantDrowned2Entity)entity).setAnimation("dead");
         }

         if (entity instanceof MutantDrowned3Entity && entity instanceof GeoEntity && entity instanceof MutantDrowned3Entity) {
            ((MutantDrowned3Entity)entity).setAnimation("dead");
         }

      }
   }
}
