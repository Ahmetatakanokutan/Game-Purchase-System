package gameSeller;
import entity.*;
import abstracts.OfferManager;
import loggerManager.*;
import loggers.*;
public class GameSeller extends OfferManager implements BaseSeller{

	@Override
	public void buy(Player player , Logger logger) {
		System.out.println(player.getName() +"isimli kisi oyun satin aldi");
		
	}

	public void refund(Player player , Logger logger) {
		System.out.println(player.getName() + "isimli kisi satin aldigi oyunu geri iade etti");
		
	}

}
