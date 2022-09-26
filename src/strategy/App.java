package strategy;

public class App {
	public static void main(String[] args) {
		CoffeeMachine m = new CoffeeMachine(); // 보통 메인에서 만듦
		m.brew(new Americano());
		m.brew(new CafeLatte());
		m.brew(new Espresso());
	}
}
	