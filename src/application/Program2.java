package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== TEST 1: Department findById ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department d1 = departmentDao.findById(2);
		System.out.println(d1);

		System.out.println("\n=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: Department insert ===");
		Department newDepartment = new Department(null, "Video games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: Department update ===");
		d1 = departmentDao.findById(1);
		d1.setName("Construction");
		departmentDao.update(d1);
		System.out.println("Update completed!");

		System.out.println("\n=== TEST 5: Department deleteById ===");
		System.out.print("Enter the Id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();

	}

}
