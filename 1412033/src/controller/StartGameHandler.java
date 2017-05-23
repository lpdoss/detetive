package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import view.GameScreen;

public class StartGameHandler implements ActionListener {
	private JPanel p;
	
	public StartGameHandler(JPanel x) {p=x;}
	
	public void actionPerformed(ActionEvent e) 
	{
		GameScreen game = new GameScreen("DETETIVE - CLUE ");
		game.setVisible(true);
		JRootPane contentPane = p.getRootPane();
		JFrame j = (JFrame) contentPane.getParent();
		j.dispose();
	}

}
