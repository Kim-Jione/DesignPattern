package proxy;

public class ProxyApp {
	public static void main(String[] args) {
		ProxyServer ps = new ProxyServer(new BlogServer()); // 프록시 서버를 바라보고 있다
		ps.request();
	}
}
