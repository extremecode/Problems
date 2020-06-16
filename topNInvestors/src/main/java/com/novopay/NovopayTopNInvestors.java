package com.novopay;

import java.util.ArrayList;
import java.util.List;

public class NovopayTopNInvestors implements TopNInvestors{

    Node<Investor> root;

    public NovopayTopNInvestors add(Investor investor){
        if(root == null){
            root = new Node<Investor>(investor);
        }else {
            Node<Investor> cur = root;
            while (cur!=null) {
                if (cur.data.getNetworth() <= investor.getNetworth()){
                    Node<Investor> temp = new Node<Investor>(investor);
                    temp.next = cur;
                    if(cur.prev!=null) {
                        temp.prev = cur.prev;
                        temp.prev.next = temp;
                    }else {
                        root = temp;
                    }
                    cur.prev = temp;
                    break;
                }else {
                    cur = cur.next;
                }
            }
        }
        return this;
    }

    public List<String> get(int n){
        List<String> topNInvstorsList = new ArrayList<String>();
        Node<Investor>  cur = root;
        while (n !=0 && cur!=null){
            topNInvstorsList.add(cur.data.toString());
            cur = cur.next;
            n--;
        }
        return topNInvstorsList;
    }


}
