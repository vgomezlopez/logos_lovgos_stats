package front.elastic.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.mongo.entity.ConnectionUsers;
import dao.mongo.services.SessionService;
import front.elastic.users.HistoriqueConnex;

public class ManageConnexion {
	
	private TransportClient client;
	private String index = "users2";
	private String type = "user";
	private SessionService sessionService;

	@SuppressWarnings({ "resource", "unchecked" })
	public ManageConnexion() throws IOException {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("mongo-context.xml");
		sessionService = ctx.getBean(SessionService.class);


		// se connecter à Elastic Search
		try {
			client= new PreBuiltTransportClient(Settings.EMPTY)
					.addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300))
					.addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9301));

		} catch (UnknownHostException e) {
			System.out.println("Erreur de connection à Elastic Search");
			e.printStackTrace();
		}
	}

	
	
	
//	public HistoriqueConnex getNbrConnectesByDate (LocalDate date) {
//		List<ConnectionUsers> sessionsAll = sessionService.get
//		
//		return null;
//	}
	
	
	
	
	
}
