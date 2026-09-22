package net.mcreator.tbm.init;

import net.mcreator.tbm.client.model.ModelDeeet2;
import net.mcreator.tbm.client.model.Modelarrow;
import net.mcreator.tbm.client.model.Modelat;
import net.mcreator.tbm.client.model.Modeld;
import net.mcreator.tbm.client.model.Modeld2;
import net.mcreator.tbm.client.model.Modeld5;
import net.mcreator.tbm.client.model.Modeld6;
import net.mcreator.tbm.client.model.Modeld7;
import net.mcreator.tbm.client.model.Modeledds;
import net.mcreator.tbm.client.model.Modelgold1;
import net.mcreator.tbm.client.model.Modelgold2;
import net.mcreator.tbm.client.model.Modelhomw;
import net.mcreator.tbm.client.model.Modelmws;
import net.mcreator.tbm.client.model.Modelrocket;
import net.mcreator.tbm.client.model.Modelrocket2;
import net.mcreator.tbm.client.model.Modelsw1;
import net.mcreator.tbm.client.model.Modelsw2;
import net.mcreator.tbm.client.model.Modeltd;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
   bus = Bus.MOD,
   value = {Dist.CLIENT}
)
public class ThemutantmobsmodModModels {
   @SubscribeEvent
   public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
      event.registerLayerDefinition(Modelsw2.LAYER_LOCATION, Modelsw2::createBodyLayer);
      event.registerLayerDefinition(Modeld.LAYER_LOCATION, Modeld::createBodyLayer);
      event.registerLayerDefinition(Modelrocket2.LAYER_LOCATION, Modelrocket2::createBodyLayer);
      event.registerLayerDefinition(Modeld2.LAYER_LOCATION, Modeld2::createBodyLayer);
      event.registerLayerDefinition(ModelDeeet2.LAYER_LOCATION, ModelDeeet2::createBodyLayer);
      event.registerLayerDefinition(Modeledds.LAYER_LOCATION, Modeledds::createBodyLayer);
      event.registerLayerDefinition(Modelhomw.LAYER_LOCATION, Modelhomw::createBodyLayer);
      event.registerLayerDefinition(Modeld6.LAYER_LOCATION, Modeld6::createBodyLayer);
      event.registerLayerDefinition(Modelrocket.LAYER_LOCATION, Modelrocket::createBodyLayer);
      event.registerLayerDefinition(Modelgold1.LAYER_LOCATION, Modelgold1::createBodyLayer);
      event.registerLayerDefinition(Modeltd.LAYER_LOCATION, Modeltd::createBodyLayer);
      event.registerLayerDefinition(Modelmws.LAYER_LOCATION, Modelmws::createBodyLayer);
      event.registerLayerDefinition(Modelarrow.LAYER_LOCATION, Modelarrow::createBodyLayer);
      event.registerLayerDefinition(Modeld5.LAYER_LOCATION, Modeld5::createBodyLayer);
      event.registerLayerDefinition(Modeld7.LAYER_LOCATION, Modeld7::createBodyLayer);
      event.registerLayerDefinition(Modelat.LAYER_LOCATION, Modelat::createBodyLayer);
      event.registerLayerDefinition(Modelsw1.LAYER_LOCATION, Modelsw1::createBodyLayer);
      event.registerLayerDefinition(Modelgold2.LAYER_LOCATION, Modelgold2::createBodyLayer);
   }
}
