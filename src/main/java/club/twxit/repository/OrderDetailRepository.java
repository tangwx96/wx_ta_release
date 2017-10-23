package club.twxit.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import club.twxit.dataobject.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>{
	List<OrderDetail> fingByOrderId(String openId,Pageable pageable);

}
