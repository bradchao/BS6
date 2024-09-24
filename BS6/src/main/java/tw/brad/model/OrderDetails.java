package tw.brad.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderDetails")
public class OrderDetails {

	@EmbeddedId
	private OrderDeatilsKey id;
	
	@ManyToOne
	@JoinColumn(name = "OrderID")
	private Orders order;
	
}
