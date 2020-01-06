package se.peacehult.spigothello;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    final FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {

        //On server start and enabling plugin
        System.out.println("Hello server!");

        //Register command
        this.getCommand("welcome").setExecutor(new CommandWelcome());

        //Register Listeners
        getServer().getPluginManager().registerEvents(this, this);

        // Default config values

        config.addDefault("youAreAwesome", true);
        config.options().copyDefaults(true);
        saveConfig();

    }

    @Override
    public void onDisable() {
        //On server stop and disable plugin
        System.out.println("I'm going down...");
    }
}
