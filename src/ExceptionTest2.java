import java.util.Scanner;

public class ExceptionTest2 {

	Scanner scan = new Scanner(System.in);
	
	public ExceptionTest2() {
		start();
	}
	
	void start() {
		try {
			System.out.println("ù ��° ���� : ");
			int first = scan.nextInt();
			System.out.println("�� ��° ���� : ");
			int second = scan.nextInt();
			int result = first / second;
			int[] array = new int[2];
			
			System.out.println(array[3]);
			System.out.printf("first = %d, second = %d", first, second);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		
		new ExceptionTest2();

	}

}
