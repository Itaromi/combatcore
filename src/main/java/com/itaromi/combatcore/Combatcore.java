package com.itaromi.combatcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class Combatcore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Combatcore: Plugin enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Combatcore: Plugin disabled");
    }
}
