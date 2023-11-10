import java.util.Scanner;

public class ShapeProgram {
    public static void main(String[] args) {
        int choose=0;
        int side=0;
        int length=0;
        int width=0;
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        
        while (loop) {      // This loop will continue until the user chooses the Exit option.
            System.out.println();
            System.out.println("Choose Shape to implement (2 to 4, 1 to Exit)- \n");
            System.out.println("\t1. Exit");
            System.out.println("\t2. Draw a line\n\t3. Draw a rectangle\n\t4. Draw a triangle");
            System.out.println();
            System.out.print("Choose : ");
            choose = input.nextInt();
            System.out.println();

            switch (choose) {
                case 4:
                    System.out.println();
                    triangle(side, input);
                    System.out.println();
                    sleepTimer(); // This sleepTimer will help the user to see the result as the program will not exit until user chooses Exit.
                    break;
                case 3:
                    System.out.println();
                    rectangle(length, width, input);
                    System.out.println();
                    sleepTimer(); // This sleepTimer will help the user to see the result as the program will not exit until user chooses Exit.
                    break;
                case 2:
                    System.out.println();
                    line(length, input);
                    System.out.println();
                    sleepTimer(); // This sleepTimer will help the user to see the result as the program will not exit until user chooses Exit.
                    break;
                case 1:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid Option. Try Again after 5 seconds!!!");
                    sleepTimer(); // Retry after 5 seconds
                    break;
            }
        }
        input.close();
    }
    
    public static void sleepTimer(){    // Copied from https://www.baeldung.com/java-delay-code-execution
        try {
                        Thread.sleep(5 * 1000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
    }

    public static void line(int line, Scanner input) {
        System.out.print("Enter line length : ");
        line = input.nextInt();
        System.out.println();
        System.out.println("Result : \n");
        
        for (int j=0;j<line;j++) {
            System.out.print("#");
        }
        System.out.print("\n");
    }
    
    public static void rectangle(int length,int width, Scanner input) {
        System.out.print("Enter length : ");
        length = input.nextInt();
        System.out.println();
        System.out.print("Enter width : ");
        width = input.nextInt();
        System.out.println();
        int i=1;
        System.out.println("Result : \n");
        
        do {
            for (int j=0;j<length;j++) {
                System.out.print("#");
            }
            System.out.print("\n");
            i+=1;
        }while(i<=width);
    }

    public static void triangle(int side, Scanner input) {
        System.out.print("Enter side length : ");
        side = input.nextInt();
        System.out.println();
        int i=1;
        System.out.println("Result : \n");
        
        do {
            for (int j=0;j<i;j++) {
                System.out.print("#");
            }
            System.out.print("\n");
            i+=1;
        }while(i<=side);
    }
}