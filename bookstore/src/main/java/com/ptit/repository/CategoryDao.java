package com.ptit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ptit.model.Author;
import com.ptit.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long>{
	public Optional<Category> findByNameAllIgnoreCase(String categoryName); 
	
	@Query("SELECT  MAX(categoryId) from Category")
	public int getLastIdCategory();
}
