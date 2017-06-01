package gameController;

import java.util.Observable;
import java.util.Observer;

//classe que controlará regras do jogo, recebendo ações da GUI através da interface ObservedGame e notificando mudanças
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
