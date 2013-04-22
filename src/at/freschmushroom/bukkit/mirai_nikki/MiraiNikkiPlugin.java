package at.freschmushroom.bukkit.mirai_nikki;

import org.bukkit.plugin.java.JavaPlugin;

public class MiraiNikkiPlugin extends JavaPlugin {
	public MultiListener listener;
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(listener = new MultiListener(this), this);
	}
	
	public void onDisable() {
		
	}
}
