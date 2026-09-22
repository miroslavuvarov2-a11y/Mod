package net.mcreator.tbm.procedures;

import java.util.Comparator;
import net.mcreator.tbm.ThemutantmobsmodMod;
import net.mcreator.tbm.entity.ThetrueessenceEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class QlProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
            entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
            _level.m_7967_(entityToSpawn);
         }

         Vec3 _center = new Vec3(x, y, z);

         for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
            if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
               entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
            }
         }

         ThemutantmobsmodMod.queueServerWork(5, () -> {
            if (world instanceof ServerLevel _level) {
               LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
               entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
               _level.m_7967_(entityToSpawn);
            }

            Vec3 _center = new Vec3(x, y, z);

            for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
               if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                  entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
               }
            }

            ThemutantmobsmodMod.queueServerWork(5, () -> {
               if (world instanceof ServerLevel _level) {
                  LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                  entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                  _level.m_7967_(entityToSpawn);
               }

               Vec3 _center = new Vec3(x, y, z);

               for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                  if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                     entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                  }
               }

               ThemutantmobsmodMod.queueServerWork(5, () -> {
                  if (world instanceof ServerLevel _level) {
                     LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                     entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                     _level.m_7967_(entityToSpawn);
                  }

                  Vec3 _center = new Vec3(x, y, z);

                  for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                     if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                        entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                     }
                  }

                  ThemutantmobsmodMod.queueServerWork(5, () -> {
                     if (world instanceof ServerLevel _level) {
                        LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                        entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                        _level.m_7967_(entityToSpawn);
                     }

                     Vec3 _center = new Vec3(x, y, z);

                     for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                        if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                           entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                        }
                     }

                     ThemutantmobsmodMod.queueServerWork(5, () -> {
                        if (world instanceof ServerLevel _level) {
                           LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                           entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                           _level.m_7967_(entityToSpawn);
                        }

                        Vec3 _center = new Vec3(x, y, z);

                        for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                           if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                              entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                           }
                        }

                        ThemutantmobsmodMod.queueServerWork(5, () -> {
                           if (world instanceof ServerLevel _level) {
                              LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                              entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                              _level.m_7967_(entityToSpawn);
                           }

                           Vec3 _center = new Vec3(x, y, z);

                           for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                              if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                 entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                              }
                           }

                           ThemutantmobsmodMod.queueServerWork(5, () -> {
                              if (world instanceof ServerLevel _level) {
                                 LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                 entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                                 _level.m_7967_(entityToSpawn);
                              }

                              Vec3 _center = new Vec3(x, y, z);

                              for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                 if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                    entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                                 }
                              }

                              ThemutantmobsmodMod.queueServerWork(5, () -> {
                                 if (world instanceof ServerLevel _level) {
                                    LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                    entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                                    _level.m_7967_(entityToSpawn);
                                 }

                                 Vec3 _center = new Vec3(x, y, z);

                                 for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                    if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                       entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                                    }
                                 }

                                 ThemutantmobsmodMod.queueServerWork(5, () -> {
                                    if (world instanceof ServerLevel _level) {
                                       LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                       entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                                       _level.m_7967_(entityToSpawn);
                                    }

                                    Vec3 _center = new Vec3(x, y, z);

                                    for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                       if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                          entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                                       }
                                    }

                                    ThemutantmobsmodMod.queueServerWork(5, () -> {
                                       if (world instanceof ServerLevel _level) {
                                          LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                          entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                                          _level.m_7967_(entityToSpawn);
                                       }

                                       Vec3 _center = new Vec3(x, y, z);

                                       for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                          if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                             entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                                          }
                                       }

                                       ThemutantmobsmodMod.queueServerWork(5, () -> {
                                          if (world instanceof ServerLevel _level) {
                                             LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                             entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                                             _level.m_7967_(entityToSpawn);
                                          }

                                          Vec3 _center = new Vec3(x, y, z);

                                          for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                             if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                                entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                                             }
                                          }

                                          ThemutantmobsmodMod.queueServerWork(5, () -> {
                                             if (world instanceof ServerLevel _level) {
                                                LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                                entityToSpawn.m_20219_(Vec3.m_82539_(BlockPos.m_274561_(x + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25), y, z + (double)Mth.m_216271_(RandomSource.m_216327_(), -25, 25))));
                                                _level.m_7967_(entityToSpawn);
                                             }

                                             Vec3 _center = new Vec3(x, y, z);

                                             for(Entity entityiterator : world.m_6443_(Entity.class, (new AABB(_center, _center)).m_82400_((double)Mth.m_216271_(RandomSource.m_216327_(), 30, 60) / (double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.m_20238_(_center))).toList()) {
                                                if (entityiterator != entity && !(entityiterator instanceof ThetrueessenceEntity)) {
                                                   entityiterator.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 250.0F);
                                                }
                                             }

                                          });
                                       });
                                    });
                                 });
                              });
                           });
                        });
                     });
                  });
               });
            });
         });
      }
   }
}
