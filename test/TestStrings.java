public class TestStrings extends TestSuite {


    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestStrings ts  = new TestStrings();
        ts.runTestSuite();
    }

    private void passingTest() {
        assertEquals("string1","string1");
    }

    private void failingTest() {
        assertEquals("string1", "string10");

    }
}