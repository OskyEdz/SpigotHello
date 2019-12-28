package se.peacehult.spigothello;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandWelcome implements CommandExecutor {

    // Called using the command
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Hello " + player.getName() + "! My name is Evil...");
        }

        return true;
    }
}
