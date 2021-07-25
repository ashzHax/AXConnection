package axc.AXConnection;

import axc.AXConnection.event.*;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class AXConnection extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        this.getServer().getPluginManager().registerEvents(new PlayerJoin(this),this);
        this.getServer().getPluginManager().registerEvents(new PlayerQuit(this),this);
    }

    @Override
    public void onDisable() {

    }

}
