package exam07;

public class Excute {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.insertMoney(1000);
		vm.clickButton(new Fanta());
		Drink d = vm.getDrink();
		
		System.out.println(d.getName() + "�� ���ְ� ���ʴϴ�.");
	}
}
