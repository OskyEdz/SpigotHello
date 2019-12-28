package se.peacehult.spigothello;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {

        //On server start and enabling plugin
        System.out.println("Hello server!");

        //Register command
        this.getCommand("welcome").setExecutor(new CommandWelcome());

        //Register Listeners
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }

    @Override
    public void onDisable() {
        //On server stop and disable plugin
        System.out.println("I'm going down...");
    }
}
