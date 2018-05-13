package front.elastic.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.json.JSONObject;

import front.elastic.users.ElevesLovegos;
import front.elastic.users.Utilisateur;
import io.netty.handler.codec.json.JsonObjectDecoder;

public class ManageUsers {

	private TransportClient client;
	private String index = "eleveslovegos11";
	private String type = "eleves";


	@SuppressWarnings({ "resource", "unchecked" })
	public ManageUsers() throws IOException {
		// se connecter à Elastic Search
		try {
			client= new PreBuiltTransportClient(Settings.EMPTY)
					.addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300))
					.addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9301));
			
			String url = "http://localhost:9200/"+index;
			if(new DefaultHttpClient().execute(new HttpGet(url)).getStatusLine().getStatusCode()==404) {
				HttpClient client1 = new DefaultHttpClient();
				HttpPut put = new HttpPut(url);
				put.setHeader("Content-Type","application/json");
				StringEntity entity = new StringEntity("{\"mappings\": {\"eleves\": {\"properties\": {\"geoLoc\": {\"type\": \"geo_point\"}}}}}");
				put.setEntity(entity);
				HttpResponse response1= client1.execute(put);
				System.out.println(response1.getStatusLine().getStatusCode());
				
				BufferedReader rd = new BufferedReader(new InputStreamReader(response1.getEntity().getContent()));
				StringBuffer result = new StringBuffer();
				String line = "";
				while((line=rd.readLine()) != null) {
					result.append(line);
				}
				System.out.println(result.toString());
				
			}
			
			
			

		} catch (UnknownHostException e) {
			System.out.println("Erreur de connection à Elastic Search");
			e.printStackTrace();
		}

	}


	// CREATION DOCUMENT DANS ELASTICSEARCH
	public void addElevesLovegos(ElevesLovegos u, Integer id) throws IOException {

		XContentBuilder xb =  XContentFactory.jsonBuilder().startObject();
		xb.field("connection", u.getConnection())
		.field("type", u.getType())
		.field("age", u.getAge())
		.field("genre",u.getGenre())
		.field("geoLoc",u.getGeoLoc())
		.field("statutPremium",u.isStatutPremium());

		xb.startArray("motifs");
		for (String o : u.getMotifs()) {
			xb.value(o);
		}
		xb.endArray();

		xb.endObject();
		client.prepareIndex(index,type, id.toString()).setSource(xb).get();

	}

	public void deleteUtilisateur(Integer id) {
		client.prepareDelete(index, type,id.toString()).get();
	}


}
