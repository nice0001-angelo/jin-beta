/**
 * 
 */
package net.jin.overwatch.service;

import java.util.*;

import net.jin.overwatch.service.impl.*;

/**
 * @author njh
 *
 */
public class OverWatchMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성 테스트(OverWatch) : 입출력 처리부		
		OverWatch overWatch; // 인터페이스 객체 선언
		System.out.println("플레이할 캐릭터 번호 선택(1. 메이, 2. 리퍼, 3. 맥크리)");
		Scanner scanner = new Scanner(System.in); // 스캐너 객체
		int inputData = scanner.nextInt();
		if (inputData == 1) {
			overWatch = new Mei(); // 업캐스팅
		} else if (inputData == 2) {
			overWatch = new Reaper(); // 업캐스팅
		} else {
			overWatch = new Mccree(); // 업캐스팅
		}
        
		// 다형성 테스트(OverWatch):	선택한 조건에 따라서 부모 객체로 자식 메소드 사용(하나의 타입으로 다양한 결과를 얻어냄 / 다형성)
		overWatch.name();
		overWatch.lClick();
		overWatch.rClick();
		overWatch.shiftButton();
		overWatch.eButton();
		overWatch.qButton();
		
	}

}
