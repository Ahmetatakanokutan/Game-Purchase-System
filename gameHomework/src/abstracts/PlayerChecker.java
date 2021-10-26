package abstracts;

import entity.Player;
import interfaces.PlayerCheckService;

public class PlayerChecker implements PlayerCheckService {

	Player player;
	public PlayerChecker(Player player) {
		super();
		this.player = player;
	}
	public boolean CheckIfRealPerson(int id , String tcNo, String ad, String soyad, String dogumYili) {
		if (id == player.getId() && tcNo == player.getNationalityId() && ad == player.getName() && soyad == player.getSurName()
				&& dogumYili == player.getBirthDay())
			return true;
		
		else
			return false;
	}

}
