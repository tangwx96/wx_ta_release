package club.twxit.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import club.twxit.dataobject.OrderMaster;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



import club.twxit.dataobject.OrderDetail;
import club.twxit.dataobject.ProductInfo;
import club.twxit.dto.OrderDTO;
import club.twxit.enums.ResultEnum;
import club.twxit.exception.SellException;
import club.twxit.repository.OrderDetailRepository;
import club.twxit.repository.OrderMasterRepository;
import club.twxit.service.OrderService;
import club.twxit.service.ProductService;
import club.twxit.utils.KeyUtil;
import org.springframework.transaction.annotation.Transactional;


public class OrderServiceImpl implements OrderService {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	  @Autowired
	    private OrderMasterRepository orderMasterRepository;

	@Override
	@Transactional
	public OrderDTO create(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		String orderId = KeyUtil.genUniqueKey();
		BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);
		   for (OrderDetail orderDetail: orderDTO.getOrderDetailList()) {
			   ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
			   if(productInfo!=null){
				   throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
			   }
			   //计算订单总价
			   orderAmount = productInfo.getProductPrice()
					   .multiply(new BigDecimal(orderDetail.getProductQuantity()))
					   .add(orderAmount);
			   orderDetail.setDetailId(KeyUtil.genUniqueKey());
			   orderDetail.setOrderId(orderId);
			   BeanUtils.copyProperties(productInfo,orderDetail);
			   orderDetailRepository.save(orderDetail);

		   }

		   //写入订单数据库
		OrderMaster orderMaster = new OrderMaster();
orderMaster.setOrderId(orderId);
orderMaster.setOrderAmount(orderAmount);
BeanUtils.copyProperties(orderDTO,orderMaster);
orderMasterRepository.save(orderMaster);

		return null;
	}

	@Override
	public OrderDTO findOne(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO cancel(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO finish(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO paid(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OrderDTO> findList(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
