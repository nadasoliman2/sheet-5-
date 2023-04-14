/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject218;

import java.util.Date;
import javax.xml.crypto.Data;
public class Account {
    private  int id ;
    private double balance;
    private double annualInterestRate;
    private Data datacreated;
    Account(){
        id=0;
        balance =0;
        annualInterestRate=0;
    }
    Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public int getid(){
    return id;
    }
    public void setid(int id){
    this.id=id;
    }
    public double getbalance(){
    return balance;
    }
    public void setbalance(double balance){
    this.balance=balance;
    }
    public double getannualInterestRate(){
    return annualInterestRate;
    }
     public void setannualInterestRate(double annualInterestRate){
     this.annualInterestRate=annualInterestRate;
     }
     public Data getdatecreated(){
     return datacreated ;
     }
    public double getMonthlyInterestRate(){
    return annualInterestRate/12;
    }
     public double getMonthlyInterest(){
    return (this.getMonthlyInterest()-100)/12;    
            }
     public  double withdraw(double amount){
             return this.getbalance()-amount;
      }
      public double deposite(double amount){
    return this.getbalance()+amount;
     
     }   
}




