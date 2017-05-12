package com.basic.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by srikanth on 12/5/17.
 */
public class ResourseManagement7 {

    public static void main(String args[]){
        try(BufferedReader br =new BufferedReader(new FileReader("/home/srikanth/IdeaProjects/interviewprep/interviewprep/pom.xml"))){
            System.out.println("File"+br.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
