package dev.redstudio.redcore.asm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import static dev.redstudio.redcore.ProjectConstants.*;

@Mod(modid = ID, name = NAME, version = VERSION, updateJSON = "https://forge.curseupdate.com/873867/" + ID)
@IFMLLoadingPlugin.Name(NAME)
@IFMLLoadingPlugin.SortingIndex(Integer.MIN_VALUE)
public final class RedCorePlugin extends RedLoadingPlugin {
}
