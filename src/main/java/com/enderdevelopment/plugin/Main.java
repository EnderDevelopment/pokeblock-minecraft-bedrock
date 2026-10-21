package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled!");
        this.getCommand("ciao").setExecutor(new GreetCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}