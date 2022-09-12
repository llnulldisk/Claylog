package com.github.claythve.claylog.listener;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import com.github.claythve.claylog.Claylog;

public class ListenerHandler {
	public ListenerHandler(Claylog plugin) {
		PluginManager pluginManager = plugin.getServer().getPluginManager();
		
		pluginManager.registerEvents((Listener) new BlockListener(), (Plugin) plugin);
	}
}