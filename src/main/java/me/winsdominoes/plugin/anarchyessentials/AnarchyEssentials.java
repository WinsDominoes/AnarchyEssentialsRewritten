package me.winsdominoes.plugin.anarchyessentials;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public final class AnarchyEssentials extends JavaPlugin {

    FileConfiguration config;
    File cfile;
    public static AnarchyEssentials plugin;

    @Override
    public void onEnable() {
        plugin = this;

        cfile = new File(plugin.getDataFolder(), "config.yml");

        if (!cfile.exists()) {
            try (InputStream in = getResource("config.yml")) {
                Files.copy(in, cfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        config = YamlConfiguration.loadConfiguration(cfile);

        // Set executor of command. You may want some Tab autocomplete. Yes?
        getCommand("AEreload").setExecutor(new MainCommand());

        getCommand("help").setExecutor(new MainCommand());

        getCommand("vote").setExecutor(new MainCommand());

        getCommand("donate").setExecutor(new MainCommand());

        getCommand("rules").setExecutor(new MainCommand());

        getCommand("info").setExecutor(new MainCommand());

        getCommand("shit").setExecutor(new MainCommand());

        getCommand("fuck").setExecutor(new MainCommand());

        getCommand("howto").setExecutor(new MainCommand());

        getCommand("dupe").setExecutor(new MainCommand());

        getCommand("home").setExecutor(new MainCommand());

        getCommand("sethome").setExecutor(new MainCommand());

        getCommand("tpa").setExecutor(new MainCommand());

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void reloadConfig() {
        // if file doesn't exist it creates one and loads data from recource folder
        if (!cfile.exists()) {
            try (InputStream in = getResource("config.yml")) {
                Files.copy(in, cfile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // overwrite old config
        config = YamlConfiguration.loadConfiguration(cfile);
    }
}
