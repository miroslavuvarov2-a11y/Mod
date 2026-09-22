package net.mcreator.tbm.procedures;

import java.util.Comparator;
import net.mcreator.tbm.entity.BlackHoleEntity;
import net.mcreator.tbm.entity.HandofmutantwitherEntity;
import net.mcreator.tbm.entity.HeadofmutantwitherEntity;
import net.mcreator.tbm.entity.MutantWitherEntity;
import net.mcreator.tbm.entity.Towerofmutantwither2Entity;
import net.mcreator.tbm.entity.TowerofmutantwitherEntity;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class Towerofmutantwither2OnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity.m_6084_()) {
            Vec3 _center = new Vec3(x, y, z);

            for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)10.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
               if (entityiterator != entity && !(entityiterator instanceof MutantWitherEntity) && !(entityiterator instanceof HeadofmutantwitherEntity) && !(entityiterator instanceof HandofmutantwitherEntity) && !(entityiterator instanceof TowerofmutantwitherEntity) && !(entityiterator instanceof Towerofmutantwither2Entity) && !(entityiterator instanceof BlackHoleEntity)) {
                  entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 5.0F);
                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "effect give @e[type=themutantmobsmod:mutant_wither] minecraft:resistant 1 4 true");
                  }
               }
            }
         }

      }
   }
}
