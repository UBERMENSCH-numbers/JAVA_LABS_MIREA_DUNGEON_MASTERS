package Pr6;


public class Main {

    public static void main(String[] args) {
        Student[] students1 = new Student[] {
                new Student(20, "A", 4.99),
                new Student(21, "B", 3.5),
                new Student(22, "C", 2),
                new Student(21, "D", 4.21),
        };
        Student[] students2 = new Student[] {
                new Student(20, "E", 4.1),
                new Student(21, "F", 3.99),
                new Student(22, "G", 5),
                new Student(21, "H", 4.6),
        };

        Student[] students = new Student[8];
        Merger.merge(students, students1, students2, students1.length, students2.length);

        for (Student student : students)
            System.out.println(student);

        System.out.println("---");

        Merger.mergeSort(students, students.length);

        for (Student student : students)
            System.out.println(student);
    }
}
