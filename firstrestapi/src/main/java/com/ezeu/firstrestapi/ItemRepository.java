package com.ezeu.firstrestapi;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
	 List<Item> items;
	    
	    public  ItemRepository()
	    {
	    	
	    	items = new ArrayList<>();
	    	
	    	Item i1 = new Item();
	    	i1.setId(1);
	    	i1.setItemname("lays");
	    	i1.setPrice(20);
	    	
	    	Item i2 = new Item();
	    	i2.setId(2);
	    	i2.setItemname("pizza");
	    	i2.setPrice(200);
	    	
	    	Item i3 = new Item();
	    	i3.setId(3);
	    	i3.setItemname("coke");
	    	i3.setPrice(30);
	    	
	    	
	    	
	    	items.add(i1);
	    	items.add(i2);
	    	items.add(i3);
	    }
	    	
	    	public List<Item> getItems()
	    	{
	    		return items;
	    		
	    	}
	    	
	    	public Item getItemById(int id)
	    	{
	    	   
	    		for (Item e : items)
	    		{
	    	       if(e.getId()==id){
	    	    	   return e;
	    	       }
	    	      
	            }
	    		 return new Item();
	    	}

			public void create(Item i1) {
				items.add(i1);
				
			}

			public void update(Item i1) {
				
				items.add(i1);
			}

			public void delete(int i1) {
				
				items.remove(i1);
				
			}


}
