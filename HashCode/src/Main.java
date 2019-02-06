public class Main {
    public static void main(String[] args){

        int a = 42;
        System.out.println(((Integer)a).hashCode());

        int b = -42;
        System.out.println(((Integer)b).hashCode());

        Student student = new Student(3, 2, "hello", "world");
        System.out.println(student.hashCode());
    }
}
