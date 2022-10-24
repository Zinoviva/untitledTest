import java.util.Comparator;

public class PersonSurnameComporator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1 == null && o2 == null)  //сравнение по количеству слов, возвращает массив
            return 0;
        String[] partWordOne = o1.getSurname().split("\\s");
        String[] partWordTwo = o2.getSurname().split("\\s");
        return partWordOne.length >= partWordTwo.length ? partWordOne.length > partWordTwo.length ? 1 : 0 : -1;
        // return Integer.compare(o1.getSurname().length(), o2.getSurname().length());  //сравнение по длине не нужно
    }
}
