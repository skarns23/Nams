package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player py = new Player();
		py.play(1);
		PlayerLevel lv = new AdvancedLevel();
		py.upgradeLevel(lv);
		py.play(2);
		lv = new SuperLevel();
		py.upgradeLevel(lv);
		py.play(3);
	}

}
