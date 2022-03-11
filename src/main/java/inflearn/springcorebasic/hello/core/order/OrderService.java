/**
 * 
 */
package inflearn.springcorebasic.hello.core.order;

/**
 * @author njh
 *
 */
public interface OrderService {
	Order createOrder(Long memberId, String itemName, int itemPrice);
}
