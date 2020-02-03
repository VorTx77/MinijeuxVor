package fr.vortx77.minijeuxvor;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class menudejeux implements Listener, CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "h1");
			Inventory inv = Bukkit.createInventory(null, 3 * 9, "§6§lMenu de jeux");

			ItemStack p1 = new ItemStack(Material.IRON_INGOT, 1);
			ItemMeta p1s = p1.getItemMeta();
			p1s.setDisplayName("§4§lSOON...");
			p1s.setLore(Arrays.asList("§c§lProchainement"));
			p1.setItemMeta(p1s);
			
			ItemStack p2 = new ItemStack(Material.GOLD_INGOT, 1);
			ItemMeta p2s = p2.getItemMeta();
			p2s.setDisplayName("§4§lSOON...");
			p2s.setLore(Arrays.asList("§c§lProchainement"));
			p2.setItemMeta(p2s);
			
			ItemStack p3 = new ItemStack(Material.DIAMOND, 1);
			ItemMeta p3s = p3.getItemMeta();
			p3s.setDisplayName("§3§lPuissance §b§l4");
			p3s.setLore(Arrays.asList("§5§lClick gauche"));
			p3s.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
			p3s.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			p3.setItemMeta(p3s);
			
			ItemStack p4 = new ItemStack(Material.EMERALD, 1);
			ItemMeta p4s = p4.getItemMeta();
			p4s.setDisplayName("§2§lTic §a§lTac §2§lToe");
			p4s.setLore(Arrays.asList("§5§lClick gauche"));
			p4s.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
			p4s.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			p4.setItemMeta(p4s);
			
			ItemStack p5 = new ItemStack(Material.COAL, 1);
			ItemMeta p5s = p5.getItemMeta();
			p5s.setDisplayName("§4§lSOON...");
			p5s.setLore(Arrays.asList("§c§lProchainement"));
			p5.setItemMeta(p5s);

			inv.setItem(9, p1);
			inv.setItem(11, p2);
			inv.setItem(13, p3);
			inv.setItem(15, p4);
			inv.setItem(17, p5);
			player.openInventory(inv);
		}
		return false;
	}

	@SuppressWarnings({ "unused" })
	@EventHandler
	public void onClick(InventoryClickEvent event) {

		Inventory inv = event.getInventory();
		Player player = (Player) event.getWhoClicked();
		ItemStack current = event.getCurrentItem();

		if (current == null)
			event.setCancelled(true);
		if(current.getType() == Material.IRON_INGOT);
	
		
	}
}