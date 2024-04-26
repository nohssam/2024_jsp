package com.session.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartView {
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "session_cart/session_cart_view.jsp";
	}
}
