package at.freschmushroom.bukkit.mirai_nikki.diaries;

import org.bukkit.entity.Player;

import at.freschmushroom.bukkit.mirai_nikki.MiraiNikkiPlugin;

public class RandomDiary extends Diary {
	public RandomDiary(MiraiNikkiPlugin plugin, Player owner) {
		super(plugin, owner);
	}

	private String[] entries = new String[10];

	public String[] getEntries() {
		return entries;
	}

	public int getNumber() {
		return 1;
	}

	public void addEntry(long approxTime, String entry) {
		int hour = (int) (approxTime / 1000);
		int minute = (int) ((approxTime % 1000) / 1000D * 60);
		int second = (int) (((approxTime % 1000) / 1000D * 60 * 60) % 60);
		for (int i = entries.length - 1; i > 1; i--) {
			entries[i] = entries[i - 1];
		}
		entries[0] = "[" + hour + ":" + minute + ":" + second + " = "
				+ approxTime + "]: " + entry;
		plugin.getLogger().info(entries[0]);
	}

	public void setDeadEnd(long approxTime) {
		addEntry((approxTime + 6000) % 24000, "DEAD END");
	}
}
