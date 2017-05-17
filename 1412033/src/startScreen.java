import javax.swing.*;
import java.awt.*;

public class startScreen extends JFrame {
	public final int WIDTH	= 640;
	public final int HEIGHT = 480;
	
	private startScreen(String s)
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Cria painel com botoes 
		getContentPane().setLayout(new BorderLayout());
		JPanel background = new JPanel();
		background.setLayout(new GridLayout(3, 0));
		JButton newGame   = new JButton("Novo jogo"),
				savedGame = new JButton("Carregar jogo salvo"),
				exitGame  = new JButton("Sair do jogo");
		
		newGame.setAlignmentX(CENTER_ALIGNMENT);
		savedGame.setAlignmentX(CENTER_ALIGNMENT);
		exitGame.setAlignmentX(CENTER_ALIGNMENT);
		
		newGame.addActionListener(new startScreenButtons(this, startScreenButtons.Id.NEWGAME));
		savedGame.addActionListener(new startScreenButtons(this, startScreenButtons.Id.SAVEDGAME));
		exitGame.addActionListener(new startScreenButtons(this, startScreenButtons.Id.EXITGAME));
		
		background.add(newGame);
		background.add(savedGame);
		background.add(exitGame);
	
		getContentPane().add(background, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		startScreen s = new startScreen("Detetive");
		s.setVisible(true);

	}

}


