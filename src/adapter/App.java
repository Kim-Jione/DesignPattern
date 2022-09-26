package adapter;

public class App {
	public static void main(String[] args) {
		CoffeeMachine m = new CoffeeMachine(); // 본서버를 바라보는 상태에서 추가 기능을 적
		m.brew(new Americano());
		m.brew(new CafeLatte());
		m.brew(new Espresso());
		m.brew(new AmericanoAdapter(new Americano())); // 데코레이트 패턴,
	}
}
