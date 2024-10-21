package com.poly.entity;

public class Product {
    private int id;                // ID của sản phẩm
    private String name;           // Tên sản phẩm
    private double price;          // Giá sản phẩm
    private String description;     // Mô tả sản phẩm
    private String imageUrl;       // Đường dẫn hình ảnh sản phẩm

    // Constructor
    public Product() {}

    public Product(int id, String name, double price, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Getters và Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
