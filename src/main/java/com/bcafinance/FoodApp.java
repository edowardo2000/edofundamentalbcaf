package com.bcafinance;


interface Convertible{
    double poundToGram=435.59;
    double UStoMalaysian=3.45;
}

abstract class Food implements Convertible{
    private String description;
    private double price;
    public Food(){};
    public Food (String desc,double pr){
        description=desc;
        price=pr;
    }
    public String getDescription(){return description;}
    public double getPrice(){return price;}
    public double calcPriceInRinggit() {return price*UStoMalaysian;}
    public abstract String displayInfo();
}

class Vegetable extends Food implements Convertible{
    private int weight;
    public Vegetable(String d, double p, int wgt){
        super(d,p);
        weight=wgt;
    }
    public double calcWeightInGram(){return weight*poundToGram;}
    public String displayInfo(){
        return "Food description: "+getDescription()+"\nWeight in pound: "+weight+" pound"+
                "\nWeight in gram : "+String.format("%3.2f",calcWeightInGram())+" grams"+"\nPrice : US"+String.format("%3.2f",getPrice())+
                "\nPrice converted to Malaysian : RM"+String.format("%3.2f",calcPriceInRinggit())+"\n";
    }
}

class CannedFood extends Food{
    private String type;
    private String expiredDate;
    public CannedFood (String d, double p, String t, String date){
        super(d,p);
        type=t;
        expiredDate=date;
    }
    public String displayInfo(){
        return "Food description: "+getDescription()+"\nCanned Food Type: "+type+
                "\nExpired date: "+expiredDate+"\nPrice : US"+String.format("%3.2f",getPrice())+
                "\nPrice converted to Malaysian : RM"+String.format("%3.2f",calcPriceInRinggit())+"\n";
    }
}

public class FoodApp{
    public static void main (String[]args){
        Food f1=new Vegetable("Celery",3.00,1);
        Food f2=new CannedFood("Rambutan in syrup",5.00,"fruit","12/12/12");
        System.out.println(f1.displayInfo());
        System.out.println(f2.displayInfo());
    }
}
