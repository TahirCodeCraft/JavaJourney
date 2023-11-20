package com.company;

import java.io.*;
import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        try{
            FileOutputStream fos= new FileOutputStream("students.txt",true);
            DataOutputStream dos= new DataOutputStream(fos);
            while(true){
                System.out.println("Enter name of student : ");
                String name= input.nextLine();
                System.out.println("Enter marks of "+ name + " and enter negative number for stoping");
                double marks= input.nextDouble();
                input.nextLine();
                if(marks<0){
                    break;
                }
                dos.writeUTF(name);
                dos.writeDouble(marks);
            }
        }catch(Exception e){
            System.out.println(e+"this error occure");
            System.exit(0);
        }
        System.out.println("Your file is created and name is Student.txt");
    }
}

