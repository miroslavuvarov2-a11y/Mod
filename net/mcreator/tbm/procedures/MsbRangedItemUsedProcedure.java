package net.mcreator.tbm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class MsbRangedItemUsedProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (entity != null) {
         if (entity instanceof Player) {
            Player _player = (Player)entity;
            _player.m_36335_().m_41524_(itemstack.m_41720_(), 25);
         }

      }
   }
}
