public class Student {
    int sid;
    String name;
    char grade;

    void print(){
        System.out.println(sid+" "+name+" "+grade); 
    }

    void setStudentData(int id, String sname, char sgrade){
        sid = id;
        name = sname;
        grade = sgrade;
    }
    Student(int id, String sname, char sgrade){
        sid = id;
        name = sname;
        grade = sgrade;
    }
}
