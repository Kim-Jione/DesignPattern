package proxy;

public class ProxyServer implements Server {
	
	private BlogServer server; // 본 코드가 아니어서 DIP를 지키지 않아도 된다
	
	public ProxyServer(BlogServer server) {
		this.server = server;
	}
	
	@Override
	public void request() {
		System.out.println("json을 자바오브젝트로");
		server.request();
		System.out.println("자바오브젝트를을 json로");
		
	
	}
}
