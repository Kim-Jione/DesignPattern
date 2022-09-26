package strategy;

public class CafeLatte implements Coffee {
	
	private final String NAME = "카페라떼"; // final롤 정의한 변수는 대문자로 정한다 -> 상수여서 바뀌지 않음, 
	
	// @Override
	public String make() { 
		return NAME;
	}

}
