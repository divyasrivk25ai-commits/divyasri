/*
public class day8 {
    record CourseRecord(String department, String coursename){
    }
    static void main() {
        CourseRecord courseRecord=new CourseRecord("AI","Bsc CS(AI)");
        System.out.println(courseRecord.department);
        System.out.println(courseRecord.coursename);

    }
}
*/

enum language{
    EN("English"),
    GR("German"),
    JP("Japanese"),
    TA("Tamil");
    String description;
    language(String description){
        this.description=description;
    }
}
    static void main(){
         System.out.println(language.EN.description);
         System.out.println(language.GR.description);
         System.out.println(language.JP.description);
         System.out.println(language.TA.description);
    }

