package ru.retail.product;

public class Eatable extends Product{

    private String experationDate;

    public Eatable(String name, String id, float price, String experationDate){
        super(name, id, price);
        this.experationDate = experationDate;
    }

    public String getExperationDate() {
        return experationDate;
    }
}
