package gameController;

// classe p�blica que � usada para permitir que o cliente haja somente uma inst�ncia da classe GameRules, que implementa a interface ObservedGame

public class GameController{
	
	private static ObservedGame game = null;

	public static ObservedGame getGameInstance()
	{
		if(game == null)
		{
			game = new GameRules();
		}
		return game;
	}
	
}