package strategy;

public class CoffeeMachine {
	
	// brew 라는 메서드는 커피에게 의존한다 
	// 커피머신은 커피에게 의존한다 => 구체적인걸 의존하지 않고 추상적인걸
	public void brew(Coffee coffee) { // 커피 내리는 메서드, 아메리카노 캡슐 받아서 내려 만듦
		System.out.println(coffee.make());
	}
}
