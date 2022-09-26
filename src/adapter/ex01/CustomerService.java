package adapter.ex01;

// 고객의 클레임이 들어오면, 사과 이메일 보내기
// 이메일 답장을 DB 저장하기
public class CustomerService {

	private EmailSend email;

	public CustomerService(EmailSend email) {
		this.email = email;
	}

	/*
	 * 아직 Email 객체가 안만들어졌을 경우 페이커어댑터(Mock-모조품)를 만들어야 한다 1. Email을 만드는 친구한테 가서 Email을
	 * EmailSend 라는 인터페이스로 구현해서 만들어! 2. EmailAdapter 만들기
	 */

	public void acceptClaim(String msg) {
		// 1. 클레임 받기
		String acceptMsg = msg;
		System.out.println("클레임 내용 : " + acceptMsg);

		// 2. 이메일 보내기
		sendEmail();
	}

	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}

	public void insertResultEmail(String result) {
		System.out.println("답장을 DB에 저장했습니다. : " + result);
	}
}
