package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.model.Item;
import com.tutorial.repo.ItemDao;
@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemDao itemDao;
	
	public List<Item> getAllItemDetails()
	{
		return itemDao.getAllItems();
	}

	public Item getItem(int itemId) {
		return itemDao.getItem(itemId);
	}
	public int deleteItem(int id) {
		return itemDao.deleteItem(id);
	}

	public int addItem(int id, String name, String category)
	{
		return itemDao.addItem(id, name, category);
	}
	
}
