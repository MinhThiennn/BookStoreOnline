// login.js

$(document).ready(function() {
    $('#login-form').on('submit', function(event) {
        let isValid = true;

        // Ẩn tất cả thông báo lỗi trước khi kiểm tra
        $('.error-message').hide();

        // Kiểm tra tên người dùng
        if ($('#username').val().trim() === "") {
            $('#username-error').fadeIn(); // Hiển thị thông báo lỗi với hiệu ứng
            isValid = false;
        }

        // Kiểm tra mật khẩu
        if ($('#password').val().trim() === "") {
            $('#password-error').fadeIn(); // Hiển thị thông báo lỗi với hiệu ứng
            isValid = false;
        }

        // Nếu form không hợp lệ, ngăn không cho gửi form
        if (!isValid) {
            event.preventDefault();
        } else {
            // Nếu cần, có thể thêm mã để xử lý đăng nhập hoặc chuyển hướng ở đây
            alert("Đăng nhập thành công!");
        }
    });

    // Ẩn thông báo lỗi khi người dùng click vào
    $('.error-message').on('click', function() {
        $(this).fadeOut(); // Ẩn thông báo lỗi khi người dùng click vào
    });
});
