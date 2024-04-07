package org.example;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setClusterName("dev");
        clientConfig.getNetworkConfig().addAddress("localhost:5701");

        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);

        IMap<String, Person> personMap = client.getMap("persons");

        for(int i=0; i<10000; i++) {
            personMap.put(Integer.toString(i), new Person("Hamza"));
        }

        for (int i = 0; i < 10000; i++) {
            Person person = personMap.get(""+i);
            System.out.println("person with key " + i + ": " + person.getName());
        }

        client.shutdown();
    }
}