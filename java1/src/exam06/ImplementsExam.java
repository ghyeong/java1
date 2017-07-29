package exam06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ImplementsExam implements InterFaceExam{

	@Override
	public void printStr(String Str) {
		System.out.println(Str);
	}
	
	public void printStr2(String str) {
		System.out.println("printStr2를 호출했네요?");
	}
	public static void main(String[] args) {
		InterFaceExam ife = new ImplementsExam();
		ife.printStr("나나나");
	
	
		List list = new ArrayList();
		list.add("asdasd");
		List list2 = new LinkedList();
		list2.add("asdasd");
	}
	
}
