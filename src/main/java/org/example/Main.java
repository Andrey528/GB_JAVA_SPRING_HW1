package org.example;

import com.google.gson.Gson;
import org.example.domain.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);

        // Serialize to JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        // Deserialize from JSON
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println(deserializedPerson);
    }
}