package tw.brad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.brad.model.OrderDeatilsKey;
import tw.brad.model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, OrderDeatilsKey>{

}
