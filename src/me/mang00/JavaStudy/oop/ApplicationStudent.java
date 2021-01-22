package me.mang00.JavaStudy.oop;

class Student {
    //학생 클래스
    //특성 -> 이름, 수학점수, 영어점수
    private String name;
    private int math, english;

    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

}

class ScorePrinter {
    //성적 출력 클래스
    //기능 -> 학생정보를 받아서 그 학생 한명의 수학 + 영어의 평균을 출력
    public void printAverage(Student student) {
        System.out.print(student.getName() + "'s average: ");
        System.out.println((student.getMath() + student.getEnglish()) / 2.0);
    }

}

public class ApplicationStudent {
    public static void main(String[] args) {
        Student s1 = new Student("a", 100, 0);
        Student s2 = new Student("b", 0, 50);
        Student s3 = new Student("c", 75, 50);

        ScorePrinter scorePrinter = new ScorePrinter();
        scorePrinter.printAverage(s1);
        scorePrinter.printAverage(s2);
        scorePrinter.printAverage(s3);

    }
}
