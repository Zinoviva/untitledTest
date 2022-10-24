public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {   // создайте конструктор на все поля
        this.name = name;                                  //заполняем поля напрямую из параметра конструктора
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {  // создайте геттеры и сеттеры
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {  //переопределим toString чтобы красиво выводить на экран
        return name + " " + surname + " " + age;
    }

    @Override
    public int compareTo(Person o) {  //джава берет один объект вызывает у него метод compareTo и передает параметр в другой объект
        if (surname.length() < o.surname.length()) {
            return -1;
            //return surname.compareTo(o.surname);  //если у одного человека с другим, то мы берем свою фамилию и сравниваемся с фам другого чел
        } else if (surname.length() > o.surname.length()) {
            return 1;
        } else {
            return Integer.compare(age, o.age);  //если значения одинаковые, то знатен тот кто старше
        }
    }

}