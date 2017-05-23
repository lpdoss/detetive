package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;

import controller.StartGameHandler;

public class NewGameScreen extends JFrame {
	public final int WIDTH	= 640;
	public final int HEIGHT = 480;
	
	public NewGameScreen(String s)
	{
		super (s);
		// Inicializa janela no tamanho default no centro da tela.
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int	sl=screenSize.width;
		int	sa=screenSize.height;
		
		int	x=sl/2-WIDTH/2;
		int	y=sa/2-HEIGHT/2;
		
		setBounds(x,y,WIDTH,HEIGHT);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel PlayerSelection = new JPanel();
		PlayerSelection.setLayout(new BoxLayout(PlayerSelection, BoxLayout.Y_AXIS));
		JCheckBox green		= new JCheckBox("Reverendo Green"); 	green.setAlignmentX(LEFT_ALIGNMENT);
		JCheckBox mustard	= new JCheckBox("Coronel Mustard"); 	mustard.setAlignmentX(LEFT_ALIGNMENT);
		JCheckBox peacock	= new JCheckBox("Senhora Peacock"); 	peacock.setAlignmentX(LEFT_ALIGNMENT);
		JCheckBox plum		= new JCheckBox("Professor Plum");  	plum.setAlignmentX(LEFT_ALIGNMENT);
		JCheckBox scarlet	= new JCheckBox("Senhorita Scarlet");	scarlet.setAlignmentX(LEFT_ALIGNMENT);
		JCheckBox white		= new JCheckBox("Senhora White"); 		white.setAlignmentX(LEFT_ALIGNMENT);
		
		JButton StartGame = new JButton("Iniciar jogo");	StartGame.setAlignmentX(LEFT_ALIGNMENT);
		StartGame.addActionListener(new StartGameHandler(PlayerSelection));
		
		PlayerSelection.add(green);
		PlayerSelection.add(mustard);
		PlayerSelection.add(peacock);
		PlayerSelection.add(plum);
		PlayerSelection.add(scarlet);
		PlayerSelection.add(white);
		PlayerSelection.add(StartGame);
		
		
		getContentPane().setLayout(new GridLayout(2,0));
		getContentPane().add(PlayerSelection);
		
		
	
	}
}
