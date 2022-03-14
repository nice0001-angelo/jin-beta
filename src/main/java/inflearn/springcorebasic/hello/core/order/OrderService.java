/**
 * 
 */
package inflearn.springcorebasic.hello.core.order;

/**
 * @author njh
 *
 * <주문 서비스>
 * 
 */
public interface OrderService {
	Order createOrder(Long memberId, String itemName, int itemPrice);
}
