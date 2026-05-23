package test;

import data.JdbcPerson;
import domain.Person;
import java.util.List;

public class JdbcHandlingTest {

    public static void main(String[] args) {

        JdbcPerson jdbcPerson = new JdbcPerson();

        // Test of the insert method
         jdbcPerson.insert("Charly");

        List<Person> people = jdbcPerson.select();

        for (Person person : people) {
            System.out.print(person);
            System.out.println("");
        }
    }
}