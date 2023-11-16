package com.ds.practice.sorting;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.employeeId == o2.employeeId) {
            return 0;
        } else if (o1.employeeId > o2.employeeId) {
            return 1;
        } else {
            return -1;
        }
    }
}
