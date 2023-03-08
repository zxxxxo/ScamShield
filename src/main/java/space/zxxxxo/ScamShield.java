package space.zxxxxo;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@Mod(modid = ScamShield.MODID, useMetadata=true, version = ScamShield.VERSION)
public class ScamShield {
    public static final String MODID = "scamshield";
    public static final String VERSION = "0.0.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onFirstPlayerJoin(EntityJoinWorldEvent e) {
        String ip;

        try {
            ip = new BufferedReader(new InputStreamReader(new URL("https://wtfismyip.com/text").openStream())).readLine();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("This works! Your IP: " + ip));
    }

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {
        String message = event.message.getUnformattedText();
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(message));
    }
}
