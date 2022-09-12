package com.github.claythve.claylog.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCookEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseArmorEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockExplodeEvent;

public class BlockListener implements Listener {
	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockBreak(BlockBreakEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockBurn(BlockBurnEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockCook(BlockCookEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockCook(BlockDamageEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockDispenseArmor(BlockDispenseArmorEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockDispense(BlockDispenseEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockDropItem(BlockDropItemEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlock(BlockEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockExp(BlockExpEvent event) {

	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockExplode(BlockExplodeEvent event) {

	}
}