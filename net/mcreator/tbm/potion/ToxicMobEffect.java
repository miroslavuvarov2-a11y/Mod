package net.mcreator.tbm.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class ToxicMobEffect extends MobEffect {
   public ToxicMobEffect() {
      super(MobEffectCategory.HARMFUL, -16764160);
   }

   public String m_19481_() {
      return "effect.themutantmobsmod.toxic";
   }

   public boolean m_6584_(int duration, int amplifier) {
      return true;
   }
}
