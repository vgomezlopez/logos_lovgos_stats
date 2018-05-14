package dao.mongo.test;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.mongo.entity.User;
import dao.mongo.services.UsersService;


public class StatTest {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException  {
				ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("mongo-context.xml");
				UsersService usersService = ctx.getBean(UsersService.class);
				
				
		//		List<String> coordinates = new ArrayList<String>();
		//		coordinates.add("15.45");
		//		coordinates.add("16.58");
		//		
		//		List<String> motifs = new ArrayList<String>();
		//		motifs.add(LovgosMotif.Amuser.getLovgosMotif());
		//		motifs.add(LovgosMotif.PratiquerLangues.getLovgosMotif());
		//		
		//		User u1 = new User(LogosLovgosConnection.Logos.getLogosLovgosConnection(), UserType.Student.getUserType()
		//				, "20/03/2001", Gender.Male.getGender(), LovgosInscription.Inscrit.getLovgosInscription()
		//				, coordinates, motifs, "19");
		//		
		////		usersService.createUser(u1);
		//		
			User u2 = usersService.getUserByID(15005);
//			System.out.println(u2);
			
			List<User> liste = usersService.getAllUsers();
			for(User u: liste) {
				System.out.println(u);
			}

		//	usersService.updateUserConnection(u2,LogosLovgosConnection.NotConnected.getLogosLovgosConnection());

		//	usersService.deleteUser(u2);


	}
}
