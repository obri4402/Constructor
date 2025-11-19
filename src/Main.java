public class Main {

    public static void main(String[] args){

        //Constructor = A special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial values
        //This is a practice or a new learning


        Student student1 = new Student("Aubrey", 23, 2.5);
        Student student2 = new Student("Nichole", 24, 1.5);
        Student student3 = new Student("Joji", 21, 1.75);

        System.out.println(student1.name + " " + student1.age + " " + student1.gpa + " " + student1.isEnrolled);

        System.out.print(student2.name);
        System.out.print(" " + student2.age);
        System.out.print(" " + student2.gpa);
        System.out.print(" " + student2.isEnrolled);


    }
}
