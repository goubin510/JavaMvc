import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class Modele {
	MongoClient mongoClient;
	MongoDatabase database;
	MongoCollection<Document> collection;

	public Modele() {

	}

	public void addData(String name, String num) {

		// connect to mongo db
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

		// select mongo db
		MongoDatabase database = mongoClient.getDatabase("mvc");

		// select db collection
		MongoCollection<Document> collection = database.getCollection("data");

		Document doc = new Document("name", name)
			.append("num", num);

		collection.insertOne(doc);
	}

	public String show() {

		String str = "";

		// connect to mongo db
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

		// select mongo db
		MongoDatabase database = mongoClient.getDatabase("mvc");

		// select db collection
		MongoCollection<Document> collection = database.getCollection("data");

		for (Document cur : collection.find()) {
		    str += cur.get("name") + "        " + cur.get("num") + "\n";
		}

		return str;
	}

	public void find(String name) {
		System.out.println("not implemented yet...");
	}

}