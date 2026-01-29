package applications;

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
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller s: list) {
			System.out.println(s);
		}
	}
}
