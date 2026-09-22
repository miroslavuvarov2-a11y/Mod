package net.mcreator.tbm.procedures;

import javax.annotation.Nullable;
import net.mcreator.tbm.entity.MutantWitherEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class DfhProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(LivingAttackEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getSource().m_7639_());
      }

   }

   public static void execute(Entity sourceentity) {
      execute((Event)null, sourceentity);
   }

   private static void execute(@Nullable Event event, Entity sourceentity) {
      if (sourceentity != null) {
         if (sourceentity instanceof MutantWitherEntity && sourceentity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity)sourceentity;
            if (!_entity.m_9236_().m_5776_()) {
               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 1));
            }
         }

      }
   }
}
