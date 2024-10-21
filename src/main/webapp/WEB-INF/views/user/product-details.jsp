<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/user/css//product.css">
<link rel="stylesheet" type="text"
	href="${pageContext.request.contextPath}/WEB-INF/views/layout/header.jsp">
</head>
<body>

	<jsp:include page="/WEB-INF/views/layout/header.jsp" />
<br>
<br>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-6">
						<figure class="products-thumb">
							<img src="/BookStoreOnline/assets/home/images/single-image.jpg"
								alt="book" class="single-image">
						</figure>
					</div>
					<div class="col-md-6">
						<div class="product-entry">
							<h2 class="section-title divider">Chỗ này để tên sản phẩm </h2>
							<div class="products-content">
								<div class="author-name">By Timbur Hood</div>
								<h3 class="item-title">Birds gonna be happy</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Sed eu feugiat amet, libero ipsum enim pharetra hac.</p>
								<div class="item-price">$ 45.00</div>
								<div class="btn-wrap">
									<a href="#" class="btn-accent-arrow"> Add to cart <i
										class="icon icon-ns-arrow-right"> </i>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- / row -->
			</div>
		</div>
	</div>

	<!-- 	End	Product details   -->



	<!-- 	Start product image & Information -->

	
</body>
<br>
<br>
<br>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
</html>