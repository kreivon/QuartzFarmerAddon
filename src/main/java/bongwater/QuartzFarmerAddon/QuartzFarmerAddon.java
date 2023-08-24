package bongwater.QuartzFarmerAddon;

import bongwater.QuartzFarmerAddon.QuartzFarmer.QuartzFarmer;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class QuartzFarmerAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing QuartzFarmer");

        // Modules
        Modules.get().add(new QuartzFarmer());
    }

    public String getPackage() {
        return "bongwater.QuartzFarmerAddon";
    }
}
