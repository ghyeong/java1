package exam04;

public class ClassExam {
	String str;

	ClassExam() {
		System.out.println("기본 생성자 호출");
	}

	ClassExam(String str) {
		System.out.println("스트링 파라메터 생성자 호출");
	}

	ClassExam(int str) {
		System.out.println("인트 파라메터 생성자 호출");
	}

	ClassExam(boolean str) {
		System.out.println("불린 파라메터 생성자 호출");
	}

	public void printStr(String str) {
		System.out.println(str);
	}

	public String getStr() {
		String str = "asd";
		return str;

	}

	public static void main(String[] args) {
		ClassExam ce = new ClassExam(true);
	}
}
