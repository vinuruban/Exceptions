
public class Main {

	public static void main(String[] args) {
		
		Account AC = new Account();
		int salary;
		float net,tax;
		salary = 1000;
			
		try {
			tax = AC.Tax(salary, 9);
			System.out.println(tax);
			
		}
		
		catch (MyExps ABC) {
			ABC.printStackTrace();
			
		}

	}

}
