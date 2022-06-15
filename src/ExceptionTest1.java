import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	ExceptionTest1(){
		
	}
	
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		
		try { // 예외 발생 가능한 코드 + 예외 발생 가능성이 없는 코드
			System.out.println("첫 번째 정수 : ");
			int first = scan.nextInt();
			System.out.println("두 번째 정수 : ");
			int second = scan.nextInt();
			int result = first / second;
			System.out.printf("first = %d, second = %d", first, second);
			
		} catch (InputMismatchException ime) { // 예외 발생기 처리하는 코드
			// ime 변수 발생한 예외 객체가 담겨있다.
			System.out.println(ime.getMessage());
			
			ime.printStackTrace();
			
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExceptionTest1().start();
	}

}
