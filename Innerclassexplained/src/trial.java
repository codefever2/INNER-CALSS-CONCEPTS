class Outer {

    // Method defined inside outer class
    void outerMethod()
    {

        // Print statement
        System.out.println("inside outerMethod");
    }

    // Class 2
    // Inner class
    class trial {

        // Main driver method
        public static void main(String[] args)
        {

            // Display message for better readability
            System.out.println("inside inner class Method");
        }
        Outer o = new Outer();

        Outer.trial in = o.new trial();
        trial.main();
    }
    //cannot have main method inside inner class as it is static and called from itself
