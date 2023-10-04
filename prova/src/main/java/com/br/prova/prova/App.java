package com.br.prova.prova;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.br.prova.model.Projetos;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
        		fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        
        MongoClient mongoClient = new MongoClient("localhost:27017", 
        		MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        
        MongoDatabase database = mongoClient.getDatabase("gestao")
        		.withCodecRegistry(pojoCodecRegistry);
        
        MongoCollection<Projetos> collection = database.getCollection("projetos", Projetos.class);
        
        collection.insertOne(new Projetos("Sistema", "fazer, coisas" , "feito", 10));
    }
}
