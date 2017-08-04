package day01;

public class demo1 {
	public static void main(String[] args) {
		long time1=System.nanoTime();
		method1(100000);
		long time2=System.nanoTime()-time1;
		System.out.println("方法1时间是"+time2);
		
		long time3=System.nanoTime();
		method2(100000);
		long time4=System.nanoTime()-time3;
		System.out.println("方法2时间是"+time4);
		
//		for(int i=0;i<1000;i++){
//			System.out.println(i);
//		}
	}
	public  static void method1(int n){
		for(int i=n;i>0;i--){
			
		}
	}
	public static void method2(int n){
		if(n>0){
			method2(n-1);
			
		}
		
	}

}
