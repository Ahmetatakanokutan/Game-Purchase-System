package abstracts;
import interfaces.PlayerService;
import entity.Player;

public class playerManager extends PlayerChecker implements PlayerService{

	if()
	public void add(Player player) {
		System.out.println(player.getName() + "added to system");
		
	}
	public void delete(Player player) {
		System.out.println(player.getName() + "deleted to system");
	}
	public void update(Player player) {
		System.out.println(player.getName() + "updated in system");
	}

}
