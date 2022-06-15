import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodException {

	public MethodException() throws InputMismatchException, ArithmeticException{
		start();
	}
	
	void start() throws InputMismatchException, ArithmeticException{
		sum();
	}
	void sum() throws InputMismatchException, ArithmeticException{
		int sum = 0;
		for(int i = 1; i<= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		inData();
	}
	void inData() throws InputMismatchException, ArithmeticException{
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수입력 = ");
		int i = s.nextInt();
		
		result(i);
	}
	void result(int i) throws ArithmeticException{
		int output = 100 / i ;
		System.out.println("output = " + output);
	}

	public static void main(String[] args) {
		try {
			new MethodException();
		} catch (InputMismatchException ie) {
			ie.printStackTrace();
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
	}

}
