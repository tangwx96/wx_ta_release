package club.twxit.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import club.twxit.dataobject.OrderMaster;

public interface OrderMasterRepository extends JpaRepository<OrderMaster, Integer>{
	 Page<OrderMaster> fingByBuyerOpenid(String buyerOpenid,Pageable pageable);

}
