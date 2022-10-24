import org.junit.jupiter.api.*;


public class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        System.out.println("Вызываюсь до выполнения теста");
    }
    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @BeforeAll
    static void setUpApp() {
        System.out.println("Запускаюсь до выполнения всех тестов...");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Запускаюсь после выполнения всех тестов...");
    }


    @Test
    @DisplayName("Тестирование передачи параметр в другой объект")
    void compareTo (){
        person = new Person("Oleg", "Zvonkovenko", 32);
            Assertions.assertEquals(0,person.compareTo(person));
    }
    @Test
    @DisplayName("Тестирование передачи параметр в другой объект")
    void compareToTwo (){
        person = new Person("Masha", "Zvonkova", 42);
        Assertions.assertEquals(0, person.compareTo(person));
    }

}
