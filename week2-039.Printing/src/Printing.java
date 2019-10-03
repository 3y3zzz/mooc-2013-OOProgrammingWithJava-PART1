
public class Printing {
    //prints a line of * 
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times   
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");                   // make sure to have this so that you can start the
    }                                             // ** would enter a new line when this is called again in a future method
    // makes a square composed of *
    public static void printSquare(int sideSize) {  
        // 39.2
        int i = 1;                                  // let sideSize = 4
        while (i <= sideSize) {                     // if i is less than 4
            printStars(sideSize);                  // I will print **** 
            i++;                                    // I will print until i get 4 layers = square
        }
    }
    //                          EXAMPLE    17          3            
    public static void printRectangle(int width, int height) {
        // 39.3
        int i = 1;
        while (i <= height) {        /// notice in a rectangle, both sides are constant
            printStars(width);        // so just set width as print stars to create a line of ***
            i++;                      // and then use the while loop to make the height of the rectangle
            }
           
    }
                                                            // i is the column
    public static void printTriangle(int size) {            // logic: printstars can be manipulated 
        // 39.4                                                using i + 1, (so u dont need to while loop)
        int i = 0;                                          // You do need while loop to make the layers
        // loop to create the right triangle                // of the triangle (no other option)
        while (i < size) {
            printStars(i + 1);
            i++;
        }
        
    }

    public static void main(String[] args) {
        /* Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct */

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
