package dao.mongo.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.mongo.entity.Gender;
import dao.mongo.entity.LogosLovgosConnection;
import dao.mongo.entity.LovgosInscription;
import dao.mongo.entity.LovgosMotif;
import dao.mongo.entity.User;
import dao.mongo.entity.UserType;
import dao.mongo.services.UsersService;

public class StatTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("mongo-context.xml");
		UsersService usersService = ctx.getBean(UsersService.class);
		
		
		List<String> coordinates = new ArrayList<String>();
		coordinates.add("15.45");
		coordinates.add("16.58");
		
		List<String> motifs = new ArrayList<String>();
		motifs.add(LovgosMotif.Amuser.getLovgosMotif());
		motifs.add(LovgosMotif.PratiquerLangues.getLovgosMotif());
		
		User u1 = new User(LogosLovgosConnection.Logos.getLogosLovgosConnection(), UserType.Student.getUserType()
				, "20/03/2001", Gender.Male.getGender(), LovgosInscription.Inscrit.getLovgosInscription()
				, coordinates, motifs, "19");
		
//		usersService.createUser(u1);
		
	User u2 = usersService.getUserByID("5af466f4e946ca11a8576855");
	System.out.println(u2);
	
	
		
		

	}
}
