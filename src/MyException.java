
// ���� Ŭ������ �����ϱ� ���ؼ��� Exception ��� �޾� ���� �� �ִ�.

public class MyException extends Exception{

	public MyException() {
		// ����Ŭ������ Exception�� ������ �޼ҵ带 ȣ���Ͽ� ���� �޼����� �����Ѵ�.
		super("1~100������ ���� ������");
	}
	
	MyException(String msg){
		super(msg);
	}

}
