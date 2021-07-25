package axc.AXConnection.event;

import axc.AXConnection.AXConnection;
import axc.AXConnection.utility.Message;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    private AXConnection plugin;

    public PlayerJoin(AXConnection p) {
        this.plugin = p;
    }

    @EventHandler
    public void HandlePlayerJoinEvent(PlayerJoinEvent event)
    {
        event.setJoinMessage(Message.getConfigMessage(plugin, Message.LogType.PLAYER_JOIN, event.getPlayer().getName()));
//        plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), "fcp pause");
//        if(event.getPlayer().getName() == "ashzHax") {
//            event.setJoinMessage("");
//        }
    }

}
