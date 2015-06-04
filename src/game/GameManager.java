package game;

public class GameManager {

	boolean running = true;
	Game game;
	long gameDelay;
	
	public GameManager(Game game){
		this.game = game;
	}
	
	
	public void startgame(){
		game.init();		
	}
	
	
	
	
	
	
}
