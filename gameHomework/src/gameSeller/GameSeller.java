package gameSeller;
import entity.*;
import abstracts.OfferManager;
import loggerManager.*;
import loggers.*;
public class GameSeller extends OfferManager implements BaseSeller{

	@Override
	public void buy(Player player , Logger logger) {
		System.out.println(player.getName() +" purchase a game");
		logger.log(player);
	}

	public void refund(Player player , Logger logger) {
		System.out.println(player.getName() + " refund a game");
		logger.log(player);
	}

}
