/**
 * 
 */
package inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *Input: 4
 *Input: #****###**#####**#####**##**
 *Oupput: COOL
 */
public class _12_Decription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_12_Decription T = new _12_Decription();
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(k, str));
	}

	public String solution(int k, String str) {
//		String answer = "";
//		for(int i=0; i < k ; i++) {
//			String tmp = str.substring(0,7).replace('#', '1').replace('*','0');
//			int num = Integer.parseInt(tmp,2);
//			answer +=(char)num;
//			System.out.println(tmp+" "+num);
//			str = str.substring(7);
		String answer = "";
		for(int i=0; i<k; i++) {
			String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
			int num = Integer.parseInt(tmp, 2); //String 값인 tmp를 2진수로 받아서 10진수로 변환하여 int 값으로 리턴
			answer +=(char)num; //int value를 char로 형변환 하면 Ascii 코드에 해당하는 녀석으로 변환됨 answer는 String 이므로 char 타입을 붙이면 String 됨
			System.out.println(tmp+" "+num);
			str=str.substring(7);
		}
		return answer;
	}
}
