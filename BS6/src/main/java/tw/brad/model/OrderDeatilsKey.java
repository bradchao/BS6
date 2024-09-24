package tw.brad.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderDeatilsKey {

	private Long orderId;
	private Long productId;
	
}
