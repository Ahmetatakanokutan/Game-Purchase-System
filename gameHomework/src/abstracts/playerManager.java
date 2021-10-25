package abstracts;
import interfaces.PlayerService;
import entity.Player;

public abstract class playerManager implements PlayerService{

	
	public void delete(Player player) {
		System.out.println(player.getName() + "deleted to system");
	}
	public void update(Player player) {
		System.out.println(player.getName() + "updated in system");
	}

}
