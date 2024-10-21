<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="format-detection" content="telephone=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="author" content="">
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
          crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/home/css/normalize.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/home/icomoon/icomoon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/home/css/vendor.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/home/css/style.css">

    <title>Trang của tôi</title>
</head>
<body>
    <div id="header-wrap">
        <div class="top-content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-6">
                        <div class="social-links">
                            <ul>
                                <li>
                                    <a href="#">
                                        <i class="icon icon-facebook"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="icon icon-twitter"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="icon icon-youtube-play"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="icon icon-behance-square"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                        <!-- social-links -->
                    </div>
                    <div class="col-md-6">
                        <div class="right-element">
                            <a href="${pageContext.request.contextPath}/login" class="user-account for-buy">
                                <i class="icon icon-user"></i>
                                <span>Tài khoản</span>
                            </a>
                            <a href="${pageContext.request.contextPath}/home/cart" class="cart for-buy">
                                <i class="icon icon-clipboard"></i>
                                <span>Giỏ hàng: (0 $)</span>
                            </a>
                            <div class="action-menu">
                                <div class="search-bar">
                                    <a href="#" class="search-button search-toggle" data-selector="#header-wrap">
                                        <i class="icon icon-search"></i>
                                    </a>
                                    <form role="search" method="get" class="search-box">
                                        <input class="search-field text search-input" placeholder="Search" type="search">
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- top-right -->
                    </div>
                </div>
            </div>
        </div>
        <!-- top-content -->
        <header id="header">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-2">
                        <div class="main-logo">
                            <a href="${pageContext.request.contextPath}/home">
                                <img src="${pageContext.request.contextPath}/assets/home/images/main-logo.png" alt="logo">
                            </a>
                        </div>
                    </div>
                    <div class="col-md-10">
                        <nav id="navbar">
                            <div class="main-menu stellarnav">
                                <ul class="menu-list">
                                    <li class="menu-item active">
                                        <a href="${pageContext.request.contextPath}/home">Trang chủ</a>
                                    </li>
                                    <li class="menu-item has-sub">
                                        <a href="#pages" class="nav-link">Xem thêm</a>
                                        <ul>
                                            <li class="active">
                                                <a href="index.html">Trang chủ</a>
                                            </li>
                                            <li>
                                                <a href="${pageContext.request.contextPath}/views/user/about-us.jsp">Giới thiệu</a>
                                            </li>
                                            <li>
                                                <a href="index.html">Phong cách</a>
                                            </li>
                                            <li>
                                                <a href="index.html">Blog</a>
                                            </li>
                                            <li>
                                                <a href="index.html">Post Single</a>
                                            </li>
                                            <li>
                                                <a href="index.html">Our Store</a>
                                            </li>
                                            <li>
                                                <a href="index.html">Product Single</a>
                                            </li>
                                            <li>
                                                <a href="index.html">Contact</a>
                                            </li>
                                            <li>
                                                <a href="index.html">Thank You</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="menu-item">
                                        <a href="#featured-books" class="nav-link">Nổi Bật</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="#popular-books" class="nav-link">Thể Loại</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="#special-offer" class="nav-link">Đề Xuất</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="#latest-blog" class="nav-link">Bài viết</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="#download-app" class="nav-link">Download App</a>
                                    </li>
                                </ul>
                                <div class="hamburger">
                                    <span class="bar"></span>
                                    <span class="bar"></span>
                                    <span class="bar"></span>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
    </div>
</body>
</html>
