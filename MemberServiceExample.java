package sec2.exam01;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService mem = new MemberService();
		
		boolean result = mem.login("hong","12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			mem.logout("hong");
		} else {
			System.out.println("id 또는 password"
					+ "가 올바르지 않습니다.");
			
		}

	}

}
