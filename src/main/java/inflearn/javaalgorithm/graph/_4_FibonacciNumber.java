/**
 * 
 */
package inflearn.javaalgorithm.graph;

/**
 * @author njh
 *
 */
public class _4_FibonacciNumber {

	/**
	 * @param args
	 */
	static int[] fibo;
	public static void main(String[] args) {
		_4_FibonacciNumber T = new _4_FibonacciNumber();
		int n = 45;
		int[] fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i]+" ");	
		}
		
	}
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n]; //memorization 아무리 이렇게 해도 재귀보단 for가 성능 좋다(재귀는 스택프레임에 함수가 여러게 생기고 for는 1개만 생김)
		if(n==1) {
			return fibo[n]=1;
		}else if(n==2) {
			return fibo[n]=1;
		}else {
			return fibo[n]=DFS(n-2)+DFS(n-1);
		}
	}
}
