package exam04;

public class ClassExam {
	String str;

	ClassExam() {
		System.out.println("�⺻ ������ ȣ��");
	}

	ClassExam(String str) {
		System.out.println("��Ʈ�� �Ķ���� ������ ȣ��");
	}

	ClassExam(int str) {
		System.out.println("��Ʈ �Ķ���� ������ ȣ��");
	}

	ClassExam(boolean str) {
		System.out.println("�Ҹ� �Ķ���� ������ ȣ��");
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
