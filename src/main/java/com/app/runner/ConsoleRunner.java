package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		//1. Insert data
				/*repo.save(new Product(10,"A",3.3));
				repo.save(new Product(11,"B",4.3));
				repo.save(new Product(12,"C",5.3));
				repo.save(new Product(13,"D",6.3));
				repo.save(new Product(14,"E",7.3));*/

		
		//2.update call
		
				//repo.save(new Product(13,"DD",5.58));
		
		//3.Bulk insert
		
				List<Product> prds=Arrays.asList(
						new Product(101,"R",9.9),
						new Product(102,"S",8.9),
						new Product(103,"T",7.9),
						new Product(104,"U",6.9),
						new Product(105,"V",5.9)
						);
				repo.saveAll(prds);
		
		
		
		//4.Fetch one row
		
				/* Optional<Product> p=repo.findById(12);
				if(p.isPresent()) {
					//avoid null pointer exception
					Product prd=p.get();
					System.out.println(prd.getProdCode());
				}
				else {
					System.out.println("row not found");
				} */
		
		
		
		//5.fetch all rows
		
				//List<Product> list=repo.findAll();
				//list.forEach(System.out::println);
		
		
		//6.delete row
		
				//repo.deleteById(14);
		
		//7.delete all rows
				
				//repo.deleteAll();//one by one row deleted
				

		//8.delete all rows in batch
		
				//repo.deleteAllInBatch();










	}

}
