package net.mcreator.tbm.item;

import net.mcreator.tbm.entity.TrfhEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class TrfhItem extends Item {
   public TrfhItem() {
      super((new Item.Properties()).m_41503_(100));
   }

   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
      entity.m_6672_(hand);
      return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
   }

   public UseAnim m_6164_(ItemStack itemstack) {
      return UseAnim.BOW;
   }

   public int m_8105_(ItemStack itemstack) {
      return 72000;
   }

   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
      if (!world.m_5776_() && entityLiving instanceof ServerPlayer entity) {
         double x = entity.m_20185_();
         double y = entity.m_20186_();
         double z = entity.m_20189_();
         TrfhEntity entityarrow = TrfhEntity.shoot(world, entity, world.m_213780_(), 3.0F, (double)1.0F, 1);
         itemstack.m_41622_(1, entity, (e) -> e.m_21190_(entity.m_7655_()));
         entityarrow.f_36705_ = Pickup.DISALLOWED;
      }

   }
}
