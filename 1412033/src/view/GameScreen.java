package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen extends JFrame {
	public final int WIDTH	= 640;
	public final int HEIGHT = 480;

	
	public GameScreen(String s)
	{
		super (s);
		// Inicializa janela no tamanho default no centro da tela.
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int	sl=screenSize.width;
		int	sa=screenSize.height;
		
		setBounds(0,0,sl,sa);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Tabuleiro tab = new Tabuleiro("assets/Tabuleiro-Original.JPG");
		
		getContentPane().add(tab);
	}
	
}





class Tabuleiro extends JPanel {
	
	private Image i;
	
	public Tabuleiro(String path)
	{
		try{
			i = ImageIO.read(new File(path));
		} catch (IOException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(i, 0, 0, 780, 1024, null);
	}
}