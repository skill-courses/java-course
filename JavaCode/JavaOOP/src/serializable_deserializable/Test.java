package serializable_deserializable;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception{
         // Serializable
        Person person = new Person();
        person.setName("xiaoming");
        person.setAge(18);
    
        //create file
        try (ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream(new File("./Person.txt")))) {
            outputFile.writeObject(person); // write person to file
        }
        
        // deserializable
        // read file
        Person personDeserializable;
        try (ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream(new File("./Person.txt")))) {
            personDeserializable = (Person) inputFile.readObject();
        }
        System.out.println(personDeserializable.getName());
    }
    
}
