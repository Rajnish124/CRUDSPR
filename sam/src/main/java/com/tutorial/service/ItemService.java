package com.tutorial.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tutorial.model.Item;
@Component
public interface ItemService {

	public List<Item> getAllItemDetails();
	public Item getItem(int itemId);
	public int deleteItem(int id);
	public  int addItem(int id, String name, String category);
}
