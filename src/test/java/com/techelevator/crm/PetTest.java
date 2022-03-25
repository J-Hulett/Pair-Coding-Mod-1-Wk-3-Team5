package com.techelevator.crm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {
Pet pet = new Pet();

    @Before
    public void setUp() throws Exception {
       String message ="Running..";
        System.out.println(message);
    }

    @After
    public void tearDown() throws Exception {
        String endMsg = "Done!";
        System.out.println(endMsg);
    }

    @Test

    public void testPrintTheList(){
        //Arrange
        pet.getVaccinations().add("Rabies");
        pet.getVaccinations().add("Distemper");
        pet.getVaccinations().add("Parvo");
        String expected = "Rabies, Distemper, Parvo";
        //Act
        String actual = pet.listVaccinations();
        //Assert
        Assert.assertEquals(expected,actual);
    }



}
