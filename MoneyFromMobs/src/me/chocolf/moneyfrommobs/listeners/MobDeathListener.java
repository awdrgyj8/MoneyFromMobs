package me.chocolf.moneyfrommobs.listeners;

import me.chocolf.moneyfrommobs.MoneyFromMobs;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class MobDeathListener implements Listener {
    private final MoneyFromMobs plugin;

    public MobDeathListener(MoneyFromMobs plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public void onEntityDeath(EntityDeathEvent event) {
        event.getEntity().removeMetadata("MfMSpawnReason", plugin);
    }
}
