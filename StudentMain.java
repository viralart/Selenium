public class StudentMain {
    public static void main(String args[]){
        Student std = new Student(1, "null", 'A');

        //using object reference variable
        std.sid = 01;
        std.name= "Viral";
        std.grade = 'C';
        std.print();

        //using method
        std.setStudentData(101, "Viral", 'A');
        std.print();

        // using constructor
        
    }
}
