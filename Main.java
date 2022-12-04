import javax.sound.midi.Soundbank;

import OOP1.CorperateCustomer;
import OOP1.Customer;
import OOP1.IndividualCustomer;

public class Main {

	public static void main(String[] args) {

		String mesaj = "vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setUnitPrice(7500);
		product1.setImageurl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(5);
		product2.setUnitInStock(3);
		product2.setUnitPrice(4500);
		product2.setImageurl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(2);
		product3.setUnitInStock(8);
		product3.setUnitPrice(6500);
		product3.setImageurl("image3.jpg");

		// normal hayatta bu verileri bu şekilde yazmayız. Bunlar direkt veri
		// kaynağından(database) gelir.

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>"); // ul listeleri hazırlamak için html etiketi
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("036189357878841");
		individualCustomer.setCustomerNumber("34566");
		individualCustomer.setFirstName("Nagihan");
		individualCustomer.setLastName("Kurnaz");
		
		
		
		CorperateCustomer corperateCustomer = new CorperateCustomer();
		corperateCustomer.setId(2);
		corperateCustomer.setCompanyName("Kodlama.io");
		corperateCustomer.setPhoneNumber("035569256485");
		corperateCustomer.setTaxNumberString("11111111");
		corperateCustomer.setCustomerNumber("54783");
		
		
		Customer[] customers = {individualCustomer, corperateCustomer};

	}

}
