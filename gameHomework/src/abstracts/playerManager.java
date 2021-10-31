package abstracts;
import interfaces.PlayerService;
import entity.Player;

public class playerManager extends PlayerChecker implements PlayerService{

	public void add(Player player) {
		System.out.println(player.getName() + " added to system");
		
	}
	public void delete(Player player) {
		System.out.println(player.getName() + " deleted to system");
	}
	public void update(Player player) {
		System.out.println(player.getName() + " updated in system");
	}
	public void checkifRealPerson(Player player){
		if(CheckIfRealPerson(player)){
			System.out.println("player comfirmed");
		}
		else
		{
			System.out.println("there is no person in the system");
		}
	}

}
