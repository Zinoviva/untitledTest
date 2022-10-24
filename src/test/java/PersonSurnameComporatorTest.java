import org.junit.jupiter.api.*;
public class PersonSurnameComporatorTest {
    private PersonSurnameComporator personSurnameComporator;
    private Person person;

    @BeforeEach
    void setUp() {
        personSurnameComporator = new PersonSurnameComporator();
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
    @DisplayName("Тестирование компоратора")
    void compare() {
        Person person1 = new Person("Mariam", "Gorlovanova", 18);
        Person person2 = new Person("Vova", "Novikov", 24);
        Assertions.assertEquals(0,personSurnameComporator.compare(person1, person2));
    }
}
