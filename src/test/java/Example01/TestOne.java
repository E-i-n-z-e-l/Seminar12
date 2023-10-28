package Example01;

import org.junit.*;

public class TestOne {
    // BeforeClass — будет выполняться один раз перед всеми тестами в этом классе.
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass - This will be executed once before all tests in this class.");
    }

    // Before — это будет выполняться перед каждым тестом.
    @Before
    public void setUp() {
        System.out.println("Before - This will be executed before each test.");
    }

    // Это образец теста.
    @Test
    public void testMethod1() {
        System.out.println("Test Method 1 - This is a sample test.");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2 - This is another sample test.");
    }

    // After - это будет выполняться после каждого теста.
    @After
    public void tearDown() {
        System.out.println("After - This will be executed after each test.");
    }

    // AfterClass - это будет выполнено один раз после всех тестов в этом классе.
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass - This will be executed once after all tests in this class.");
    }
}