package com.company;

public class Credit {
    private int id;
    private Customer customer;
    private int term;
    private float percent;
    private float summ;
    private float summToReturn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credit(int id, Customer customer, int term, float percent, float summ, float summToReturn) {
        this.id = id;
        this.customer = customer;
        this.term = term;
        this.percent = percent;
        this.summ = summ;
        this.summToReturn = summToReturn;
    }

    public float getSummToReturn() {
        return summToReturn;
    }

    public void setSummToReturn(float summToReturn) {
        this.summToReturn = summToReturn;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getSumm() {
        return summ;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }
}
