package gameController;

import java.util.Observer;

//interface que define como a GUI pode interagir com as regras do jogo
public interface ObservedGame 
{
	public void setValue(int n);
	
	public int getValue();
	
	public void addObserver(Observer o);
}
