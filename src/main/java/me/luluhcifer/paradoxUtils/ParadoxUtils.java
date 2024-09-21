package me.luluhcifer.paradoxUtils;

import me.luluhcifer.paradoxUtils.commands.Comandos;
import me.luluhcifer.paradoxUtils.events.Eventos;
import org.bukkit.plugin.java.JavaPlugin;

public final class ParadoxUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting");
        this.getCommand("espadaluz").setExecutor(new Comandos());
        this.getCommand("cetrofogo").setExecutor(new Comandos());
        this.getCommand("cetrowither").setExecutor(new Comandos());
        this.getCommand("cetrofim").setExecutor(new Comandos());
        this.getServer().getPluginManager().registerEvents(new Eventos(), this);
    }
}
