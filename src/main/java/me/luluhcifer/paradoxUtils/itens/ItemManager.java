package me.luluhcifer.paradoxUtils.itens;

import dev.aurelium.auraskills.api.AuraSkillsBukkit;
import dev.aurelium.auraskills.api.item.ModifierType;
import dev.aurelium.auraskills.api.skill.Skills;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack createLightSword() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();

        meta.setDisplayName("§6Espada da §eLuz");
        lore.add("");
        lore.add("§7A espada banhada a ouro e energia sagrada");
        lore.add("§7pura quanto a lágrima de um anjo.");
        lore.add("");
        lore.add("§7Purifica o mal.");
        lore.add("");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.SHARPNESS, 50, true);
        meta.addEnchant(Enchantment.SMITE, 500, true);
        meta.addEnchant(Enchantment.LOOTING, 15, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack createFireScepter() {
        ItemStack item = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();

        meta.setDisplayName("§6Cetro de Fogo");
        lore.add("");
        lore.add("§7Cetro forjado a partir dos restos mortais");
        lore.add("§7de um ser ígneo.");
        lore.add("");
        lore.add("§5§lBola de fogo §7- §6CLIQUE-DIREITO");
        lore.add("§7- Dispara uma bola de fogo poderosa.");
        lore.add("");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 15, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack createWitherScepter() {
        ItemStack item = new ItemStack(Material.BREEZE_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();

        meta.setDisplayName("§5Costela do Wither");
        lore.add("");
        lore.add("§7Costela do Wither capaz de soltar");
        lore.add("§7cabeças de wither.");
        lore.add("");
        lore.add("§5§lCabeça de Wither §7- §6CLIQUE-DIREITO");
        lore.add("§7- Lança uma cabeça de Wither.");
        lore.add("");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.SOUL_SPEED, 15, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack createTeleportWand() {
        ItemStack item = new ItemStack(Material.POPPED_CHORUS_FRUIT, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();


        meta.setDisplayName("§5Coração do Fim");
        lore.add("");
        lore.add("§7Coração retirado do Dragão do Fim");
        lore.add("§7capaz de teleportar seu usuário.");
        lore.add("§5§lTeleporte §7- §6CLIQUE-DIREITO");
        lore.add("§7- Teleporta o usuário para 7 blocos");
        lore.add("§7a sua frente.");
        lore.add("");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.LURE, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);
        return item;
    }
}
