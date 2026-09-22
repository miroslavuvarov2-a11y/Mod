package net.mcreator.tbm.init;

import net.mcreator.tbm.entity.AlphaMutantIronGolemEntity;
import net.mcreator.tbm.entity.BlackHoleEntity;
import net.mcreator.tbm.entity.BoatEntity;
import net.mcreator.tbm.entity.GigaillagerEntity;
import net.mcreator.tbm.entity.GigaillagerV2Entity;
import net.mcreator.tbm.entity.GreatSwordEntity;
import net.mcreator.tbm.entity.HandofmutantwitherEntity;
import net.mcreator.tbm.entity.IronGolemHelicopterEntity;
import net.mcreator.tbm.entity.MutantBoggedEntity;
import net.mcreator.tbm.entity.MutantDrowned1Entity;
import net.mcreator.tbm.entity.MutantDrowned2Entity;
import net.mcreator.tbm.entity.MutantDrowned3Entity;
import net.mcreator.tbm.entity.MutantDrownedEntity;
import net.mcreator.tbm.entity.MutantGhastEntity;
import net.mcreator.tbm.entity.MutantIronGolemEntity;
import net.mcreator.tbm.entity.MutantNetheriteGolemEntity;
import net.mcreator.tbm.entity.MutantPiglinBruteEntity;
import net.mcreator.tbm.entity.MutantRavagerEntity;
import net.mcreator.tbm.entity.MutantSnifferEntity;
import net.mcreator.tbm.entity.MutantStriderEntity;
import net.mcreator.tbm.entity.MutantWardenEntity;
import net.mcreator.tbm.entity.MutantWitherEntity;
import net.mcreator.tbm.entity.MutantZoglinEntity;
import net.mcreator.tbm.entity.MutantZombieVillagerEntity;
import net.mcreator.tbm.entity.MutantZombiefiedPiglinEntity;
import net.mcreator.tbm.entity.MutantenderdragonEntity;
import net.mcreator.tbm.entity.MutantstrayEntity;
import net.mcreator.tbm.entity.PBEntity;
import net.mcreator.tbm.entity.PuppetofmutantwardenEntity;
import net.mcreator.tbm.entity.SmomwEntity;
import net.mcreator.tbm.entity.Soul2Entity;
import net.mcreator.tbm.entity.SoulEntity;
import net.mcreator.tbm.entity.TheGuardOfMutantBoggedEntity;
import net.mcreator.tbm.entity.TheHandofMutantDrownedEntity;
import net.mcreator.tbm.entity.TheQueenMutantEntity;
import net.mcreator.tbm.entity.ThehandofmutantboggedEntity;
import net.mcreator.tbm.entity.ThetrueessenceEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class EntityAnimationFactory {
   @SubscribeEvent
   public static void onEntityTick(LivingEvent.LivingTickEvent event) {
      if (event != null && event.getEntity() != null) {
         LivingEntity animation = event.getEntity();
         if (animation instanceof MutantZombiefiedPiglinEntity) {
            MutantZombiefiedPiglinEntity syncable = (MutantZombiefiedPiglinEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantIronGolemEntity) {
            MutantIronGolemEntity syncable = (MutantIronGolemEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantDrownedEntity) {
            MutantDrownedEntity syncable = (MutantDrownedEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantRavagerEntity) {
            MutantRavagerEntity syncable = (MutantRavagerEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantWardenEntity) {
            MutantWardenEntity syncable = (MutantWardenEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantZombieVillagerEntity) {
            MutantZombieVillagerEntity syncable = (MutantZombieVillagerEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantZoglinEntity) {
            MutantZoglinEntity syncable = (MutantZoglinEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantDrowned1Entity) {
            MutantDrowned1Entity syncable = (MutantDrowned1Entity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantDrowned2Entity) {
            MutantDrowned2Entity syncable = (MutantDrowned2Entity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantDrowned3Entity) {
            MutantDrowned3Entity syncable = (MutantDrowned3Entity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantWitherEntity) {
            MutantWitherEntity syncable = (MutantWitherEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantStriderEntity) {
            MutantStriderEntity syncable = (MutantStriderEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof GigaillagerEntity) {
            GigaillagerEntity syncable = (GigaillagerEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof GigaillagerV2Entity) {
            GigaillagerV2Entity syncable = (GigaillagerV2Entity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantenderdragonEntity) {
            MutantenderdragonEntity syncable = (MutantenderdragonEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantstrayEntity) {
            MutantstrayEntity syncable = (MutantstrayEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantNetheriteGolemEntity) {
            MutantNetheriteGolemEntity syncable = (MutantNetheriteGolemEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantSnifferEntity) {
            MutantSnifferEntity syncable = (MutantSnifferEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantGhastEntity) {
            MutantGhastEntity syncable = (MutantGhastEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof AlphaMutantIronGolemEntity) {
            AlphaMutantIronGolemEntity syncable = (AlphaMutantIronGolemEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof TheHandofMutantDrownedEntity) {
            TheHandofMutantDrownedEntity syncable = (TheHandofMutantDrownedEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof SoulEntity) {
            SoulEntity syncable = (SoulEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof Soul2Entity) {
            Soul2Entity syncable = (Soul2Entity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof GreatSwordEntity) {
            GreatSwordEntity syncable = (GreatSwordEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantBoggedEntity) {
            MutantBoggedEntity syncable = (MutantBoggedEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof ThehandofmutantboggedEntity) {
            ThehandofmutantboggedEntity syncable = (ThehandofmutantboggedEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof IronGolemHelicopterEntity) {
            IronGolemHelicopterEntity syncable = (IronGolemHelicopterEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof TheGuardOfMutantBoggedEntity) {
            TheGuardOfMutantBoggedEntity syncable = (TheGuardOfMutantBoggedEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof PuppetofmutantwardenEntity) {
            PuppetofmutantwardenEntity syncable = (PuppetofmutantwardenEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof SmomwEntity) {
            SmomwEntity syncable = (SmomwEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof BoatEntity) {
            BoatEntity syncable = (BoatEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof MutantPiglinBruteEntity) {
            MutantPiglinBruteEntity syncable = (MutantPiglinBruteEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof HandofmutantwitherEntity) {
            HandofmutantwitherEntity syncable = (HandofmutantwitherEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof BlackHoleEntity) {
            BlackHoleEntity syncable = (BlackHoleEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof ThetrueessenceEntity) {
            ThetrueessenceEntity syncable = (ThetrueessenceEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof TheQueenMutantEntity) {
            TheQueenMutantEntity syncable = (TheQueenMutantEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         animation = event.getEntity();
         if (animation instanceof PBEntity) {
            PBEntity syncable = (PBEntity)animation;
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }
      }

   }
}
