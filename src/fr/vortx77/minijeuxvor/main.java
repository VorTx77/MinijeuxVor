package fr.vortx77.minijeuxvor;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	public static main Instance;
	
	
	@SuppressWarnings("static-access")
	@Override
	public void onEnable() {
		System.out.println("|=================================================|");
		System.out.println("|=================================================|");
		System.out.println("|============|Le plugin MiniJeuxVor ON|===========|");
		System.out.println("|=================================================|");
		System.out.println("|=================================================|");
		
		EventManager.registerEvents(this);
		this.Instance = this;
		
		getCommand("jeux").setExecutor(new Puissance4Gui());
		getCommand("h1").setExecutor(new menudejeux());
		getCommand("testp4").setExecutor(new buildp4testcommand());
	}
	@Override
	public void onDisable() {
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println("|========|Le plugin MiniJeuxVor OFF|=========|");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
	}

}

