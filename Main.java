public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;
        for (Point p : points){
            sum += p.x;
        }
        return sum;
    }
    public static void main(String[] args) {
        // --- Implement all exercises here ---
        // Exercise 1: Object Creation and State Access
        Point startPoint;
        startPoint = new Point(10,20);
        System.out.println("x = " + startPoint.x);
        startPoint.move(5,-3);
        startPoint.printState();

        // Exercise 2: Demonstrating Parameter Passing by Value
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);
        System.out.println(originalValue);  /* The value remains unchanged because the variable never gets changed,
         once the originalValue was initialized there was no change set. */

        // Exercise 3: Constructor Overloading and Chaining
        Point p = new Point();
        System.out.println("(" + p.x + ", "+ p.y + ")");

        // Exercise 5: Using Varargs
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);
        // First call: passing individual Point objects
        int sum1 = sumCoordinates(p1,p2,p3);
        System.out.println(sum1);
        // Second call: using a predefined array of Points
        Point[] pointArray = { p1, p2, p3};
        int sum2 = sumCoordinates(pointArray);
        System.out.println(sum2);

        // Exercise 7: Upcasting
        Device d1 = new Device(3);
        Microwave m1 = new Microwave(5, 120);
        // Instantiating the object Device/Microwave
        Device polyDevice;  //Declaring a reference variable
        polyDevice = m1;    //Upcasting
        polyDevice.printDescription();  //Call the printDescription method using the reference
        /* The microwave class is the actual object being referenced because java determines which method to execute
        at runtime based on the object type, not the reference type*/
        // Exercise 8: Casting Safely (Downcasting)
        // polyDevice.heatFood(); not allowed since the device doesn't know about heatFood()
        if (polyDevice instanceof Microwave){
            // safety check
            Microwave microwave = (Microwave) polyDevice; // Downcasting
            microwave.heatFood();
        }
    }
}
