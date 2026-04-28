package pertemuan7;

public class studentRecApp {
    public static void main(String[] args) {
        studentRec student1 = new studentRec();
        student1.setName("Aldi");
        student1.setAddress("Politeknik Negeri Padang");
        student1.setAge(20);
        student1.setMathgrade(90);
        student1.setEnglishgrade(90);
        student1.setSciencegrade(90);
        
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Math Grade: " + student1.getMathgrade());
        System.out.println("English Grade: " + student1.getEnglishgrade());
        System.out.println("Science Grade: " + student1.getSciencegrade());
        System.out.println("Average Grade: " + student1.getAverage());
    }
}
