
// 예외 클래스를 생성하기 위해서는 Exception 상속 받아 만들 수 있다.

public class MyException extends Exception{

	public MyException() {
		// 상위클래스인 Exception의 생성자 메소드를 호출하여 에러 메세지를 셋팅한다.
		super("1~100사이의 값을 넣으셈");
	}
	
	MyException(String msg){
		super(msg);
	}

}
