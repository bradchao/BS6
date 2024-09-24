package tw.brad.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private Long orderId;
	
	@Column(name = "OrderDate")
	private Date orderDate;

	// mappedBy 指定 ToMany 的類別中 join 所指定的物件屬性
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)	
	@JsonManagedReference
	private List<OrderDetails> orderDetails;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	//--------------------
	@ManyToOne
	@JoinColumn(name = "CustomerID")
	private Customers customer;

	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;

}
