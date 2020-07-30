package me.winsdominoes.plugin.anarchyessentials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.util.List;

public class MainCommand implements CommandExecutor {
    AnarchyEssentials plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        plugin = AnarchyEssentials.getPlugin(AnarchyEssentials.class);

        if (command.getName().equals("help")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                List<String> helpCommandList = plugin.config.getStringList("help");
                String helpCommand = String.join("\n", helpCommandList);
                player.sendMessage(helpCommand);

                return false;
            } else {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "bukkit:help");
            }
        }

        if (command.getName().equals("vote")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                List<String> helpCommandList = plugin.config.getStringList("vote");
                String helpCommand = String.join("\n", helpCommandList);
                player.sendMessage(helpCommand);

                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }

        if (command.getName().equals("donate")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                List<String> helpCommandList = plugin.config.getStringList("donate");
                String helpCommand = String.join("\n", helpCommandList);
                player.sendMessage(helpCommand);

                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }
         /*
         if (command.getName().equals("rules")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                List<String> helpCommandList = plugin.config.getStringList("rules");
                String helpCommand = String.join("\n", helpCommandList);
                player.sendMessage(helpCommand);

                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }


          */
        if (command.getName().equals("info")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                List<String> helpCommandList = plugin.config.getStringList("info");
                String helpCommand = String.join("\n", helpCommandList);
                player.sendMessage(helpCommand);

                return false;
            } else {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "info");
            }
        }

        if (command.getName().equals("rules")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                String helpCommand = plugin.config.getString("rules");
                player.kickPlayer(helpCommand);
                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }


        if (command.getName().equals("dupe")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setHealth(0);
                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }

        if (command.getName().equals("fuck")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setHealth(0);
                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }

        if (command.getName().equals("howto")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                List<String> helpCommandList = plugin.config.getStringList("howto");
                String helpCommand = String.join("\n", helpCommandList);
                player.sendMessage(helpCommand);
                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }

        if (command.getName().equals("shit")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                List<String> helpCommandList = plugin.config.getStringList("shit");
                String helpCommand = String.join("\n", helpCommandList);
                player.sendMessage(helpCommand);
                player.setHealth(0);
                return false;
            } else {
                System.out.println("You must be a player to use this command");
            }
        }

        if (command.getName().equals("AEReload")) {
            plugin.reloadConfig();
            sender.sendMessage(ChatColor.GREEN + "[AnarchyEssentials] Reloaded Config");
        }
        
        return true;
    }
}
