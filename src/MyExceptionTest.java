import java.util.Scanner;

public class MyExceptionTest {

	
	public MyExceptionTest() {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("���� = ");
			int n = scan.nextInt();
			
			// �Է¹��� ���� 1~100������ ���� �ƴϸ� MyException ���� �߻�
			if(n < 1 || n > 100) {
				//throw new MyException();// ������ ���� �߻���Ŵ
				throw new MyException("1~100������ �� ������");
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
		System.out.printf("1 ~ %d������ ���� %d", n, total);
	}

	public static void main(String[] args) {
		
		new MyExceptionTest();
		
	}

}
