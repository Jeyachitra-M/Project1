package com.niit.DAOinterfaces;

import java.util.List;

import com.niit.Model.CartItem;

public interface CartDAO {

	public boolean addCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cartItem);
	public boolean deleteCartItem(CartItem cartItem);
	public List<CartItem> showCartItem(String username);
	public CartItem getCartItem(int cartItemId);
}