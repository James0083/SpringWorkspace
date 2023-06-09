package com.shop.mapper;

import java.util.List;

import com.shop.model.CartVO;

public interface CartMapper {
	
	Integer selectCartCountByPnum(CartVO cvo);
	//회원번호, 상품번
	
	int updateCartQty(CartVO cvo);
	int addCart(CartVO cvo);
	
	List<CartVO> selectCartView(int idx_fk);
	CartVO getCartTotal(int idx_fk);
	
	int delCart(int cartNum);
	int delCartAll(int idx_fk);
	int editCart(CartVO cvo);
	
}
