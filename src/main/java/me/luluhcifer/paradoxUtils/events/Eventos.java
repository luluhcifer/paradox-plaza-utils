package me.luluhcifer.paradoxUtils.events;

import me.luluhcifer.paradoxUtils.itens.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.LargeFireball;
import org.bukkit.entity.Player;
import org.bukkit.entity.WitherSkull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.UUID;

public class Eventos implements Listener {

    private final HashMap<UUID, Long> cooldown;

    public Eventos() {
        this.cooldown = new HashMap<>();
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getItem() != null) {
                if (player.getInventory().getItemInMainHand().getItemMeta().equals(ItemManager.createFireScepter().getItemMeta())) {
//                    if (!this.cooldown.containsKey(player.getUniqueId()) || System.currentTimeMillis() - cooldown.get(player.getUniqueId()) >= 5000) {
//                        this.cooldown.put(player.getUniqueId(), System.currentTimeMillis());

                        Vector direction = player.getEyeLocation().getDirection();
                        LargeFireball fireball = player.launchProjectile(LargeFireball.class, direction);

                        fireball.getLocation().add(fireball.getVelocity().normalize().multiply(3));
                        fireball.setIsIncendiary(false);
                        fireball.setYield(5f);
                        player.sendMessage(ChatColor.RED + "FOGO");
//                    } else {
//                        player.sendMessage("Em cooldown! ");
//                    }
                }

                if (player.getInventory().getItemInMainHand().getItemMeta().equals(ItemManager.createWitherScepter().getItemMeta())) {
                    if (!this.cooldown.containsKey(player.getUniqueId()) || System.currentTimeMillis() - cooldown.get(player.getUniqueId()) >= 5000) {
                        this.cooldown.put(player.getUniqueId(), System.currentTimeMillis());

                        Vector direction = player.getEyeLocation().getDirection();
                        WitherSkull witherskull = player.launchProjectile(WitherSkull.class);

                        player.sendMessage("oi");
                        witherskull.setVelocity(direction.multiply(3));
                        witherskull.setCharged(true);
                        witherskull.getLastDamageCause().setDamage(15);
                    } else {
                        player.sendMessage("Cooldown!");
                    }
                }

                if (player.getInventory().getItemInMainHand().getItemMeta().equals(ItemManager.createTeleportWand().getItemMeta())) {
                    Vector direction = player.getEyeLocation().getDirection();

                    // Ver se tem bloco pra não dar tp
                    if (player.getEyeLocation().getBlock().isPassable()) {
                        player.teleport(player.getLocation().add(direction.multiply(7)));
                    } else {
                        player.sendMessage("Não tem como teleportar!");
                    }
                }
            }
        }
    }
}
