package kr.hhplus.be.server.persistence.order;

import kr.hhplus.be.server.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<Order,Long> {

    Order findByOrderId(long orderId);
}
