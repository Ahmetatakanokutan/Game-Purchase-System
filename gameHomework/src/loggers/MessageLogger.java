package loggers;

import entity.Player;

public class MessageLogger implements Logger {

	@Override
	public void log(Player player) {
		System.out.println(player.getName() + " logged via message");
		
	}

}
