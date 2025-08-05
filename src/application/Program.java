package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] Args) {

		System.out.println("=== TEST 1: Seller findById ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller s1 = sellerDao.findById(2);
		System.out.println(s1);

		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		Department d = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(d);
		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n=== TEST 3: Seller findAll ===");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n=== TEST 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, d);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: Seller update ===");
		s1 = sellerDao.findById(1);
		s1.setName("Jonas Mendes");
		sellerDao.update(s1);
		System.out.println("Update completed!");

	}
}
