package com.basic.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class TryWithResource {
    public static void main(String[] args){
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sriis\\IdeaProjects\\interviewprep\\README.md"))){
            System.out.print(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
