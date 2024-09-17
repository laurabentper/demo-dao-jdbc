package application;

import db.DB;
import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("========= TEST 1: seller find by ID =========");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n========= TEST 2: seller find by department =========");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n========= TEST 3: seller find all =========");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }
    }
}
