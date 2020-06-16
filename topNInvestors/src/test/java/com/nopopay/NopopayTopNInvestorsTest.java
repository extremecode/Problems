package com.nopopay;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NopopayTopNInvestorsTest {

    private TopNInvestors topNInvestors;

    @Before
    public void setUp() throws Exception {
        topNInvestors = new NopopayTopNInvestors().add(new Person(1, "mukesh", 10))
                .add(new Person(2, "suresh", 40))
                .add(new Person(3, "mahesh", 30))
                .add(new Person(4, "nidhi", 50))
                .add(new Person(5, "akash", 20));
    }

    @After
    public void tearDown() throws Exception {
        topNInvestors = null;
    }


    //add nodes time Best O(1) Worst O(N)
    //get nodes time Best O(1) Worst O(K) where K = no of elements
    @Test
    public void get() {
        List<String> top3InvestorList = topNInvestors.get(3);
        assertEquals("Person{id=4, name='nidhi', networth=50L}",top3InvestorList.get(0));
        assertEquals("Person{id=2, name='suresh', networth=40L}",top3InvestorList.get(1));
        assertEquals("Person{id=3, name='mahesh', networth=30L}",top3InvestorList.get(2));
    }

}