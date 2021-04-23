package com.tutorial.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tutorial.model.Item;
@Component
public interface ItemDao {

	 public List<Item> getAllItems();
	 public Item getItem(int itemId);
	 public int deleteItem(int id);
	 public int addItem(int id, String name, String category);
}