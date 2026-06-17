import java.util.LinkedList;

/*
import java.util.ArrayList;

public class day10 {
    static void main() {
        String[] Student = {"divya", "ram", "thanya", "subi","dharani"};
        System.out.println(Student.length);

        ArrayList<String> list = new ArrayList();
        list.add("divya");
        list.add("ram");
        list.add("thanya");
        list.add("subi");
        list.add("dharani");
        for (String s : list) {
            System.out.print(s);
        }
        list.remove("ram");
        System.out.println();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println();
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();
        for (String s : list) {
            System.out.print(s);
        }
    }
}
*/
/*
import java.util.ArrayList;
public class day10 {
    public static void main(){
        ArrayList<String> students = new ArrayList<>();
        students.add("divya");
        students.add("thanya");
        students.add("subi");
        students.add("dharani");
        students.add("ram");
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
        students.remove("ram");
        System.out.println("\nAfter Removing ram:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}
*/
/*
public class day10 {
    static void main(){
        LinkedList<String> queue=new LinkedList<>();
        queue.add("Tamil");
        queue.add("English");
        queue.add("Maths");
        queue.add("Science");
        while(!queue.isEmpty()){
            process(queue);
        }
    }
        static void process(LinkedList<String> queue){
            String removed=queue.removeFirst();
            System.out.println("Removed:"+removed);

        }
    }
*/
/*
public class day10 {
    static void process(LinkedList<String> list) {
        System.out.println("Removed : " + list.removeFirst());
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("101 -divya- 90");
        list.add("102 - kalai - 78");
        list.add("103 - kavin - 94");
        list.add("104 - siva - 92");
        list.add("105 - ranjani - 91");
        System.out.println("Student List:");
        System.out.println(list);
        list.add("106 - sri- 98");
        System.out.println("\nAfter Adding:");
        System.out.println(list);
        process(list);
        System.out.println("\nAfter Removing:");
        System.out.println(list);
        list.set(2, "104 - siva - 92");
        System.out.println("\nAfter Updating:");
        System.out.println(list);
    }
*/
 /*
     public class day10 {
        static void main() {
                String name = "divi";
                try {
                    System.out.println(name.charAt(0));
                    System.out.println(45/0);
                }
                catch(ArithmeticException e) {
                    System.out.println("Arithmetic Exception");
                }
                catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index Out OfBounds Exception");
                }
                catch (Exception e) {
                    System.out.println("Exception");
                }
                finally {
                    System.out.println("This will always execute");
                    name="divi";
                }
                System.out.println("Still running");
                System.out.println("Name :"+name);
            }
        }

  */

