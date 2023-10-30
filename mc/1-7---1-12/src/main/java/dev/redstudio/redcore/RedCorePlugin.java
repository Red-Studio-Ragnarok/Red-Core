package dev.redstudio.redcore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.Map;

import static dev.redstudio.redcore.ProjectConstants.NAME;

@Mod(modid = "redcore", useMetadata = true)
@IFMLLoadingPlugin.Name(NAME)
@cpw.mods.fml.relauncher.IFMLLoadingPlugin.Name(NAME)
@IFMLLoadingPlugin.SortingIndex(Integer.MIN_VALUE + 2)
@cpw.mods.fml.relauncher.IFMLLoadingPlugin.SortingIndex(Integer.MIN_VALUE + 2)
public final class RedCorePlugin implements IFMLLoadingPlugin, cpw.mods.fml.relauncher.IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];

    }

    @Override
    public String getModContainerClass() {
        return null;
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
}
