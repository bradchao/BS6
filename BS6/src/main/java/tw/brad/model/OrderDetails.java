package tw.brad.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderDetails")
public class OrderDetails {

	@EmbeddedId
	private OrderDeatilsKey id;
	
}
