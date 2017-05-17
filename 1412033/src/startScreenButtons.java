import java.awt.event.*;
import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class startScreenButtons implements ActionListener {
		
	public static enum Id{	NEWGAME, SAVEDGAME, EXITGAME	}
	
	private Id buttonId;
	private final JFrame frame;
	
	public startScreenButtons(JFrame j, Id id)
	{
		frame = j;
		switch(id){
			case NEWGAME:
				buttonId = id;
				break;
			case SAVEDGAME:
				buttonId = id;	
				break;
			case EXITGAME:
				buttonId = id;
				break;
		}
	}
		
	public void actionPerformed(ActionEvent e)
	{
		switch(buttonId){
		case NEWGAME:
			//cria janela com novo jogo
			break;
		case SAVEDGAME:
			JFileChooser fc = new JFileChooser();
			//FileNameExtensionFilter filter = new FileNameExtensionFilter("detetive");
			//fc.setFileFilter(filter);
			int returnVal = fc.showOpenDialog((JComponent)e.getSource());
			if(returnVal == JFileChooser.APPROVE_OPTION)
				System.out.println(fc.getSelectedFile().getName());
			break;
		case EXITGAME:
			frame.dispose();
			break;
	}
	}

}
