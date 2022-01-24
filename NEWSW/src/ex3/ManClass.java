package ex3;

public class ManClass {
	
	//인스턴스
	private int age;
	private int heigjt;
	private int weight;
	private String phoneNum;
	// 디폴트 생성
	public ManClass() {
		// TODO Auto-generated constructor stub
	}
	
	//파라미터
	public ManClass(int age, int heigjt , int weight, String phoneNum) {
		this.age = age;
		this.heigjt = heigjt;
		this.weight = weight;
		this.phoneNum = phoneNum;

	}
	 public double calculateBMI() {
		 
		 double result = weight /(heigjt * heigjt);
		 return result;
		 
	 }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeigjt() {
		return heigjt;
	}
	public void setHeigjt(int heigjt) {
		this.heigjt = heigjt;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	 
	 
	 
	


}
