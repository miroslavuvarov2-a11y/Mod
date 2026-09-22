package net.mcreator.tbm.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;

@EventBusSubscriber(
   bus = Bus.MOD
)
public class ThemutantmobsmodModTabs {
   public static final DeferredRegister<CreativeModeTab> REGISTRY;

   @SubscribeEvent
   public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
      if (tabData.getTabKey() == CreativeModeTabs.f_256797_) {
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.HUNTER_GUN.get());
      }

      if (tabData.getTabKey() == CreativeModeTabs.f_256731_) {
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_ZOMBIFIED_PIGLIN_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_IRON_GOLEM_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_DROWNED_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_RAVAGER_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_WARDEN_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_ZOMBIE_VILLAGER_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_ZOGLIN_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_WITHER_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_STRIDER_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.GIGAILLAGER_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANTENDERDRAGON_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANTSTRAY_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_NETHERITE_GOLEM_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_SNIFFER_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_GHAST_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.ALPHA_MUTANT_IRON_GOLEM_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_BOGGED_SPAWN_EGG.get());
         tabData.m_246326_((ItemLike)ThemutantmobsmodModItems.MUTANT_PIGLIN_BRUTE_SPAWN_EGG.get());
      }

   }

   static {
      REGISTRY = DeferredRegister.create(Registries.f_279569_, "themutantmobsmod");
   }
}
