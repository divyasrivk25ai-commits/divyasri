import java.sql.SQLOutput;

void main() {
    /*
    int[][] marks = new int[5][3];
    int[][] studentsmarks = {
            {78, 90, 34}, {89, 65, 89}, {12, 34, 56}, {66, 12, 89}, {33, 77, 88}
    };
    String[] subjects = {"Maths", "Physics", "Chemistry"};
    for (int col = 0; col < 3; col++) {
        int total = 0;
        for (int row = 0; row < 5; row++) {
            total += studentsmarks[row][col];
        }
        double average = total / 5.0;
        System.out.println(subjects[col]);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println();
    }
    System.out.println("no\tM\tP\tC");
    for (int row = 0; row < studentsmarks.length; row++) {
        System.out.print((row + 1) + "\t");
        for (int col = 0; col < studentsmarks[row].length; col++) {
            System.out.print(studentsmarks[row][col] + "\t");
        }
        System.out.println();
    }
}
     */
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your name:");
    String name = Sc.nextLine();
    System.out.println("enter your department:");
    String department = Sc.nextLine();
    System.out.println("enter your age:");
    String age = Sc.nextLine();
    System.out.println("Details:");
    System.out.println("name:" + name);
    System.out.println("department:"+department);
    System.out.println("age:"+ age);
}
