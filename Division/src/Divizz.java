
public class Divizz {

	public static void main(String x[]) {
		
		int A,B;
		float C;
		
		try {
			
			A = Integer.parseInt(x[0]);
			B = Integer.parseInt(x[1]);
			C = A/B;
			
		}
		
		catch (ArithmeticException A1) {
			System.out.println("Cannot divide by zero");
		}
		
		catch (ArrayIndexOutOfBoundsException E1) {
			System.out.println("Please provide only two numbers");
		}
		
		catch (NumberFormatException X) {
			System.out.println("Can only accept numbers");
		}
		
		catch (Exception X) {
			
		}
		
	}

}
