package org.spri.shoppingbackend.dao;

import java.util.List;

import org.spri.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	Category get(int id);
}
