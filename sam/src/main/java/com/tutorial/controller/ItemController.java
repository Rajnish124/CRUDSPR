package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.model.Item;

import com.tutorial.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
    ItemService itemService;;

    @RequestMapping("/getAllItems")
    @ResponseBody
    public List<Item> getAllItems(){
        return itemService.getAllItemDetails();
    }
    
    @RequestMapping("/getItem")
    @ResponseBody
    public Item getItem(@RequestParam("itemid") int itemid)
    {
    	return itemService.getItem(itemid);
    }
    
    @RequestMapping("/deteteItem")
    @ResponseBody
    public String deteteItem(@RequestParam("itemId") int itemId){
        if(itemService.deleteItem(itemId) >= 1){
            return "Item Deleted Successfully";
        }else{
            return "Something went wrong !";
        }
    }
    
    @RequestMapping("/addItem")
    @ResponseBody
    public String addItem(@RequestParam("id") int id, @RequestParam("name") String name,@RequestParam("category") String category)
    {
    	if(itemService.addItem(id,name,category) >= 1) {
    		return "Item added successfully";
    	}
    	else
    	{
    		return "Something went wrong";
    	}
    }
}
