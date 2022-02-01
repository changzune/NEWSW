package ex14;

import ex15.FlyYes;
import ex15.KnifeLazer;
import ex15.MisailYes;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("슈퍼로봇을 만들어주세요");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionrun();
		superRobot.actionWalk();
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		superRobot.setKnife(new KnifeLazer());
		superRobot.actionKnife();
		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();

	}

}
