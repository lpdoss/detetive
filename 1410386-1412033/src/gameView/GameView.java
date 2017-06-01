package gameView;


import gameController.GameController;
import gameController.ObservedGame;

import java.util.Observable;
import java.util.Observer;

//classe view que se registra como observadora e interage com o jogo
public class GameView implements Observer
{

	ObservedGame gc;
	
	public GameView()
	{
		gc = GameController.getGameInstance();
		gc.addObserver(this);
	}
	
	public void update(Observable o)
	{
		System.out.println(((ObservedGame) o).getValue());
	}
	
	
	public void update(Observable o, Object arg) 
	{
		System.out.println(((ObservedGame) o).getValue());
	}
	
	/*
	public static void main(String[] args)
	{
		GameView gv = new GameView();
		for(int i = 0; i < 10; i++)
		{
			gv.gc.setValue(i);
		}
	}
	*/
	

}