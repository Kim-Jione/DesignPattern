package singleton;

public class App {
	
	public static void main(String[] args) {
		President p1 = President.getInstance(); //
		President p2 = President.getInstance(); // 한 번 new 한걸로 사용 가능
		//President p3 = new President(); // new 할 수 없음 -> 강제성 부여
		// 기존에 static에 한 번 띄워진 객체를 가져오는 것 -> 객체를 하나만 유지하는 기법
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
	}
	
}


