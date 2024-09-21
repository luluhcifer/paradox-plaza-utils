package me.luluhcifer.paradoxUtils.commands;

import me.luluhcifer.paradoxUtils.itens.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandos implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage(ChatColor.RED + "Esse comando só pode ser utilizado por players!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("espadaluz")) {
            player.sendMessage(ChatColor.GOLD + "Que a luz lhe proteja!");
            player.getInventory().addItem(ItemManager.createLightSword());
        } else if (cmd.getName().equalsIgnoreCase("cetrofogo")) {
            player.sendMessage(ChatColor.GOLD + "Transforme tudo em " + ChatColor.GRAY + "cinzas!");
            player.getInventory().addItem(ItemManager.createFireScepter());
        } else if (cmd.getName().equalsIgnoreCase("cetrowither")) {
            player.sendMessage("uwu");
            player.getInventory().addItem(ItemManager.createWitherScepter());
        } else if (cmd.getName().equalsIgnoreCase("cetrofim")) {
            player.sendMessage("e");
            player.getInventory().addItem(ItemManager.createTeleportWand());
        }

        return true;
    }
}
