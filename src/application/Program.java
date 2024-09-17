package application;

import db.DB;
import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.sql.Connection;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("========= TEST 1: seller find by ID =========");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
