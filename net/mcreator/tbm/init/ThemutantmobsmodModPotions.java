package net.mcreator.tbm.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ThemutantmobsmodModPotions {
   public static final DeferredRegister<Potion> REGISTRY;
   public static final RegistryObject<Potion> A;

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, "themutantmobsmod");
      A = REGISTRY.register("a", () -> new Potion(new MobEffectInstance[]{new MobEffectInstance((MobEffect)ThemutantmobsmodModMobEffects.TOXIC.get(), 3600, 0, false, true)}));
   }
}
