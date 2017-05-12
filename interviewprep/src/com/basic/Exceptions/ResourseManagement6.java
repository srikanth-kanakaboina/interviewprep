package com.basic.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by srikanth on 12/5/17.
 */
public class ResourseManagement6 {

    public static void main(String args[]){
        BufferedReader br=null;

        try{
            br=new BufferedReader(new FileReader("/home/srikanth/IdeaProjects/interviewprep/interviewprep/pom.xml"));
            System.out.println(br.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br!=null)
                    br.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }

    }
}
