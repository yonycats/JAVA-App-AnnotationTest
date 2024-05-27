package kr.or.ddit.basic;


//@PrintAnnotation
public class Service {
	
	@PrintAnnotation
//	@PrintAnnotation(value = "-", count = 20) 와 같음 / 기본값을 지정함
	private void method1() {
		System.out.println("method1이 호출되었습니다.");
	}
	
	@PrintAnnotation(value = "%")
	private void method2() {
		System.out.println("method2이 호출되었습니다.");			
	}
	
	@PrintAnnotation(value = "#", count = 25)
	private void method3() {
		System.out.println("method4이 호출되었습니다.");			
	}
}
