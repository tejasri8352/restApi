package com.ezeu.firstrestapi;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("items")

public class ItemResource {

	ItemRepository repo =new ItemRepository();
	
	
	@GET 
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	
	public List<Item> getItems()
	{
     	System.out.print("get item called.........");
	    return repo.getItems(); 
	
	}
	
	@GET 
	@Path("item/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Item getItem(@PathParam("id")int id)
	{
		return repo.getItemById(id);
	}
	
	@POST
	@Path("item")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Item createItem(Item i1)
	{
		System.out.println(i1);
		repo.create(i1);
		return i1;
	}
	
	@PUT
	@Path("item")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Item updateItem(Item i1)
	{
		System.out.println(i1);
		if(repo.getItemById(i1.getId()).getId()==0)
		{
			repo.create(i1);
			System.out.println("item created");
		}
		else
		{
			repo.update(i1);
			System.out.println("item updated");
		}
		return i1;
	}
	
	@DELETE
	@Path("item/{id}")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Item removeItem(@PathParam("id")int id)
	{
		Item i1 = repo.getItemById(id);
		if(i1.getId()!=0)
		{
			repo.delete(id);
			System.out.println("item deleted");
			
		}
		return i1;
		
	}


}
