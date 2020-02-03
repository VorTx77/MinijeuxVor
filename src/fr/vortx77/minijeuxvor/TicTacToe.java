package fr.vortx77.minijeuxvor;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TicTacToe implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();
		ItemStack it = event.getItem();

		if (it != null && it.getType() == Material.STICK) {
			if (action == Action.RIGHT_CLICK_AIR) {
				Location loc = player.getLocation();

				loc.add(0, -1, 0).getBlock().setType(Material.AIR); // blocs sous les pied (-0.5 = -1)
				Bukkit.broadcastMessage("§c§l"+player.getName()+"§6 a fait spawn le Tic Tac Toe §e§l(§cReste§e§l: §2§l10 minute§e§l)");

				player.setFallDistance(0);

				for (int i = -3; i <= 3; i++) {
					loc.clone().add(i, 0, 9).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 8).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 7).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 6).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 5).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 4).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 3).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 2).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 1).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 1, 5).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 2, 4).getBlock().setType(Material.AIR);
					loc.clone().add(i, 2, 3).getBlock().setType(Material.AIR);
				for (int i1 = -0; i1 <= 5; i1++) {
					loc.clone().add(3, 2, i1).getBlock().setType(Material.SPRUCE_PLANKS);
					
					
				}
				}

				Bukkit.getScheduler().scheduleSyncDelayedTask(main.Instance, new Runnable() {
					@Override
					public void run() {
						loc.getBlock().setType(Material.AIR);
						
						for (int i = -4; i <= 4; i++) {
							loc.clone().add(i, 0, 1).getBlock().setType(Material.AIR);

						}
					}
				}, 10000L);
			}
		}
	}
}




//i largeur
//millieux hauteur
// dernier pronfondeur
