package se.peacehult.spigothello;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CoolEvent extends Event {

    private final String playerName;
    private boolean isCancelled; // True/false if event is cancelled

    public CoolEvent(String playerName) { //Register the players name in the event
        this.playerName = playerName;
        this.isCancelled = false;
    }

    public boolean isCancelled() {                          // Make Event Cancellable
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList(); // Need these methods because Spigot uses
                                                                   // the HandlerList class to separate other
                                                                   // EventHandlers from listening to other events
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public String getPlayerName() {
        return this.playerName;
    }

}
