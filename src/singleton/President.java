package singleton;

public class President {

	private static President instance = new President("윤석열"); // static 공간에 instance 변수 저장, new는 static 빼고 다 메모리에 띄움
	
	public static President getInstance() { // getInstance가 heap에 뜬다 static 붙으면 static에 뜨고 안붙으면 heap에 뜬다
		return instance;
	}
	
	private String name; // String name은 heap에 뜸
	
	public President(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	
	
}
