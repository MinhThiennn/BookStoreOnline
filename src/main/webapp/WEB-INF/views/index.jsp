<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!DOCTYPE html>
  <html lang="en">
    
    <head>
      <title>
        RinzBook-NguyenHoangSon
      </title>
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

    </head>
    
    <body data-bs-spy="scroll" data-bs-target="#header" tabindex="0">
    <jsp:include page="/WEB-INF/views/layout/header.jsp" />
    
      <!--header-wrap-->
      <section id="billboard">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <button class="prev slick-arrow">
                <i class="icon icon-arrow-left">
                </i>
              </button>
              <div class="main-slider pattern-overlay">
                <div class="slider-item">
                  <div class="banner-content">
                    <h2 class="banner-title">
                      Life of the Wild
                    </h2>
                    <p>
                      Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu feugiat
                      amet, libero ipsum enim pharetra hac. Urna commodo, lacus ut magna velit
                      eleifend. Amet, quis urna, a eu.
                    </p>
                    <div class="btn-wrap">
                      <a href="#" class="btn btn-outline-accent btn-accent-arrow">
                        Xem thêm
                        <i class="icon icon-ns-arrow-right">
                        </i>
                      </a>
                    </div>
                  </div>
                  <!--banner-content-->
                  <img src="${pageContext.request.contextPath}/assets/home/images/main-banner1.jpg"
                  alt="banner" class="banner-image">
                </div>
                <!--slider-item-->
                <div class="slider-item">
                  <div class="banner-content">
                    <h2 class="banner-title">
                      Birds gonna be Happy
                    </h2>
                    <p>
                      Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu feugiat
                      amet, libero ipsum enim pharetra hac. Urna commodo, lacus ut magna velit
                      eleifend. Amet, quis urna, a eu.
                    </p>
                    <div class="btn-wrap">
                      <a href="#" class="btn btn-outline-accent btn-accent-arrow">
                        Read More
                        <i class="icon icon-ns-arrow-right">
                        </i>
                      </a>
                    </div>
                  </div>
                  <!--banner-content-->
                  <img src="${pageContext.request.contextPath}/assets/home/images/main-banner2.jpg"
                  alt="banner" class="banner-image">
                </div>
                <!--slider-item-->
              </div>
              <!--slider-->
              <button class="next slick-arrow">
                <i class="icon icon-arrow-right">
                </i>
              </button>
            </div>
          </div>
        </div>
      </section>
      <section id="client-holder" data-aos="fade-up">
        <div class="container">
          <div class="row">
            <div class="inner-content">
              <div class="logo-wrap">
                <div class="grid">
                  <a href="#">
                    <img src="${pageContext.request.contextPath}/assets/home/images/client-image1.png"
                    alt="client">
                  </a>
                  <a href="#">
                    <img src="${pageContext.request.contextPath}/assets/home/images/client-image2.png"
                    alt="client">
                  </a>
                  <a href="#">
                    <img src="${pageContext.request.contextPath}/assets/home/images/client-image3.png"
                    alt="client">
                  </a>
                  <a href="#">
                    <img src="${pageContext.request.contextPath}/assets/home/images/client-image4.png"
                    alt="client">
                  </a>
                  <a href="#">
                    <img src="${pageContext.request.contextPath}/assets/home/images/client-image5.png"
                    alt="client">
                  </a>
                </div>
              </div>
              <!--image-holder-->
            </div>
          </div>
        </div>
      </section>
      <section id="featured-books" class="py-5 my-5">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="section-header align-center">
                <div class="title">
                  <span>
                    Một số sản phẩm chất lượng
                  </span>
                </div>
                <h2 class="section-title">
                  Sách Nổi Bật
                </h2>
              </div>
              <div class="product-list" data-aos="fade-up">
                <div class="row">
                  <div class="col-md-3">
                    <div class="product-item">
                      <figure class="product-style">
                        <img src="${pageContext.request.contextPath}/assets/home/images/product-item1.jpg"
                        alt="Books" class="product-item">
                        <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                          Thêm vào giỏ hàng
                        </button>
                      </figure>
                      <figcaption>
                        <h3>
                          Simple way of piece life
                        </h3>
                        <span>
                          Armor Ramsey
                        </span>
                        <div class="item-price">
                          $ 40.00
                        </div>
                      </figcaption>
                    </div>
                  </div>
                  <div class="col-md-3">
                    <div class="product-item">
                      <figure class="product-style">
                        <img src="${pageContext.request.contextPath}/assets/home/images/product-item2.jpg"
                        alt="Books" class="product-item">
                        <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                          Thêm vào giỏ hàng
                        </button>
                      </figure>
                      <figcaption>
                        <h3>
                          Great travel at desert
                        </h3>
                        <span>
                          Sanchit Howdy
                        </span>
                        <div class="item-price">
                          $ 38.00
                        </div>
                      </figcaption>
                    </div>
                  </div>
                  <div class="col-md-3">
                    <div class="product-item">
                      <figure class="product-style">
                        <img src="${pageContext.request.contextPath}/assets/home/images/product-item3.jpg"
                        alt="Books" class="product-item">
                        <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                          Thêm vào giỏ hàng
                        </button>
                      </figure>
                      <figcaption>
                        <h3>
                          The lady beauty Scarlett
                        </h3>
                        <span>
                          Arthur Doyle
                        </span>
                        <div class="item-price">
                          $ 45.00
                        </div>
                      </figcaption>
                    </div>
                  </div>
                  <div class="col-md-3">
                    <div class="product-item">
                      <figure class="product-style">
                        <img src="${pageContext.request.contextPath}/assets/home/images/product-item4.jpg"
                        alt="Books" class="product-item">
                        <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                          Thêm vào giỏ hàng
                        </button>
                      </figure>
                      <figcaption>
                        <h3>
                          Once upon a time
                        </h3>
                        <span>
                          Klien Marry
                        </span>
                        <div class="item-price">
                          $ 35.00
                        </div>
                      </figcaption>
                    </div>
                  </div>
                </div>
                <!--ft-books-slider-->
              </div>
              <!--grid-->
            </div>
            <!--inner-content-->
          </div>
          <div class="row">
            <div class="col-md-12">
              <div class="btn-wrap align-right">
                <a href="#" class="btn-accent-arrow">
                  View all products
                  <i class="icon icon-ns-arrow-right">
                  </i>
                </a>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section id="best-selling" class="leaf-pattern-overlay">
        <div class="corner-pattern-overlay">
        </div>
        <div class="container">
          <div class="row justify-content-center">
            <div class="col-md-8">
              <div class="row">
                <div class="col-md-6">
                  <figure class="products-thumb">
                    <img src="${pageContext.request.contextPath}/assets/home/images/single-image.jpg"
                    alt="book" class="single-image">
                  </figure>
                </div>
                <div class="col-md-6">
                  <div class="product-entry">
                    <h2 class="section-title divider">
                      Sách bán chạy
                    </h2>
                    <div class="products-content">
                      <div class="author-name">
                        By Timbur Hood
                      </div>
                      <h3 class="item-title">
                        Birds gonna be happy
                      </h3>
                      <p>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu feugiat
                        amet, libero ipsum enim pharetra hac.
                      </p>
                      <div class="item-price">
                        $ 45.00
                      </div>
                      <div class="btn-wrap">
                        <a href="#" class="btn-accent-arrow">
                          shop it now
                          <i class="icon icon-ns-arrow-right">
                          </i>
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
      </section>
      <section id="popular-books" class="bookshelf py-5 my-5">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="section-header align-center">
                <div class="title">
                  <span>
                   Một Số Sản Phẩm Chất Lượng
                  </span>
                </div>
                <h2 class="section-title">
                  Với Các Thể Loại
                </h2>
              </div>
              <ul class="tabs">
                <li data-tab-target="#all-genre" class="active tab">
                  Tất cả
                </li>
                <li data-tab-target="#business" class="tab">
                  Công sở
                </li>
                <li data-tab-target="#technology" class="tab">
                  Công nghệ
                </li>
                <li data-tab-target="#romantic" class="tab">
                  Lãng mạn
                </li>
                <li data-tab-target="#adventure" class="tab">
                  Thiên nhiên
                </li>
                <li data-tab-target="#fictional" class="tab">
                  Tiểu thuyết
                </li>
              </ul>
              <div class="tab-content">
                <div id="all-genre" data-tab-content class="active">
                  <div class="row">
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item1.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Portrait photography
                          </h3>
                          <span>
                            Adam Silber
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item2.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Once upon a time
                          </h3>
                          <span>
                            Klien Marry
                          </span>
                          <div class="item-price">
                            $ 35.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item3.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Tips of simple lifestyle
                          </h3>
                          <span>
                            Bratt Smith
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item4.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Just felt from outside
                          </h3>
                          <span>
                            Nicole Wilson
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item5.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Peaceful Enlightment
                          </h3>
                          <span>
                            Marmik Lama
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item6.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Great travel at desert
                          </h3>
                          <span>
                            Sanchit Howdy
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item7.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Life among the pirates
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item8.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Simple way of piece life
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                  </div>
                </div>
                <div id="business" data-tab-content>
                  <div class="row">
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="${pageContext.request.contextPath}/assets/home/images/tab-item2.jpg"
                          alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Peaceful Enlightment
                          </h3>
                          <span>
                            Marmik Lama
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item4.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Great travel at desert
                          </h3>
                          <span>
                            Sanchit Howdy
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item6.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Life among the pirates
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item8.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Simple way of piece life
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                  </div>
                </div>
                <div id="technology" data-tab-content>
                  <div class="row">
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item1.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Peaceful Enlightment
                          </h3>
                          <span>
                            Marmik Lama
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item3.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Great travel at desert
                          </h3>
                          <span>
                            Sanchit Howdy
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item5.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Life among the pirates
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item7.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Simple way of piece life
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                  </div>
                </div>
                <div id="romantic" data-tab-content>
                  <div class="row">
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item1.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Peaceful Enlightment
                          </h3>
                          <span>
                            Marmik Lama
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item3.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Great travel at desert
                          </h3>
                          <span>
                            Sanchit Howdy
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item5.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Life among the pirates
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item7.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Simple way of piece life
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                  </div>
                </div>
                <div id="adventure" data-tab-content>
                  <div class="row">
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item5.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Life among the pirates
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item7.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Simple way of piece life
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                  </div>
                </div>
                <div id="fictional" data-tab-content>
                  <div class="row">
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item5.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Life among the pirates
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                    <div class="col-md-3">
                      <div class="product-item">
                        <figure class="product-style">
                          <img src="images/tab-item7.jpg" alt="Books" class="product-item">
                          <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                            Thêm vào giỏ hàng
                          </button>
                        </figure>
                        <figcaption>
                          <h3>
                            Simple way of piece life
                          </h3>
                          <span>
                            Armor Ramsey
                          </span>
                          <div class="item-price">
                            $ 40.00
                          </div>
                        </figcaption>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!--inner-tabs-->
          </div>
        </div>
      </section>
      <section id="quotation" class="align-center pb-5 mb-5">
        <div class="inner-content">
          <h2 class="section-title divider">
            Trích dẫn trong ngày
          </h2>
          <blockquote data-aos="fade-up">
            <q>
              “The more that you read, the more things you will know. The more that
              you learn, the more places you’ll go.”
            </q>
            <div class="author-name">
              Dr. Seuss
            </div>
          </blockquote>
        </div>
      </section>
      <section id="special-offer" class="bookshelf pb-5 mb-5">
        <div class="section-header align-center">
          <div class="title">
            <span>
              Grab your opportunity
            </span>
          </div>
          <h2 class="section-title">
            Sách có ưu đãi
          </h2>
        </div>
        <div class="container">
          <div class="row">
            <div class="inner-content">
              <div class="product-list" data-aos="fade-up">
                <div class="grid product-grid">
                  <div class="product-item">
                    <figure class="product-style">
                      <img src="images/product-item5.jpg" alt="Books" class="product-item">
                      <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                        Thêm vào giỏ hàng
                      </button>
                    </figure>
                    <figcaption>
                      <h3>
                        Simple way of piece life
                      </h3>
                      <span>
                        Armor Ramsey
                      </span>
                      <div class="item-price">
                        <span class="prev-price">
                          $ 50.00
                        </span>
                        $ 40.00
                      </div>
                  </div>
                  </figcaption>
                  <div class="product-item">
                    <figure class="product-style">
                      <img src="${pageContext.request.contextPath}/assets/home/images/product-item6.jpg"
                      alt="Books" class="product-item">
                      <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                        Thêm vào giỏ hàng
                      </button>
                    </figure>
                    <figcaption>
                      <h3>
                        Great travel at desert
                      </h3>
                      <span>
                        Sanchit Howdy
                      </span>
                      <div class="item-price">
                        <span class="prev-price">
                          $ 30.00
                        </span>
                        $ 38.00
                      </div>
                  </div>
                  </figcaption>
                  <div class="product-item">
                    <figure class="product-style">
                      <img src="${pageContext.request.contextPath}/assets/home/images/product-item7.jpg"
                      alt="Books" class="product-item">
                      <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                        Thêm vào giỏ hàng
                      </button>
                    </figure>
                    <figcaption>
                      <h3>
                        The lady beauty Scarlett
                      </h3>
                      <span>
                        Arthur Doyle
                      </span>
                      <div class="item-price">
                        <span class="prev-price">
                          $ 35.00
                        </span>
                        $ 45.00
                      </div>
                  </div>
                  </figcaption>
                  <div class="product-item">
                    <figure class="product-style">
                      <img src="${pageContext.request.contextPath}/assets/home/images/product-item8.jpg"
                      alt="Books" class="product-item">
                      <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                        Thêm vào giỏ hàng
                      </button>
                    </figure>
                    <figcaption>
                      <h3>
                        Once upon a time
                      </h3>
                      <span>
                        Klien Marry
                      </span>
                      <div class="item-price">
                        <span class="prev-price">
                          $ 25.00
                        </span>
                        $ 35.00
                      </div>
                  </div>
                  </figcaption>
                  <div class="product-item">
                    <figure class="product-style">
                      <img src="${pageContext.request.contextPath}/assets/home/images/product-item2.jpg"
                      alt="Books" class="product-item">
                      <button type="button" class="add-to-cart" data-product-tile="add-to-cart">
                        Thêm vào giỏ hàng
                      </button>
                    </figure>
                    <figcaption>
                      <h3>
                        Simple way of piece life
                      </h3>
                      <span>
                        Armor Ramsey
                      </span>
                      <div class="item-price">
                        $ 40.00
                      </div>
                    </figcaption>
                  </div>
                </div>
                <!--grid-->
              </div>
            </div>
            <!--inner-content-->
          </div>
        </div>
      </section>
      <section id="subscribe">
        <div class="container">
          <div class="row justify-content-center">
            <div class="col-md-8">
              <div class="row">
                <div class="col-md-6">
                  <div class="title-element">
                    <h2 class="section-title divider">
                      Subscribe to our newsletter
                    </h2>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="subscribe-content" data-aos="fade-up">
                    <p>
                      Sed eu feugiat amet, libero ipsum enim pharetra hac dolor sit amet, consectetur.
                      Elit adipiscing enim pharetra hac.
                    </p>
                    <form id="form">
                      <input type="text" name="email" placeholder="Enter your email addresss here">
                      <button class="btn-subscribe">
                        <span>
                          send
                        </span>
                        <i class="icon icon-send">
                        </i>
                      </button>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section id="latest-blog" class="py-5 my-5">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="section-header align-center">
                <div class="title">
                  <span>
                    Read our articles
                  </span>
                </div>
                <h2 class="section-title">
                  Latest Articles
                </h2>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <article class="column" data-aos="fade-up">
                    <figure>
                      <a href="#" class="image-hvr-effect">
                        <img src="${pageContext.request.contextPath}/assets/home/images/post-img1.jpg"
                        alt="post" class="post-image">
                      </a>
                    </figure>
                    <div class="post-item">
                      <div class="meta-date">
                        Mar 30, 2021
                      </div>
                      <h3>
                        <a href="#">
                          Reading books always makes the moments happy
                        </a>
                      </h3>
                      <div class="links-element">
                        <div class="categories">
                          inspiration
                        </div>
                        <div class="social-links">
                          <ul>
                            <li>
                              <a href="#">
                                <i class="icon icon-facebook">
                                </i>
                              </a>
                            </li>
                            <li>
                              <a href="#">
                                <i class="icon icon-twitter">
                                </i>
                              </a>
                            </li>
                            <li>
                              <a href="#">
                                <i class="icon icon-behance-square">
                                </i>
                              </a>
                            </li>
                          </ul>
                        </div>
                      </div>
                      <!--links-element-->
                    </div>
                  </article>
                </div>
                <div class="col-md-4">
                  <article class="column" data-aos="fade-up" data-aos-delay="200">
                    <figure>
                      <a href="#" class="image-hvr-effect">
                        <img src="${pageContext.request.contextPath}/assets/home/images/post-img2.jpg"
                        alt="post" class="post-image">
                      </a>
                    </figure>
                    <div class="post-item">
                      <div class="meta-date">
                        Mar 29, 2021
                      </div>
                      <h3>
                        <a href="#">
                          Reading books always makes the moments happy
                        </a>
                      </h3>
                      <div class="links-element">
                        <div class="categories">
                          inspiration
                        </div>
                        <div class="social-links">
                          <ul>
                            <li>
                              <a href="#">
                                <i class="icon icon-facebook">
                                </i>
                              </a>
                            </li>
                            <li>
                              <a href="#">
                                <i class="icon icon-twitter">
                                </i>
                              </a>
                            </li>
                            <li>
                              <a href="#">
                                <i class="icon icon-behance-square">
                                </i>
                              </a>
                            </li>
                          </ul>
                        </div>
                      </div>
                      <!--links-element-->
                    </div>
                  </article>
                </div>
                <div class="col-md-4">
                  <article class="column" data-aos="fade-up" data-aos-delay="400">
                    <figure>
                      <a href="#" class="image-hvr-effect">
                        <img src="${pageContext.request.contextPath}/assets/home/images/post-img3.jpg"
                        alt="post" class="post-image">
                      </a>
                    </figure>
                    <div class="post-item">
                      <div class="meta-date">
                        Feb 27, 2021
                      </div>
                      <h3>
                        <a href="#">
                          Reading books always makes the moments happy
                        </a>
                      </h3>
                      <div class="links-element">
                        <div class="categories">
                          inspiration
                        </div>
                        <div class="social-links">
                          <ul>
                            <li>
                              <a href="#">
                                <i class="icon icon-facebook">
                                </i>
                              </a>
                            </li>
                            <li>
                              <a href="#">
                                <i class="icon icon-twitter">
                                </i>
                              </a>
                            </li>
                            <li>
                              <a href="#">
                                <i class="icon icon-behance-square">
                                </i>
                              </a>
                            </li>
                          </ul>
                        </div>
                      </div>
                      <!--links-element-->
                    </div>
                  </article>
                </div>
              </div>
              <div class="row">
                <div class="btn-wrap align-center">
                  <a href="#" class="btn btn-outline-accent btn-accent-arrow" tabindex="0">
                    Read All Articles
                    <i class="icon icon-ns-arrow-right">
                    </i>
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section id="download-app" class="leaf-pattern-overlay">
        <div class="corner-pattern-overlay">
        </div>
        <div class="container">
          <div class="row justify-content-center">
            <div class="col-md-8">
              <div class="row">
                <div class="col-md-5">
                  <figure>
                    <img src="${pageContext.request.contextPath}/assets/home/images/device.png"
                    alt="phone" class="single-image">
                  </figure>
                </div>
                <div class="col-md-7">
                  <div class="app-info">
                    <h2 class="section-title divider">
                      Download our app now !
                    </h2>
                    <p>
                      Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sagittis sed
                      ptibus liberolectus nonet psryroin. Amet sed lorem posuere sit iaculis
                      amet, ac urna. Adipiscing fames semper erat ac in suspendisse iaculis.
                    </p>
                    <div class="google-app">
                      <img src="${pageContext.request.contextPath}/assets/home/images/google-play.jpg"
                      alt="google play">
                      <img src="${pageContext.request.contextPath}/assets/home/images/app-store.jpg"
                      alt="app store">
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
	<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
          </div>
        </div>
      </div>
      <script src="${pageContext.request.contextPath}/assets/home/js/jquery-1.11.0.min.js">
      </script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
      crossorigin="anonymous">
      </script>
      <script src="${pageContext.request.contextPath}/assets/home/js/plugins.js">
      </script>
      <script src="${pageContext.request.contextPath}/assets/home/js/script.js">
      </script>
    </body>
  
  </html>