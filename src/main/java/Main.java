import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mariam", "Gorlovanova", 18));
        people.add(new Person("Oleg", "Zvonkovenko", 32));
        people.add(new Person("Vova", "Novikov", 24));
        Collections.sort(people, new PersonSurnameComporator());  //учим джаву сравнивать объекты в классе персон
        //метод сорт вторым параметром берет принцип сортировки
        System.out.println(people);//после сортировки покажет нам список в нужном порядке
    }
}
