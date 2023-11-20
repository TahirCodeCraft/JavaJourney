package com.company;
import java.io.*;

public class question_2 {
    public static void main(String[] args) {
        int length=0;
        try{
            FileInputStream fis= new FileInputStream("students.txt");
            DataInputStream dis= new DataInputStream(fis);
            while(true){
                String name = dis.readUTF();
                Double marks= dis.readDouble();
                System.out.println(name + " " + marks);
                length++;
            }
        }catch(Exception e){
            System.out.println(" ");
        }
        int count=0;
        String namesArray[] =new String[length];
        double marksArray[] =new double[length];
        try{
            FileInputStream fis= new FileInputStream("students.txt");
            DataInputStream dis= new DataInputStream(fis);
            for (int i = 0; i < marksArray.length; i++) {
                namesArray[i]= dis.readUTF();
                marksArray[i]= dis.readDouble();
            }
        }catch(Exception e){
            System.out.println(e+ "this error occur");
        }
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(marksArray[i]<marksArray[j]){
                    Double temp=marksArray[i];
                    marksArray[i]=marksArray[j];
                    marksArray[j]=temp;
//                  names in decending
                    String sTemp=namesArray[i];
                    namesArray[i]=namesArray[j];
                    namesArray[j]=sTemp;
                }
            }
        }
        System.out.println("MARKS AND NAMES IN DECENDING ORDER ARE : ");
        for (int i = 0; i < marksArray.length; i++) {
            System.out.print(namesArray[i] + " ");
            System.out.print(marksArray[i]);
            System.out.println();

        }
    }
}

