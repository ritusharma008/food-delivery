class Student {
    String Name ;
    int Age;

    public void printInfo() {
        System.out.println(this.Name);
        System.out.println(this.Age);
    }

    Student(String Name , int Age) {    // constructor
        this.Name = Name;
        this.Age = Age;
    }
    
}
public class oops1 {
    public static void main(String[] args) {
        Student s = new Student("Ritu" , 21);
        

        s.printInfo();

    }
}
