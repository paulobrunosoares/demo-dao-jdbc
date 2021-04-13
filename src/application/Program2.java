package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: departmnet finfById ====");
		Department department = departmentDao.findById(2);
		System.out.println(department);

		/*
		 * System.out.println("\n=== TEST 2: seller finfById ===="); Department
		 * department = new Department(2, null); List<Seller> list =
		 * sellerDao.findByDepartment(department); for (Seller obj : list) {
		 * System.out.println(obj); }
		 */
		List<Department> list = new ArrayList<>();
		System.out.println("\n=== TEST 3: department finfAll ====");
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: department insert ====");
		Department newDepartment = new Department(null, "Moveis");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		
		 System.out.println("\n=== TEST 5: departmnt update ====");
		 department = departmentDao.findById(1);
		 department.setName("Mobile");
		 departmentDao.update(department);
		 System.out.println("Update completed");
	
		  
		  System.out.println("\n=== TEST 6: department delete ====");
		  System.out.println("Enter id for delete test: ");
		  int id = sc.nextInt();
		  departmentDao.deleteById(id);
		  System.out.println("Delete completed");
		  
		  sc.close();
		 
	}

}
