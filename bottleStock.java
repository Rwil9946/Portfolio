import java.util.Scanner;
import java.util.Arrays;

public class bottleStock {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String answer = " ";
    int[] beerone = new int[31];
    while (!answer.equals("N")){
        System.out.print("Please enter the cooler number: ");
        int cooler = scan.nextInt();
        
    if(cooler == 1) {
        cooler1(beerone);
    } else if (cooler == 2) {
        cooler2(beerone);
    } else if (cooler == 3) {
        cooler3(beerone);
    } else if (cooler == 4) {
        cooler4(beerone);
    } else if (cooler == 5) {
        cooler5(beerone);
    }

    System.out.print("Do you want to enter another cooler? Y or N: ");
    answer = scan.next();
}  
        System.out.println("\n\n");
        System.out.println("Miller Lite: " + (beerone[0]+beerone[25]));
        System.out.println("Coors Light: " + (beerone[1]+beerone[24]));
        System.out.println("Bud Light: " + (beerone[2]+beerone[26]));
        System.out.println("PBR: " + beerone[3]);
        System.out.println("Jai Alai: " + beerone[4]);
        System.out.println("White Claw Mango: " + beerone[5]);
        System.out.println("White Claw Black Cherry: " + beerone[6]);
        System.out.println("Mich Ultra: " + (beerone[7]+beerone[27]));
        System.out.println("Landshark: " + (beerone[8]+beerone[23]));
        System.out.println("Sam Adams: " + beerone[9]);
        System.out.println("Heineken: " + beerone[10]);
        System.out.println("Woodchuck: " + beerone[11]);
        System.out.println("New Castle: " + beerone[12]);
        System.out.println("Guinness: " + beerone[13]);
        System.out.println("Blue Moon: " + beerone[14]);
        System.out.println("Stella: " + beerone[15]);
        System.out.println("Yuengling: " + (beerone[16]+beerone[22]));
        System.out.println("Corona Extra: " + beerone[17]);
        System.out.println("Bud Light Lime: " + beerone[18]);
        System.out.println("Budweiser: " + beerone[19]);
        System.out.println("Corona Light: " + beerone[20]);
        System.out.println("Corona Premier: " + beerone[21]);
        System.out.println("Heineken Zero: " + beerone[28]);
        System.out.println("Saratoga Silver: " + beerone[29]);
        System.out.println("Saratoga Blue: " + beerone[30]);
}

    public static int[] cooler1(int[] beerone) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the amount of bottles you need.");
        System.out.print("Miller Lite: ");
        beerone[0] = scan.nextInt();
        System.out.print("Coors Light: ");
        beerone[1] = scan.nextInt();
        System.out.print("Bud Light: ");
        beerone[2] = scan.nextInt();
        System.out.print("PBR: ");
        beerone[3] = scan.nextInt();
        System.out.print("Jai Alai: ");
        beerone[4] = scan.nextInt();
        System.out.print("White Claw Mango: ");
        beerone[5] = scan.nextInt();
        System.out.print("White Claw Black Cherry: ");
        beerone[6] = scan.nextInt();
        return beerone;
    }
    public static void cooler2(int[] beerone) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of bottles you need.");
        System.out.print("Mich Ultra: ");
        beerone[7] = scan.nextInt();
        System.out.print("Landshark: ");
        beerone[8] = scan.nextInt();
        System.out.print("Sam Adams: ");
        beerone[9] = scan.nextInt();
        System.out.print("Heineken: ");
        beerone[10] = scan.nextInt();
        System.out.print("Woodchuck: ");
        beerone[11] = scan.nextInt();
        System.out.print("New Castle: ");
        beerone[12] = scan.nextInt();
        System.out.print("Guinness: ");
        beerone[13] = scan.nextInt();
        System.out.print("Blue Moon: ");
        beerone[14] = scan.nextInt();
    }
    public static void cooler3(int[] beerone) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of bottles you need.");
        System.out.print("Stella: ");
        beerone[15] = scan.nextInt();
        System.out.print("Yuengling: ");
        beerone[16] = scan.nextInt();
        System.out.print("Corona Extra: ");
        beerone[17] = scan.nextInt();
        System.out.print("Bud Light Lime: ");
        beerone[18] = scan.nextInt();
        System.out.print("Budweiser: ");
        beerone[19] = scan.nextInt();
        System.out.print("Corona Light: ");
        beerone[20] = scan.nextInt();
        System.out.print("Corona Premier: ");
        beerone[21] = scan.nextInt();
    }
    public static void cooler4(int[] beerone) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of bottles you need.");
        System.out.print("Yuengling: ");
        beerone[22] = scan.nextInt();
        System.out.print("Landshark: ");
        beerone[23] = scan.nextInt();
        System.out.print("Coors Light: ");
        beerone[24] = scan.nextInt();
    }
    public static void cooler5(int[] beerone) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of bottles you need.");
        System.out.print("Miller Lite: ");
        beerone[25] = scan.nextInt();
        System.out.print("Bud Light: ");
        beerone[26] = scan.nextInt();
        System.out.print("Mich Ultra: ");
        beerone[27] = scan.nextInt();
        System.out.print("Heineken Zero: ");
        beerone[28] = scan.nextInt();
        System.out.print("Saratoga Silver: ");
        beerone[29] = scan.nextInt();
        System.out.print("Saratoga Blue: ");
        beerone[30] = scan.nextInt();
    }
    public static void needs() {
        System.out.println("Here is what you need: ");



    }
}
