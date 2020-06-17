package com.novopay;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NovopayTopNInvestorsTest {

    private TopNInvestors topNInvestors;

    @Before
    public void setUp() throws Exception {
        topNInvestors = new NovopayTopNInvestors().add(new Investor(1, "mukesh", 10))
                .add(new Investor(2, "suresh", 40))
                .add(new Investor(3, "mahesh", 30))
                .add(new Investor(4, "nidhi", 50))
                .add(new Investor(5, "akash", 20));
    }

    @After
    public void tearDown() throws Exception {
        topNInvestors = null;
    }


    //add nodes time Best O(1) Worst O(N)
    //get nodes time Best O(1) Worst O(K) where K = no of elements
    @Test
    public void get() {
        List<Investor> top3InvestorList = topNInvestors.get(3);
        assertEquals("Investor{id=4, name='nidhi', networth=50L}",top3InvestorList.get(0).toString());
        assertEquals("Investor{id=2, name='suresh', networth=40L}",top3InvestorList.get(1).toString());
        assertEquals("Investor{id=3, name='mahesh', networth=30L}",top3InvestorList.get(2).toString());
    }

}