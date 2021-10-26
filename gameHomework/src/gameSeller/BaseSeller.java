package gameSeller;
import entity.Player;
import loggers.*;
public interface BaseSeller {
public void buy(Player player , Logger logger);
public void refund(Player player , Logger logger);

}
