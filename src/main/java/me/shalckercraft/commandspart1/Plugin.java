package me.shalckercraft.commandspart1;

import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // die - kills the player
        if (command.getName().equalsIgnoreCase("die")) {

            if (sender instanceof Player) {

                Player p = (Player) sender;
                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "You have opted to die.");
            } else if (sender instanceof ConsoleCommandSender) {

                System.out.println("The command was run by the console.");

            } else if (sender instanceof BlockCommandSender) {

                System.out.println("The command was run by command block");

            }
        }

        return true;
    }
}
