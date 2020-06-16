package com.nopopay;

import java.util.ArrayList;
import java.util.List;

public class NopopayTopNInvestors implements TopNInvestors{

    Node<Person> root;

    public NopopayTopNInvestors add(Person person){
        if(root == null){
            root = new Node<Person>(person);
        }else {
            Node<Person> cur = root;
            while (cur!=null) {
                if (cur.data.getNetworth() <= person.getNetworth()){
                    Node<Person> temp = new Node<Person>(person);
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
        Node<Person>  cur = root;
        while (n !=0 && cur!=null){
            topNInvstorsList.add(cur.data.toString());
            cur = cur.next;
            n--;
        }
        return topNInvstorsList;
    }


}