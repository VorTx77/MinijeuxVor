package fr.vortx77.minijeuxvor;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Puissance4YELLO implements Listener {

	@SuppressWarnings("unused")
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {

		Action action = event.getAction();
		ItemStack it = event.getItem();
		
		if (it != null && it.getType() == Material.YELLOW_DYE) {
			if (action == Action.RIGHT_CLICK_BLOCK) {
				Location loc = event.getClickedBlock().getLocation();
				Material block = loc.clone().getBlock().getType();
				
				for (int i = 0; i <= 50; i++) {

						loc.clone().add(0, 0, i).getBlock().setType(Material.YELLOW_WOOL);
						loc.clone().add(0, 7, -4).getBlock().setType(Material.YELLOW_CONCRETE_POWDER);
						break;
					}
				}

			}
		}
	}
	
	

	