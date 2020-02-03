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

public class Puissance4Gui implements Listener, CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jeux");
			Inventory inv = Bukkit.createInventory(null, 3 * 9, "Name menud");

			ItemStack bs = new ItemStack(Material.COMPASS, 1);
			ItemMeta bs1 = bs.getItemMeta();
			bs1.setDisplayName("§6§lJeux");
			bs1.setLore(Arrays.asList("§5§lMenu de jeux !"));
			bs1.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
			bs1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			bs.setItemMeta(bs1);

			ItemStack anulation = new ItemStack(Material.RED_CONCRETE, 1);
			ItemMeta anulation1 = anulation.getItemMeta();
			anulation1.setDisplayName("§4§lClose");
			anulation.setItemMeta(anulation1);

			ItemStack book = new ItemStack(Material.WRITABLE_BOOK, 1);
			ItemMeta book1 = book.getItemMeta();
			book1.setDisplayName("Info Plugin");
			book.setItemMeta(book1);

			inv.setItem(4, book);
			inv.setItem(22, anulation);
			inv.setItem(13, bs);
			player.openInventory(inv);
		}
		return false;
	}

	@SuppressWarnings({ "unused"})
	@EventHandler
	public void onClick(InventoryClickEvent event) {

		Inventory inv = event.getInventory();
		Player player = (Player) event.getWhoClicked();
		ItemStack current = event.getCurrentItem();
		
		if (current == null)
			return;

		if (current.getType() == Material.RED_CONCRETE && event.getView().getTitle().equalsIgnoreCase("Name menud")) {
			player.closeInventory();
			event.setCancelled(true);
		}
		if (current.getType() == Material.WRITABLE_BOOK) {
			player.closeInventory();
			player.sendMessage("-[Info du Plugin]-");
			event.setCancelled(true);
		}
		if (current.getType() == Material.COMPASS) {
			player.performCommand("h1");
			event.setCancelled(true);
			
		}
	}
}











