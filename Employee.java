public class Employee {
    
    int eid;
    String name;
    String job;
    int sal;

    void display(){
        System.out.println(eid);
        System.out.println(name);
        System.out.println(job);
        System.out.println(sal);
    }
    
    public static void main(String args[]){

        Employee emp1 = new Employee();
        emp1.eid = 101;
        emp1.name = "Viral Kumar Maurya";
        emp1.job = "Junior Quality Assurance";
        emp1.sal = 17800;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.eid = 102;
        emp2.name = "Jezuz";
        emp2.job = "QA";
        emp2.sal = 13000;
        emp2.display();

    }
}
