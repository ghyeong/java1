package exam04;

public class OverLoading {

	public void over(int a, String b) {
		System.out.println("ù��° �����Լ��� ȣ���߳׿�~~");
	}
	public void over(String b, int a) {
		System.out.println("�ι�° �����Լ��� ȣ���߳׿�~~");	
	}
	public String over(String str) {
		System.out.println("����° �����Լ��� ȣ���߳׿�~~");
		
		return "str";
		
	}
	
}
