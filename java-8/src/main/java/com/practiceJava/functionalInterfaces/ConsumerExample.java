package com.practiceJava.functionalInterfaces;

import com.practiceJava.data.Student;
import com.practiceJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void printName(){
        Consumer<Student> c2 = (student)-> System.out.println(student);
        StudentDataBase.getAllStudents().forEach(c2);
    }

    public static void printNameAndActivities(){
        Consumer<Student> c3 = (student)-> System.out.println(student.getName());
        Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());;
        StudentDataBase.getAllStudents().forEach(c3.andThen(c4));//consumer chaining
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("Java 8 Consumer Example");
        printName();
        printNameAndActivities();
    }
}
