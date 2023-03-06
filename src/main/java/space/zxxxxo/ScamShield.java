package space.zxxxxo;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.jna.platform.win32.Crypt32Util;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.apache.commons.lang3.StringEscapeUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;

@Mod(modid = ScamShield.MODID, useMetadata=true, version = ScamShield.VERSION)

public class ScamShield {
    public static final String MODID = "ScamShield";
    public static final String VERSION = "0.0.0";
    String ip = new BufferedReader(new InputStreamReader(new URL("https://checkip.amazonaws.com/").openStream())).readLine();

    public ScamShield() throws IOException {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("IO Execption occured!"));
    }

    @SubscribeEvent
    public void onFirstPlayerJoin(EntityJoinWorldEvent e) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("This works! Your Ip: " +  ip));
    }
}
