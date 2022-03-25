package com.techelevator.hr;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EmployeeTest {
Employee employee;
    Map<String, Double> mapTest = new HashMap<>();


    @Before
    public void setUp() throws Exception {
        System.out.println("Running...");
        employee = new Employee("Justin", "Hulett");
        mapTest.put("Walking", 100.00);
        mapTest.put("Grooming", 200.00);
        mapTest.put("Sitting", 300.00);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Done!");
    }

    @Test
    public void test_to_check_balance_returned_is_accurate(){
        //Act
        double actual = employee.getBalanceDue(mapTest);
        double expected = 550.00;
        //Assert
        Assert.assertEquals(expected, actual, 000.00);
    }

}
