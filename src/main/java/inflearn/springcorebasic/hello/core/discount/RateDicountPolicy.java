/**
 * 
 */
package inflearn.springcorebasic.hello.core.discount;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 *<정률 디스카운트 구현체>
 *
 */
public class RateDicountPolicy implements DiscountPolicy{
	
	private int discountPercent = 10;

	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP) {
			return price * discountPercent/100;
		} else {
			return 0;			
		}
	}
}
