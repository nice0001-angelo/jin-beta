/**
 * 
 */
package inflearn.springcorebasic.hello.core.discount;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public interface DiscountPolicy {
	
	//return 할인 대상 금액
	int discount(Member member, int price);

}
