package applications;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("teste numero 1: find by Id: ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("teste numero 2: find by Department: ");
		Department dep = new Department(2, "Electronics");
		List<Seller> list1 = sellerDao.findByDepartment(dep);
		for(Seller s: list1) {
			System.out.println(s);
		}
		System.out.println("teste numero 3: find all: ");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller s: list2) {
			System.out.println(s);
		}
		System.out.println("teste numero 4: seller insert: ");
		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(seller2);
		System.out.println("Inserted! New id = "+seller2.getId());
		
	}
}
