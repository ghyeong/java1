package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public static void main(String[] args) {
//		ArrayList<Integer> al;// ����
//		al = new ArrayList<Integer>();// �ʱ�ȭ
//
//		for (int i = 1; i <= 5; i++) {
//			al.add(i);
//
//		}
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//			
//		}
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("0", "1");
		ArrayList<HashMap> al = new ArrayList<HashMap>();
		al.add(hm);
	}
}
