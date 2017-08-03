package org.spri.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.spri.shoppingbackend.dao.CategoryDAO;
import org.spri.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for some television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		//adding second category
		category =  new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("This is some description for some laptop");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		
		//adding third category
		category =  new Category();
		category.setId(3);
		category.setName("Mobile");
		category.setDescription("This is some description for some Mobile");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		
		
		
	}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		return null;
		
	}

}
