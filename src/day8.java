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
/*
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
*/

sealed interface LoginResult
        permits LoginSuccess, LoginFailure, LoginLoading {
}
record LoginSuccess() implements LoginResult {
}
record LoginFailure() implements LoginResult {
}
record LoginLoading() implements LoginResult {
}

public class day8{
    public static void main(String[] args) {
        LoginResult result1 = new LoginSuccess();
        LoginResult result2 = new LoginFailure();
        LoginResult result3 = new LoginLoading();
        displayResult(result1);
        displayResult(result2);
        displayResult(result3);
    }
    static void displayResult(LoginResult result) {
        if (result instanceof LoginSuccess) {
            System.out.println("LOGIN SUCCESS");
        } else if (result instanceof LoginFailure) {
            System.out.println("LOGIN FAILURE");
        } else if (result instanceof LoginLoading) {
            System.out.println("LOGIN LOADING");
        }
    }
}




