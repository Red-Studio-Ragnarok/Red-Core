package io.redstudioragnarok.redcore;

import io.redstudioragnarok.redcore.ticking.RedClientTickEvent;
import io.redstudioragnarok.redcore.ticking.RedClientTicker;
import io.redstudioragnarok.redcore.utils.ModReference;
import io.redstudioragnarok.redcore.utils.OptiNotFine;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//   /$$$$$$$                  /$$        /$$$$$$
//  | $$__  $$                | $$       /$$__  $$
//  | $$  \ $$  /$$$$$$   /$$$$$$$      | $$  \__/  /$$$$$$   /$$$$$$   /$$$$$$
//  | $$$$$$$/ /$$__  $$ /$$__  $$      | $$       /$$__  $$ /$$__  $$ /$$__  $$
//  | $$__  $$| $$$$$$$$| $$  | $$      | $$      | $$  \ $$| $$  \__/| $$$$$$$$
//  | $$  \ $$| $$_____/| $$  | $$      | $$    $$| $$  | $$| $$      | $$_____/
//  | $$  | $$|  $$$$$$$|  $$$$$$$      |  $$$$$$/|  $$$$$$/| $$      |  $$$$$$$
//  |__/  |__/ \_______/ \_______/       \______/  \______/ |__/       \_______/
@Mod(modid = ModReference.ID, name = ModReference.NAME, version = ModReference.VERSION, updateJSON = "https://raw.githubusercontent.com/Red-Studio-Ragnarok/Red-Core/main/update.json")
public final class RedCore {

    private static boolean clientTickerStarted = false;
    private static boolean forceOptiFineFastRenderOff = false;

    /**
     * Starts the client ticker.
     * <p>
     * This method registers {@link RedClientTicker} in the {@link MinecraftForge} event bus if the client ticker has not already been started.
     * <p>
     * The client ticker is responsible for ticking and thus sending the {@link RedClientTickEvent}.
     *
     * @author Desoroxxx
     * @since 0.3
     */
    @SideOnly(Side.CLIENT)
    public static void startClientTicker() {
        if (clientTickerStarted)
            return;

        MinecraftForge.EVENT_BUS.register(RedClientTicker.class);
        clientTickerStarted = true;
    }

    @SideOnly(Side.CLIENT)
    public static void forceOptiFineFastRenderOff() {
        if (forceOptiFineFastRenderOff)
            return;

        startClientTicker();

        MinecraftForge.EVENT_BUS.register(OptiNotFine.class);
        forceOptiFineFastRenderOff = true;
    }
}
