package com.itaromi.combatcore;

import commands.blabla;
import org.bukkit.plugin.java.JavaPlugin;

public final class Combatcore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Combatcore: Plugin enabled");

        getCommand("blabla").setExecutor(new blabla());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Combatcore: Plugin disabled");
    }
}
