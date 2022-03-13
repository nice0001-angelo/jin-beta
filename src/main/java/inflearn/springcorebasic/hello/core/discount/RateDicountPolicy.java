/**
 * 
 */
package inflearn.springcorebasic.hello.core.discount;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public class RateDicountPolicy implements DiscountPolicy{
	
	private int discountPercent = 10;

	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP) {
			
		}
		return 0;
	}
}
