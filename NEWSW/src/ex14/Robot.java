package ex14;

import ex15.Iknife;
import ex15.iFly;
import ex15.iMisail;

public abstract class Robot {

	iFly fly;
	iMisail misail;
	Iknife knife;
	
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("걷을 수 있습니다.");

	}
	
	public void actionrun() {
		System.out.println("달릴 수 있습니다.");

	}
	public abstract void shape();

	public void setFly(iFly fly) {
		this.fly = fly;
	}
	
	public void setMisail(iMisail misail) {
		this.misail = misail;
	}
	
	public void setKnife(Iknife knife) {
		this.knife = knife;
	}
	
	public void actionFly() {
		this.fly.fly();
	}
	
	public void actionKnife() {
		this.knife.knife();
	}
	
	public void actionMisail() {
		this.misail.misail();
	}
	

	
}
