package ex10;

public class MainClass {

	public static void main(String[] args) {
		
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		System.out.println("child1 ������ �Ĵ� : " + child1.calculating());
		System.out.println("child2 ������ �Ĵ� : " + child2.calculating());
		
	}
}
