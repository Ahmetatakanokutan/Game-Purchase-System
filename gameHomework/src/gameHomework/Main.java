package gameHomework;

import entity.*;
import abstracts.*;
import gameHomework.*;
import gameSeller.*;
import loggerManager.*;
import loggers.*;

public class Main {

	public static void main(String[] args) {
		Player atakan = new Player(1,"atakan","okutan","2343121354","02/06/2000");

		playerManager player_manager = new playerManager();
		
		player_manager.add(atakan);
		PlayerChecker checker = new PlayerChecker(atakan);
		
		
		GameSeller gameSeller = new GameSeller();
		
		gameSeller.buy(atakan , new EmailLogger());
		
	}

}
