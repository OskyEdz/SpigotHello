package se.peacehult.spigothello;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyListener extends se.peacehult.spigothello.Main implements Listener {

    //When a player joins, type in chat to all players.
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Bukkit.broadcastMessage("Welcome " + player.getName() + " to the server!");
        if (config.getBoolean("youAreAwesome")) {
            player.sendMessage("You are awesome!");
        } else {
            player.sendMessage("You are not awesome...");
        }
    }

    //Executes before the second method because it has a much lower priority.
    @EventHandler (priority = EventPriority.LOWEST)
        public void onPlayerChat1(AsyncPlayerChatEvent event) { //Redirects all chat to async
            System.out.println("Who am I?"); //Prints to console
            event.setCancelled(true);
        }

    // Will not execute unless another listener with a lower priority has uncancelled the event.
    @EventHandler (priority = EventPriority.HIGHEST, ignoreCancelled = true)
        public void onPlayerChat2(AsyncPlayerChatEvent event) {
        System.out.println("This shouldn't be executing");
    }

}
