package gamelevel;

public class Player {
	private PlayerLevel pv;
	public Player()
	{
		pv = new BeginnerLevel();
		pv.showMessage();
	}
	public PlayerLevel getLevel()
	{
		return pv;
	}
	public void upgradeLevel(PlayerLevel lv)
	{
		pv = lv;
		pv.showMessage();
	}
	public void play(int count)
	{
		pv.go(count);
	}
}
