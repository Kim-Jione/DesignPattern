package ex02;

public class JinLamunAdapter implements Lamun {

	private JinLamun jinlamun;

	public JinLamunAdapter(JinLamun jinlamun) {
		this.jinlamun = jinlamun;
	}

	@Override
	public String cook() {
		return "계란추가";
	}
	
	

}
