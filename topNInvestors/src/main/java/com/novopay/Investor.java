package com.novopay;

public class Investor {
    private int id;
    private String name;
    private int networth;

    public Investor(int id, String name, int networth) {
        this.id = id;
        this.name = name;
        this.networth = networth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }

    @Override
    public String toString() {
        return "Investor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", networth=" + networth +"L"+
                '}';
    }

}
