<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Đăng Nhập</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/home/css/login.css">
    <style>
        .error-message {
            display: none;
            color: red;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
    <div class="registration-form">
        <form id="login-form" action="${pageContext.request.contextPath}/login" method="post">
            <div class="form-icon">
                <span><i class="icon icon-user"></i></span>
            </div>
            <c:if test="${not empty loginError}">
                <div class="" role="alert">
                    ${loginError}
                </div>
            </c:if>
            <div class="form-group">
                <input type="text" class="form-control item" name="username" id="username" placeholder="Tài khoản">
                <div class="error-message" id="username-error">Tài khoản không được bỏ trống.</div>
            </div>
            <div class="form-group">
                <input type="password" class="form-control item" name="password" id="password" placeholder="Mật khẩu">
                <div class="error-message" id="password-error">Mật khẩu không được bỏ trống.</div>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-block create-account" id="submit-btn">Đăng Nhập</button>
            </div>
            <div class="text-center">
                <p>Chưa có tài khoản? <a href="${pageContext.request.contextPath}/register">Đăng ký ngay</a></p>
            </div>adasdsadas
        </form>
        <div class="social-media">
            <h5>Hoặc đăng nhập bằng</h5>
            <div class="social-icons">
                <a href="#"><i class="icon-social-facebook" title="Facebook"></i></a>
                <a href="#"><i class="icon-social-google" title="Google"></i></a>
                <a href="#"><i class="icon-social-twitter" title="Twitter"></i></a>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    
    <!-- Liên kết đến tệp JavaScript riêng cho trang đăng nhập -->
    <script src="${pageContext.request.contextPath}/assets/home/js/login.js"></script>
</body>
</html>
