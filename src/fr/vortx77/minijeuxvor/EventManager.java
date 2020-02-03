package fr.vortx77.minijeuxvor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventManager {

	public static void registerEvents(main pl) {
		PluginManager pm = Bukkit.getPluginManager();

		pm.registerEvents(new Puissance4(), pl);
		pm.registerEvents(new BuildPuissance4(), pl);
		pm.registerEvents(new Puissance4RED(), pl);
		pm.registerEvents(new Puissance4YELLO(), pl);
		pm.registerEvents(new Puissance4Gui(), pl);
		pm.registerEvents(new equipep4(), pl);
		
		pm.registerEvents(new menudejeux(), pl);
		pm.registerEvents(new buildp4testcommand(), pl);
		pm.registerEvents(new equipep4(), pl);
		
		pm.registerEvents(new TicTacToe(), pl);
		
	}

}

//ItemStack p1 = new ItemStack(Material.IRON_INGOT, 1);
//ItemMeta p1s = p1.getItemMeta();
//p1s.setDisplayName("§4§lSOON...");
//p1s.setLore(Arrays.asList("§c§lProchainement"));
//p1.setItemMeta(p1s);
//
//ItemStack p2 = new ItemStack(Material.GOLD_INGOT, 1);
//ItemMeta p2s = p2.getItemMeta();
//p2s.setDisplayName("§4§lSOON...");
//p2s.setLore(Arrays.asList("§c§lProchainement"));
//p2.setItemMeta(p2s);
//
//ItemStack p3 = new ItemStack(Material.DIAMOND, 1);
//ItemMeta p3s = p3.getItemMeta();
//p3s.setDisplayName("§3§lPuissance §b§l4");
//p3s.setLore(Arrays.asList("§5§lClick gauche"));
//p3s.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
//p3s.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//p3.setItemMeta(p3s);
//
//ItemStack p4 = new ItemStack(Material.EMERALD, 1);
//ItemMeta p4s = p4.getItemMeta();
//p4s.setDisplayName("§2§lTic §a§lTac §2§lToe");
//p4s.setLore(Arrays.asList("§5§lClick gauche"));
//p4s.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
//p4s.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//p4.setItemMeta(p4s);
//
//ItemStack p5 = new ItemStack(Material.COAL, 1);
//ItemMeta p5s = p5.getItemMeta();
//p5s.setDisplayName("§4§lSOON...");
//p5s.setLore(Arrays.asList("§c§lProchainement"));
//p5.setItemMeta(p5s);
//
//inv.setItem(9, p1);
//inv.setItem(11, p2);
//inv.setItem(13, p3);
//inv.setItem(15, p4);
//inv.setItem(17, p5);