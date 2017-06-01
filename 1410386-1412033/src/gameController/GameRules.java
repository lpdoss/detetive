package gameController;

import java.util.Observable;
import java.util.Observer;

//classe que controlar� regras do jogo, recebendo a��es da GUI atrav�s da interface ObservedGame e notificando mudan�as
class GameRules extends Observable implements ObservedGame
{
	GameRules gr;
	private int n = 0;
	
	public GameRules()
	{
		this.n = 10;
		}
	public void setValue(int n)
	{
		this.n = n;
		setChanged();
		notifyObservers();
	}
	
	public int getValue()
	{
		return n;
	}
	
	public void addObserver(Observer o) 
	{
		super.addObserver(o);
		
	}


}
