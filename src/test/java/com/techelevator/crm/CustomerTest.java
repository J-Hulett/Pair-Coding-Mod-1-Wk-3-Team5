package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.hr.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;
    Map<String, Double> mapTest = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Bob", "Johnson", "555-555-5555");
        mapTest.put("Walking", 100.00);
        mapTest.put("Grooming", 200.00);
        mapTest.put("Sitting", 300.00);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_to_check_balance_returned_is_accurate(){
        //Arrange

        //Act
        double actual = customer.getBalanceDue(mapTest);
        double expected = 600.00;
        //Assert
        Assert.assertEquals(expected, actual, 000.00);
    }


}
