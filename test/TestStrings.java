public class TestStrings extends TestSuite {


    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.runTestSuite();
    }

    private void passingTest() {
        // Ændres fra int til String
        assertEquals(new String("string1"),new String("string1"));
    }

    private void failingTest() {
        assertEquals(new String("string1"), new String("string10"));

    }
}