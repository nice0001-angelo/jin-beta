/**
 * 
 */
package inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 *
 */
public class _1_HashMapLeader {

	/**
	 * @param args
	 * Input: 15 BACBACCACCBDEDE
	 * Output: C
	 */
	public static void main(String[] args) {
		System.out.println("투표자수와 득표자의 알파벳을 입력하세요");
		_1_HashMapLeader T = new _1_HashMapLeader();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.Solution(n, str));
	}

	public char Solution(int n, String str) {
		char answer=' ';

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		// 입력받은 String 값을 char로 변환하여 hashMap에 Key, Value 형태로 넣는다(key, key의 갯수)
		for(char x : str.toCharArray()) {
			hashMap.put(x, hashMap.getOrDefault(x, 0)+1); //hashMap 객체에 key와 key의 Value를 넣는다
		}
		
		// hashMap 으로 부터 key와 value를 꺼낸다
		int maxValue = Integer.MIN_VALUE;
		
		for(char key : hashMap.keySet()) {
			System.out.println(key+":"+hashMap.get(key));
			if(hashMap.get(key)>maxValue) {
				maxValue = hashMap.get(key);
				answer = key;
			}
		}
		return answer;
	}
}
