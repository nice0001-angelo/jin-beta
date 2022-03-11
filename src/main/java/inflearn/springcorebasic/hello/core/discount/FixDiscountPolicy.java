/**
 * 
 */
package inflearn.springcorebasic.hello.core.discount;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public class FixDiscountPolicy implements DiscountPolicy{

	private int discountFixAmount = 1000; //1000원 할인
	
	@Override
	public int discount(Member member, int price) {
		
		//enum type은 == 으로 비교해야함
		if(member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		} else {
			return 0;
		}
	}
}
