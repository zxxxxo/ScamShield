package studio.zxxxxo;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ScamShield.MODID, useMetadata=true, version = ScamShield.VERSION)

public class ScamShield {
    public static final String MODID = "ScamShield";
    public static final String VERSION = "0.0.0";
    @SubscribeEvent
    public void onFirstPlayerJoin(EntityJoinWorldEvent e) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("this works"));
    }
}
