import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	ExceptionTest1(){
		
	}
	
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		
		try { // ���� �߻� ������ �ڵ� + ���� �߻� ���ɼ��� ���� �ڵ�
			System.out.println("ù ��° ���� : ");
			int first = scan.nextInt();
			System.out.println("�� ��° ���� : ");
			int second = scan.nextInt();
			int result = first / second;
			System.out.printf("first = %d, second = %d", first, second);
			
		} catch (InputMismatchException ime) { // ���� �߻��� ó���ϴ� �ڵ�
			// ime ���� �߻��� ���� ��ü�� ����ִ�.
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
