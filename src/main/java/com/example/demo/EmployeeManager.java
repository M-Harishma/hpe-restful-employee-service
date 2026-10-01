package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager{
    private Employees employees;

    public EmployeeManager(){
        List<Employee>list = new ArrayList<>();
        list.add(new Employee(1,"Hari","sri","hari123@gmail.com","Manager"));
        list.add(new Employee(2,"Maha","Sree","sree23@gmail.com","quality Analyser"));
        list.add(new Employee(3,"Hari","Haran","Hari34@gmail.com","Ass.Manager"));
        list.add(new Employee(4,"sudha","Kumari","Sudha34@gmail.com","CEO"));
        list.add(new Employee(5,"uma","Shankari","uma67@gmail.com","Software Developer"));

        employees = new Employees();
        employees.setEmployeeList(list);
    }


    public Employees getEmployees(){
        return employees;
    }
}
