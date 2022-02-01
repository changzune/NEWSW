package ex14;

import ex15.FlyYes;
import ex15.Iknife;
import ex15.KnifeLazer;
import ex15.MisailYes;
import ex15.iFly;
import ex15.iMisail;

public class SuperRobot extends Robot {
	
	public SuperRobot() {
	fly = new FlyYes();
		

	}
	
	@Override
	public void shape() {
		System.out.println("SuperRobot 입니다. 외형은 팔,다리,몸통,머리가 있습니다.");

	}


}
