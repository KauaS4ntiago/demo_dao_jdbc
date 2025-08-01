package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] Args) {

		Department d1 = new Department(1, "Books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller s1 = sellerDao.findById(2);
		System.out.println(s1);
	}
}
