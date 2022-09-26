package proxy;

public class BlogServer implements Server {
	
	@Override
	public void request() {
	 // System.out.println("json을 java 오브젝트로"); -> 본코드 수정
		System.out.println("요청을 받음");
	}

}
