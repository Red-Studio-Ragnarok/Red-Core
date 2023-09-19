package dev.redstudio.redcore;

import com.google.common.eventbus.EventBus;
import dev.redstudio.redcore.utils.ProjectConstants;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.Map;

import static dev.redstudio.redcore.utils.ProjectConstants.*;

//   /$$$$$$$                  /$$        /$$$$$$
//  | $$__  $$                | $$       /$$__  $$
//  | $$  \ $$  /$$$$$$   /$$$$$$$      | $$  \__/  /$$$$$$   /$$$$$$   /$$$$$$
//  | $$$$$$$/ /$$__  $$ /$$__  $$      | $$       /$$__  $$ /$$__  $$ /$$__  $$
//  | $$__  $$| $$$$$$$$| $$  | $$      | $$      | $$  \ $$| $$  \__/| $$$$$$$$
//  | $$  \ $$| $$_____/| $$  | $$      | $$    $$| $$  | $$| $$      | $$_____/
//  | $$  | $$|  $$$$$$$|  $$$$$$$      |  $$$$$$/|  $$$$$$/| $$      |  $$$$$$$
//  |__/  |__/ \_______/ \_______/       \______/  \______/ |__/       \_______/
@IFMLLoadingPlugin.Name(NAME)
@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.SortingIndex(Integer.MIN_VALUE + 2)
public final class RedCore implements IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return "dev.redstudio.redcore.RedCore$Container";
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(final Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

    public static class Container extends DummyModContainer {

        public Container() {
            super(new ModMetadata());

            final ModMetadata modMetadata = this.getMetadata();

            modMetadata.modId = ID;
            modMetadata.name = NAME;
            modMetadata.description = "§lRed-Core§r\n\nRed-Core is the foundational framework for Red Studio projects and associated projects. It features robust development utilities, streamlined error logging, and a high-speed, clean vectors' suite.\n\n§lFeatures§r\n\n- §lRedLogger:§r This robust error logger elevates error tracking, offering a clean, user-friendly experience that demystifies complex error data.\n- §lVectors:§r Introducing a comprehensive vector suite that is sleek and speedy, continuously evolving with new features as per necessity.\n- §lMathUtil:§r A purpose-built class providing an array of mathematical methods, engineered with a steadfast focus on rapid processing and calculations.\n- §lStopwatch:§r Tailored for precise profiling, this stopwatch sets itself apart in the burgeoning roster of Java-based stopwatch solutions, by its simplicity and easy of use.\n- §lRedClientTicker:§r A useful ticker that allows you to have ticks every 2, 5 or 10 normal ticks, for things that shouldn't run 20 times a second.\n- §lOptiNotFine:§r A must-have when working with OptiFine compatibility, it allows you to know if OptiFine is installed, whether shaders are loaded, and to force fast render off.\n- §lNetworkUtil:§r Designed to streamline network coding practices, this utility makes writing cleaner, safer, and more efficient networking code effortless.\n- §lJafama:§r Red Core embeds Jafama allowing you to use it in your mods\n\n§lWhy Red-Core?§r\n\nRed-Core sits at the heart of Red Studio's Minecraft 1.12 mods, aiming to make your mod development process more efficient. By providing a set of tailored tools and libraries, we allow you to focus more on designing exciting mods and less on the intricacies of development.\n\nWhat sets us apart is our comprehensive Javadoc documentation. We believe good documentation is the cornerstone of effective development. Every method in Red-Core comes with detailed Javadoc comments, making the technical information and guidance you need just a ctrl-click away.\n\nJoin us in enhancing Red-Core! We believe in constant evolution and the power of community-driven development. Whether you're a contributor or a user in the Minecraft modding community, your experience matters. We're here to ensure it's the best it can be.";
            modMetadata.url = "https://www.curseforge.com/minecraft/mc-mods/red-core";
            modMetadata.updateJSON = "https://raw.githubusercontent.com/Red-Studio-Ragnarok/Red-Core/main/update.json";
            modMetadata.logoFile = "/logo.png";
            modMetadata.version = VERSION;
            modMetadata.authorList.add("Red Studio");
            modMetadata.credits = "Desoroxxx";
        }

        @Override
        public boolean registerBus(final EventBus eventBus, final LoadController loadController) {
            eventBus.register(this);
            return true;
        }
    }
}
