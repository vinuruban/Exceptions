
public class Account {
	
//	int salary;
//	int absent;
//	
//	public Account (int salary, int absent) {
//		this.salary = salary;
//		this.absent = absent;
//	}
	
	public float Tax(int salary, int absent) throws MyExps{
		
		float x;
		
		if (absent >= 7) {
			
			MyExps three = new MyExps();
			throw three;
						
		}
		
		x = salary * 15/100;
		return x;
		
	}
	
}

