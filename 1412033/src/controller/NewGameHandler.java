package controller;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import view.NewGameScreen;


public class NewGameHandler implements ActionListener {
	private JPanel p;
	
	public NewGameHandler(JPanel x) {p=x;}
	
	public void actionPerformed(ActionEvent e)
	{
		//Cria janela de seleção de personagens
		NewGameScreen selectionmenu = new NewGameScreen("Selecione os jogadores participantes");
		selectionmenu.setVisible(true);
		JRootPane contentPane = p.getRootPane();
		JFrame j = (JFrame) contentPane.getParent();
		j.dispose();
	}
}
