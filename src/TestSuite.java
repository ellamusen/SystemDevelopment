public abstract class TestSuite {

    // Members / values to class
    private int passed;
    private int failed;



    // Methods


    public abstract void testMethodList();

    protected void runTestSuite(){
        passed = 0;
        failed = 0;

        testMethodList();

        System.out.println("Test passed:\t" + passed);
        System.out.println("Test failed:\t" + failed);

    }

    public void assertEquals(int expected, int actual){
        if (expected == actual){
            passed++;
        }
        else {
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\nExpected result: " + expected + "\nActual result: " + actual);
        }



    }


}
