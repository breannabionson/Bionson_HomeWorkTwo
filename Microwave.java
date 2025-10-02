//Exercise 4: Implementing Inheritance and Superclass Constructor Call
public class Microwave extends Device {
    // This declares Microwave as a subclass of Device
        private int maxTime;
        // Add a new instance field to Microwave

        public Microwave(int startPower, int maxCookingTime){
            // Constructor with two parameters and superclass
            super(startPower);  // This calls the constructor in Device to set a powerLevel
            this.maxTime = maxCookingTime;  // Sets the field for Microwave
        }
    // Exercise 6: Method Overriding
    @Override
    public void printDescription(){
            // Call the superclass method
        super.printDescription();
        // Add Microwave-specific information
        System.out.println("Max cooking time: " + maxTime + " seconds");
        }
    //Exercise 7:
    public void heatFood(){
            System.out.println("Food is heating");
        }
    }
