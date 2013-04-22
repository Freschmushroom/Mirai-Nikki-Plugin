package at.freschmushroom.bukkit.mirai_nikki.entries;

public abstract class Entry {
	public final EnumEntryType type;
	
	public Entry(EnumEntryType type) {
		this.type = type;
	}
}
