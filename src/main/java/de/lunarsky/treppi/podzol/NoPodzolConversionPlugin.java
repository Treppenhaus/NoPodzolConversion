package de.lunarsky.treppi.podzol;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoPodzolConversionPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onStructureGrow(StructureGrowEvent e) {
        if(e.getSpecies() == TreeType.MEGA_REDWOOD) {
            e.getBlocks().removeIf(blockState -> blockState.getType() == Material.PODZOL);
        }
    }
}
