package ex02;

public class App {

	public static void main(String[] args) {
		Pot p = new Pot();
		p.cook(new JinLamun());
		p.cook(new JinLamunAdapter(new JinLamun()));
		
	}
}
