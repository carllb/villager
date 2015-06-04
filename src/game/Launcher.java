package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Launcher {
	JFrame window;
	JButton startButton;
	public static GameManager gm;
	public static void main(String[] args) {
		gm = new GameManager(new VillageGame());
		new Launcher();
	}
	
	public Launcher(){
		window = new JFrame();
		window.setVisible(true);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		startButton = new JButton("Start Game");
		window.add(startButton);
		startButton.setLocation(640/2 - 200,480/2 - 20);
		startButton.setSize(400, 40);
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				window.setVisible(false);
				window.dispose();
				gm.startgame();
			}
		});
	}
}
