package Calling_Kotlin_from_Java_96.com.example.odd;

import Calling_Kotlin_from_Java_96.com.example.job.Employee;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PaintService {

    @NotNull
    public Employee employeePaintSomething(String name, Integer age) {
        return new Employee(name, age);
    }

    @NotNull
    public List<Employee> processedEmployies() {
        return new ArrayList<Employee>(new Employee("akjsk",23).getAge());
    }

}