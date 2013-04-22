package at.freschmushroom.bukkit.mirai_nikki.diaries;

import org.bukkit.entity.Player;

import at.freschmushroom.bukkit.mirai_nikki.MiraiNikkiPlugin;

public abstract class Diary {
	public final MiraiNikkiPlugin plugin;
	public Player owner;
	
	public Diary(MiraiNikkiPlugin plugin, Player owner) {
		this.plugin = plugin;
		this.owner = owner;
	}
	
	
	public abstract String[] getEntries();
	public abstract int getNumber();
}
