package tw.brad.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "OrderDetails")
public class OrderDetails {

	@JsonIgnore
	@EmbeddedId
	private OrderDeatilsKey id;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "OrderID")
	@MapsId("orderId")
	private Orders order;

	@JsonIgnore
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "ProductID")
	private Products product;

	@Column(name = "UnitPrice")
	private Double unitPrice;
	
	@Column(name = "Quantity")
	private Integer quantity;
	
	@Column(name = "Discount")
	private Double discount;

	@Transient		// 不要做 jpa 的 mapping
	private String productName;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public OrderDeatilsKey getId() {
		return id;
	}

	public void setId(OrderDeatilsKey id) {
		this.id = id;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	
}
