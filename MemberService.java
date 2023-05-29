package sec2.exam01;

public class MemberService {

	// 생성자

	String id;
	String password;

	boolean login(String id, String password) {
		this.id = id;
		this.password = password;

		if (id == "hong" && password == "12345")
			return true;

		else {
			return false;
		}

	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
