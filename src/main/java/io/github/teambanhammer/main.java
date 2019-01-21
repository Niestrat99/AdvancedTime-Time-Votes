package io.github.teambanhammer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    public void onEnable(){
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("time")){
            if (sender instanceof Player){
                Player player = (Player)sender;
                if (args.length>0){
                    if (args[0].equalsIgnoreCase("help")) {
                        if (args.length > 1) {
                            if (args[1].equalsIgnoreCase("admin")) {
                                sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "-{ Admin Commands }-");
                                sender.sendMessage(ChatColor.GOLD + "/time off " + ChatColor.WHITE + "- " + ChatColor.GREEN + "Disables the time vote command.");
                                sender.sendMessage(ChatColor.GOLD + "/time on " + ChatColor.WHITE + "- " + ChatColor.GREEN + "Enables the time vote command.");
                                sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "-{+}-");
                                return false;
                            }
                        } else {
                            sender.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Time Votes Help");
                            sender.sendMessage(ChatColor.YELLOW + "/time vote <Time> " + ChatColor.WHITE + "- " + ChatColor.GREEN + "Starts a vote to change the time.");
                            return false;
                        }
                    } else if (args[0].equalsIgnoreCase("vote")){
                        if (args.length>1){
                            if (args[1])
                        }
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "ERROR: " + ChatColor.RED + "Missing argument, type " + ChatColor.GOLD + "/time help" + ChatColor.RED + "!");
                    return false;
                }
            }
        }
    }
}
