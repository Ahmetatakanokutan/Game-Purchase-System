package abstracts;

import playerList.PlayerList;
import entity.Player;
import interfaces.PlayerCheckService;

public class PlayerChecker implements PlayerCheckService {

	
	int sayac = 0;
	
	public boolean CheckIfRealPerson(Player player) {
		String id2 = Integer.toString(player.getId());
		for(String i:PlayerList.id ) {
		if (id2 == PlayerList.id[sayac] && player.getNationalityId() == PlayerList.nationalityId[sayac] && player.getName() == PlayerList.names[sayac] && player.getSurName() == PlayerList.surNames[sayac]
				&& player.getBirthDay() == PlayerList.dateOfBirth[sayac])
			return true;
		sayac++;
		}
		
			return false;
	}

}
