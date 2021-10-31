package gameHomework;

import entity.*;

import abstracts.*;
import gameHomework.*;
import gameSeller.*;
import loggerManager.*;
import loggers.*;

public class Main {

	public static void main(String[] args) {
		Player atakan = new Player(1,"atakan","okutan","2343121354","02.06.2000");

		playerManager checker = new playerManager();
		checker.checkifRealPerson(atakan);
		
		checker.add(atakan);
		GameSeller gameSeller = new GameSeller();
		
		gameSeller.buy(atakan , new EmailLogger());
		
	}

}
