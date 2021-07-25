package axc.AXConnection.event;

import axc.AXConnection.AXConnection;
import axc.AXConnection.utility.Message;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {

    private AXConnection plugin;

    public PlayerQuit(AXConnection p) {
        this.plugin = p;
    }

    @EventHandler
    public void HandlePlayerQuitEvent(PlayerQuitEvent event)
    {
        event.setQuitMessage(Message.getConfigMessage(plugin, Message.LogType.PLAYER_QUIT, event.getPlayer().getName()));
//        if(plugin.getServer().getOnlinePlayers().size() == 1) {
//            plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), "fcp resume");
//            plugin.getServer().getConsoleSender().sendMessage("--! RESUMING FCP CHUNK LOADER");
//        }
    }

}
