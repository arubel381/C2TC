package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entity.User;
import com.cg.placementmanagement.service.IUserService;
import com.cg.placementmanagement.service.IUserServiceImpl;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		IUserService service = new IUserServiceImpl();
		
		//Create
		//user.setId(0);
		//user.setName("Anshu");
		//user.setPassword("admin123");
		//user.setType("USER");
		//service.addUser(user);
		//System.out.println("Data is added Successfully");
		
		//Retrieve
		//user = service.searchUserById(0);
		//System.out.println(user.getName());
		//System.out.println(user.getPassword());
		//System.out.println(user.getType());
		
	    //Update
		user.setName("Ansh");
		user.setPassword("user1234");
		user.setType("USER");
		service.updateUser(user);
		System.out.println("Update is Successfull");
		
		//Delete
		//user = service.searchUserById(0);
		//service.deleteUser(user);
		//System.out.println("Delete is Successfull");
	}

}
