package se.peacehult.spigothello;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        //On server start and enabling plugin
        System.out.println("Hello server!");
        //Register command
        this.getCommand("welcome").setExecutor(new CommandWelcome());
    }

    @Override
    public void onDisable() {
        //On server stop and disable plugin
    }
}
