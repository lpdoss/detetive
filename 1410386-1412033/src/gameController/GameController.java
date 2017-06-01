package gameController;

// classe pública que é usada para permitir que o cliente haja somente uma instância da classe GameRules, que implementa a interface ObservedGame

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