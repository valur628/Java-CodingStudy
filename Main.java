import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
 //너 목소리 안 들려--
// 안들리긴 한데,,, 되게 끊겨들려영


class Main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
    int[] arr=new int[N*2];
    int Q1 =0;
    int Q2 = 0;
    int Q3 = 0;
    int Q4  = 0;
    int A,B;
    for(int i = 0; i<N; i++){
      arr[=sc.nextInt();
      if(arr[i] >= 0 && arr[i+1]>= 0){

      }
    }
    int result = 0;
    result = fibo(N-1);
    System.out.println(result);

	}
  public static int fibo(int n) {
    if(n<=1){
      return 1; 
    }
    return fibo(n-1)+fibo(n-2);
  }
}