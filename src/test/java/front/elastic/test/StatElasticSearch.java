package front.elastic.test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import front.elastic.services.ManageUsers;
import front.elastic.users.ElevesLovegos;

public class StatElasticSearch {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

		ManageUsers m = new ManageUsers();

		// CREATION DOCUMENT
		
		List<String> motifs = Arrays.asList("serieux", "peuImporte", "amuser");
//		GeoLocation  geo = new GeoLocation(44.8167d,4.5833d);
		GeoPoint geo = new GeoPoint(44.8167,4.5833);
		
		ElevesLovegos e = new ElevesLovegos(3, "logos", "eleveLovegos", 32, "M", geo, true,motifs);
		m.addElevesLovegos(e,e.getId());
		
		

		// GET DOCUMENT IN ELASTICSEARCH
//		GetResponse responseGet = client.prepareGet("eleves_lovegos2", "eleves", "1").get();
//		System.out.println(responseGet);
//		
//		// UPDATE DOCUMENT
//		UpdateRequest updateRequest = new UpdateRequest();
//		updateRequest.index("eleves_lovegos2");
//		updateRequest.type("eleves");
//		updateRequest.id("1");
//		updateRequest.doc(XContentFactory.jsonBuilder()
//				.startObject()
//				.field("connection", "logos")
//				.endObject());
//		client.update(updateRequest).get();
//
//		GetResponse response1 = client.prepareGet("eleves_lovegos2", "eleves", "1").get();
//		System.out.println(response1);
//		
		// SUPPRESSION
//		m.deleteUtilisateur(1);

	}

}
