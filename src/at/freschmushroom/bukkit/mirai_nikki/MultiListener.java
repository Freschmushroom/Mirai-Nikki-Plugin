package at.freschmushroom.bukkit.mirai_nikki;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class MultiListener implements Listener {
	public final MiraiNikkiPlugin plugin;
	
	public MultiListener(MiraiNikkiPlugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler (priority = EventPriority.LOW)
	public void playerMove(PlayerMoveEvent event) {
		
	}
	
	@EventHandler (priority = EventPriority.LOW)
	public void fight(EntityDamageByEntityEvent event) {
		
	}
}
