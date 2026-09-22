package net.mcreator.tbm.procedures;

import net.mcreator.tbm.entity.MutantDrowned2Entity;
import net.minecraft.world.entity.Entity;
import software.bernie.geckolib.animatable.GeoEntity;

public class MutantDrowned2OnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof GeoEntity && entity instanceof MutantDrowned2Entity) {
            ((MutantDrowned2Entity)entity).setAnimation("dead");
         }

      }
   }
}
