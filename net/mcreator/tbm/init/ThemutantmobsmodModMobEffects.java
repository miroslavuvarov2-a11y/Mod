package net.mcreator.tbm.init;

import net.mcreator.tbm.potion.EffectofMutantWardenMobEffect;
import net.mcreator.tbm.potion.GigaMobEffect;
import net.mcreator.tbm.potion.ToxicMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ThemutantmobsmodModMobEffects {
   public static final DeferredRegister<MobEffect> REGISTRY;
   public static final RegistryObject<MobEffect> TOXIC;
   public static final RegistryObject<MobEffect> GIGA;
   public static final RegistryObject<MobEffect> EFFECTOF_MUTANT_WARDEN;

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "themutantmobsmod");
      TOXIC = REGISTRY.register("toxic", () -> new ToxicMobEffect());
      GIGA = REGISTRY.register("giga", () -> new GigaMobEffect());
      EFFECTOF_MUTANT_WARDEN = REGISTRY.register("effectof_mutant_warden", () -> new EffectofMutantWardenMobEffect());
   }
}
