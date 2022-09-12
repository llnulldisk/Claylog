package com.github.claythve.claylog;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.claythve.claylog.listener.ListenerHandler;

public class Claylog extends JavaPlugin {

	@Override
	public void onEnable() {
		new ListenerHandler(this);
	}

	@Override
	public void onDisable() {

	}
}