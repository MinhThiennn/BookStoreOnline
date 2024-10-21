<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.poly.entity.CartItems" %>

<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/user/css/cart.css">
</head>
<body>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
<main class="page">
    <section class="shopping-cart dark">
        <div class="container">
            <div class="block-heading">
                <h2>Shopping Cart</h2>
            </div>
            <div class="content">
                <div class="row">
                    <div class="col-md-12 col-lg-8">
                        <div class="items">
                            <%
                                List<CartItems> cartItemList = (List<CartItems>) request.getAttribute("cartItemList");
                                double subtotal = 0.0;
                                double discount = 0.0; // Giá trị giảm giá
                                double shipping = 0.0;  // Giá trị vận chuyển

                                // Kiểm tra xem cartItemList có null không
                                if (cartItemList != null) {
                                    for (CartItems cartItem : cartItemList) {
                                        double price = cartItem.getPrice(); // Lấy giá từ cartItem
                                        subtotal += price * cartItem.getQuantity();
                            %>
                            <div class="product">
                                <div class="row">
                                    <div class="col-md-3">
                                        <img class="img-fluid mx-auto d-block image" src="${pageContext.request.contextPath}/assets/home/images/product-item1.jpg">
                                    </div>
                                    <div class="col-md-8">
                                        <div class="info">
                                            <div class="row">
                                                <div class="col-md-5 product-name">
                                                    <div class="product-name">
                                                        <a href="#">Product Name: <%= cartItem.getProductName() %></a>
                                                        <div class="product-info">
                                                            <div>Display: <span class="value">5 inch</span></div>
                                                            <div>RAM: <span class="value">4GB</span></div>
                                                            <div>Memory: <span class="value">32GB</span></div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-md-4 quantity">
                                                    <label for="quantity">Quantity:</label>
                                                    <input id="quantity" type="number" value="<%= cartItem.getQuantity() %>" class="form-control quantity-input">
                                                </div>
                                                <div class="col-md-3 price">
                                                    <span>$<%= String.format("%.2f", price) %></span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <%
                                    }
                                }
                            %>
                        </div>
                    </div>
                    <div class="col-md-12 col-lg-4">
                        <div class="summary">
                            <h3>Summary</h3>
                            <div class="summary-item"><span class="text">Subtotal</span><span class="price">$<%= String.format("%.2f", subtotal) %></span></div>
                            <div class="summary-item"><span class="text">Discount</span><span class="price">$<%= String.format("%.2f", discount) %></span></div>
                            <div class="summary-item"><span class="text">Shipping</span><span class="price">$<%= String.format("%.2f", shipping) %></span></div>
                            <div class="summary-item"><span class="text">Total</span><span class="price">$<%= String.format("%.2f", subtotal - discount + shipping) %></span></div>
                            <button type="button" class="btn btn-primary btn-lg btn-block">Checkout</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</main>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
