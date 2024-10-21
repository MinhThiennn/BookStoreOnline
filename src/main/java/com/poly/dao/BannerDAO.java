package com.poly.dao;

import com.poly.entity.Banners;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BannerDAO {
    private Connection connection;

    public BannerDAO(Connection connection) {
        this.connection = connection;
    }

    public void addBanner(Banners banner) throws SQLException {
        String sql = "INSERT INTO Banners (image_url, link, status) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, banner.getImageUrl());
            stmt.setString(2, banner.getLink());
            stmt.setBoolean(3, banner.isStatus());
            stmt.executeUpdate();
        }
    }

    public Banners getBannerById(int id) throws SQLException {
        String sql = "SELECT * FROM Banners WHERE banner_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Banners banner = new Banners();
                banner.setId(rs.getInt("banner_id"));
                banner.setImageUrl(rs.getString("image_url"));
                banner.setLink(rs.getString("link"));
                banner.setStatus(rs.getBoolean("status"));
                return banner;
            }
        }
        return null;
    }

    public List<Banners> getAllBanners() throws SQLException {
        List<Banners> bannerList = new ArrayList<>();
        String sql = "SELECT * FROM Banners";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Banners banner = new Banners();
                banner.setId(rs.getInt("banner_id"));
                banner.setImageUrl(rs.getString("image_url"));
                banner.setLink(rs.getString("link"));
                banner.setStatus(rs.getBoolean("status"));
                bannerList.add(banner);
            }
        }
        return bannerList;
    }

    public void updateBanner(Banners banner) throws SQLException {
        String sql = "UPDATE Banners SET image_url = ?, link = ?, status = ? WHERE banner_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, banner.getImageUrl());
            stmt.setString(2, banner.getLink());
            stmt.setBoolean(3, banner.isStatus());
            stmt.setInt(4, banner.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteBanner(int id) throws SQLException {
        String sql = "DELETE FROM Banners WHERE banner_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
