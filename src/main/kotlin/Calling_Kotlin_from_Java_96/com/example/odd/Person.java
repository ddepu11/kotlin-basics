package Calling_Kotlin_from_Java_96.com.example.odd;

import Calling_Kotlin_from_Java_96.com.example.job.Employee;

class Person {

    public static void main(String[] args) {
        Employee emp = new Employee("Mohan Kumar",20);

        processJob(emp);
    }

    public static void processJob(Employee emp){
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        emp.setAge(26);
        System.out.println(emp.getAge());
    }
}