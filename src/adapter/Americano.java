package adapter;

public class Americano implements Coffee {
	
	private final String NAME = "아메리카노"; // final롤 정의한 변수는 대문자로 정한다 -> 상수여서 바뀌지 않음, 
	
	//@Override와 같다 => 부모의 make 메서드가 무효화 된것. 재정의 된것
	public String make() { 
		return NAME;
	}

}
