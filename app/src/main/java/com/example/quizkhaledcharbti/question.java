package com.example.quizkhaledcharbti;

public class question {
    public String ques,op1,op2,op3,op4;
    public int nbrcorect;
public question(String ques, String op1, String op2, String op3, String op4, int nbrcorect){
    this.nbrcorect=nbrcorect;
    this.op1=op1;
    this.op2=op2;
    this.op3=op3;
    this.op4=op4;
    this.ques=ques;


}
}
