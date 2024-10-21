package com.poly.entity;

public class Banners {
    private int id; // ID của banner
    private String imageUrl; // Đường dẫn đến hình ảnh
    private String link; // Liên kết khi nhấp vào banner
    private boolean status; // Trạng thái banner (hiện hoặc ẩn)

    // Getter và setter cho thuộc tính id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter và setter cho thuộc tính imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Getter và setter cho thuộc tính link
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    // Getter và setter cho thuộc tính status
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
