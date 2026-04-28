/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;


public class studentRec {
    
    //variabel declaration
    private String name;
    private String address;
    private int age;
    private double mathgrade;
    private double englishgrade;
    private double sciencegrade;
    private double average;
    private static int studentCount;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getMathgrade() {
        return mathgrade;
    } 
    public void setMathgrade(double mathgrade) {
        this.mathgrade = mathgrade;
    }      
    public double getEnglishgrade() {
        return englishgrade;
    }  
    public void setEnglishgrade(double englishgrade) {
        this.englishgrade = englishgrade;
    }
    public double getSciencegrade() {
        return sciencegrade;
    }
    public void setSciencegrade(double sciencegrade) {
        this.sciencegrade = sciencegrade;
    }
    public double getAverage() {
        double sum = mathgrade + englishgrade + sciencegrade;
        average = sum / 3;
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    public static int getStudentCount() {
        return studentCount;
    }
    public static void setStudentCount(int studentCount) {
        studentRec.studentCount = studentCount;
    }

}

