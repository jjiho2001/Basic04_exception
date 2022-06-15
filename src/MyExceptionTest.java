import java.util.Scanner;

public class MyExceptionTest {

	
	public MyExceptionTest() {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("숫자 = ");
			int n = scan.nextInt();
			
			// 입력받은 갑싱 1~100사이의 값이 아니면 MyException 예외 발생
			if(n < 1 || n > 100) {
				//throw new MyException();// 강제로 예외 발생시킴
				throw new MyException("1~100사이의 값 넣으셈");
			}
			
			sum(n);
		} catch (MyException me) {
			System.out.println(me.getMessage());
		}
	}
	
	void sum(int n) {
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total += n;
		}
		System.out.printf("1 ~ %d까지의 합은 %d", n, total);
	}

	public static void main(String[] args) {
		
		new MyExceptionTest();
		
	}

}
