package com.ds.practice.sorting;

public class Employee implements Comparable<Employee> {
    Long employeeId;
    String employeeName;
    String employeeEmail;

    public Employee(Long employeeId, String employeeName, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }

    @Override
    public int compareTo(Employee o) {
        if (employeeId == o.employeeId) {
            return 0;
        } else if (employeeId > o.employeeId) {
            return 1;
        } else {
            return -1;
        }
    }
}
