<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css"> <!-- Link tới file CSS của bạn -->
</head>
<body>
    <div class="checkout-container">
        <h1>Checkout</h1>

        <form action="${pageContext.request.contextPath}/processCheckout" method="post">
            <div class="form-group">
                <label for="name">Full Name:</label>
                <input type="text" id="name" name="name" required>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="address">Shipping Address:</label>
                <input type="text" id="address" name="address" required>
            </div>

            <div class="form-group">
                <label for="phone">Phone Number:</label>
                <input type="tel" id="phone" name="phone" required>
            </div>

            <div class="form-group">
                <label for="paymentMethod">Payment Method:</label>
                <select id="paymentMethod" name="paymentMethod" required>
                    <option value="creditCard">Credit Card</option>
                    <option value="paypal">PayPal</option>
                    <option value="bankTransfer">Bank Transfer</option>
                </select>
            </div>

            <div class="form-group">
                <label for="orderNotes">Order Notes (optional):</label>
                <textarea id="orderNotes" name="orderNotes" rows="4"></textarea>
            </div>

            <button type="submit">Confirm Order</button>
        </form>

        <h2>Your Cart</h2>
        <div class="cart-items">
            <!-- Giả định rằng bạn đã có danh sách sản phẩm trong giỏ hàng -->
            <c:forEach var="item" items="${cartItems}">
                <div class="cart-item">
                    <span>${item.productName}</span>
                    <span>Quantity: ${item.quantity}</span>
                    <span>Price: ${item.price}</span>
                </div>
            </c:forEach>
        </div>

        <div class="total">
            <h3>Total: ${totalPrice}</h3>
        </div>
    </div>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
        }

        .checkout-container {
            max-width: 600px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input, select, textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            background-color: #5cb85c;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #4cae4c;
        }

        .cart-items {
            margin-top: 20px;
        }

        .cart-item {
            padding: 10px;
            border: 1px solid #eee;
            margin-bottom: 10px;
            border-radius: 4px;
        }

        .total {
            font-weight: bold;
            margin-top: 15px;
        }
    </style>
</body>
</html>
