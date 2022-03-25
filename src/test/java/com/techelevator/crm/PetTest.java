package com.techelevator.crm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {
Pet pet = new Pet();
   List<String> testList  = new ArrayList<String>();
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

        String vax1 = "Rabies";
        String vax2 = "Distemper";
        String vax3 = "Parvo";
        testList.add(vax1);
        testList.add(vax2);
        testList.add(vax3);
        String expected = "Rabies, Distemper, Parvo";
        String actual = pet.listVaccinations(testList);


        Assert.assertEquals(expected,actual);


    }






}
