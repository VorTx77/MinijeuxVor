package fr.vortx77.minijeuxvor;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class buildp4testcommand implements Listener, CommandExecutor {

	@EventHandler
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "testp4");
				Location loc = player.getLocation();

				loc.add(0, -1, 0).getBlock().setType(Material.OBSIDIAN); // blocs sous les pied (-0.5 = -1)
				Bukkit.broadcastMessage("§c§l"+player.getName()+"§6 a fait spawn le Puissance 4 §e§l(§cReste§e§l: §2§l10 minute§e§l)");

				player.setFallDistance(0);

				for (int i = -3; i <= 3; i++) {
					loc.clone().add(i, 0, 1).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 2).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 3).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 4).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 5).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 6).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 7).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 8).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 9).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 10).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 11).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 12).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 0).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, -1).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, -2).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 13).getBlock().setType(Material.SPRUCE_PLANKS);
					loc.clone().add(i, 0, 14).getBlock().setType(Material.SPRUCE_PLANKS);
					
					loc.clone().add(i, 1, 5).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 2, 5).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 3, 5).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 4, 5).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 5, 5).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 6, 5).getBlock().setType(Material.GLASS);
					//loc.clone().add(i, 7, 5).getBlock().setType(Material.GLASS);
					//loc.clone().add(i, 8, 5).getBlock().setType(Material.GLASS);

					loc.clone().add(i, 1, 7).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 2, 7).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 3, 7).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 4, 7).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 5, 7).getBlock().setType(Material.GLASS);
					loc.clone().add(i, 6, 7).getBlock().setType(Material.GLASS);
					//loc.clone().add(i, 7, 7).getBlock().setType(Material.GLASS);
					//loc.clone().add(i, 8, 7).getBlock().setType(Material.GLASS);
					
					loc.clone().add(i, 1, 2).getBlock().setType(Material.RED_WOOL);
					loc.clone().add(i, 1, 10).getBlock().setType(Material.YELLOW_WOOL);
				
				}

				Bukkit.getScheduler().scheduleSyncDelayedTask(main.Instance, new Runnable() {
					@Override
					public void run() {
						loc.getBlock().setType(Material.AIR);
						
						for (int i = -4; i <= 4; i++) {
							loc.clone().add(i, 0, 1).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 2).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 3).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 4).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 6).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 8).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 9).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 10).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 11).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 12).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 0).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, -1).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, -2).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 13).getBlock().setType(Material.AIR);
							loc.clone().add(i, 0, 14).getBlock().setType(Material.AIR);
							
							loc.clone().add(i, 1, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 2, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 3, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 4, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 5, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 6, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 7, 5).getBlock().setType(Material.AIR);
							loc.clone().add(i, 8, 5).getBlock().setType(Material.AIR);

							loc.clone().add(i, 1, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 2, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 3, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 4, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 5, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 6, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 7, 7).getBlock().setType(Material.AIR);
							loc.clone().add(i, 8, 7).getBlock().setType(Material.AIR);
							
							loc.clone().add(i, 1, 2).getBlock().setType(Material.AIR);
							loc.clone().add(i, 1, 10).getBlock().setType(Material.AIR);

						}
					}
				}, 10000L);
			}
		return false;
		}
	}

