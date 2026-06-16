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