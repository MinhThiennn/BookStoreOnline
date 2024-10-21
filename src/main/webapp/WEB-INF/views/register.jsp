<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Đăng Ký Tài Khoản</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/home/css/register.css">
    <style>
        .error-message {
            color: red;
            font-size: 0.9em;
            margin-top: 5px;
            display: none; /* Ẩn mặc định */
        }
    </style>
</head>
<body>
    <div class="registration-form">
        <form id="registration-form">
            <div class="form-icon">
                <span><i class="icon icon-user"></i></span>
            </div>
            <div class="form-group">
                <input type="text" class="form-control item" id="username" placeholder="Tài khoản">
                <div class="error-message" id="username-error">Username không được bỏ trống.</div>
                <div class="error-message" id="username-exists-error">Tài khoản đã tồn tại.</div>
            </div>
            <div class="form-group">
                <input type="password" class="form-control item" id="password" placeholder="Mật khẩu">
                <div class="error-message" id="password-error">Password không được bỏ trống.</div>
            </div>
            <div class="form-group">
                <input type="password" class="form-control item" id="confirmpassword" placeholder="Xác nhận mật khẩu">
                <div class="error-message" id="confirmpassword-error">Passwords không giống nhau.</div>
            </div>
            <div class="form-group">
                <input type="text" class="form-control item" id="email" placeholder="Email">
                <div class="error-message" id="email-error">Hãy nhập đúng email.</div>
            </div>
            <div class="form-group">
                <input type="text" class="form-control item" id="phone-number" placeholder="Số điện thoại">
                <div class="error-message" id="phone-error">Số điện thoại không được bỏ trống.</div>
            </div>
            <div class="form-group">
                <input type="text" class="form-control item" id="birth-date" placeholder="Sinh nhật">
                <div class="error-message" id="birthdate-error">Vui lòng nhập đầy đủ thông tin.</div>
            </div>
            <div class="form-group">
                <button type="button" class="btn btn-block create-account" id="submit-btn">Tạo tài khoản</button>
            </div>
            <div class="text-center">
                <p>Đã có tài khoản? <a href="${pageContext.request.contextPath}/login">Quay lại đăng nhập</a></p>
            </div>
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
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.min.js"></script>
    
    <!-- Custom JS -->
    <script src="${pageContext.request.contextPath}/assets/home/js/register.js"></script>
</body>
</html>
