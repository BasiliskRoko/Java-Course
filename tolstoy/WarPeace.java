/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bercut.course.tolstoy;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class WordsArray{
    List<CountWord> listWords = new ArrayList<>();
    /*
    ������ ���������:
    1. ��������������
    2. ���������
    3. ������
    4. ���������������
    5. �������
    6. ������������
    7. ����
    8. �������
    */
    private final String[][] groups = {
        {"��","��","��","��","���","���","��","��","��","��","��","��","��","��","���","���","���","���","��","��","��","��","��","��","��","��"},
        {"���","���","���","��","��","��","��","���","���","����","���","���","���"},
        {"���","���","���","����","����","���","���","���","��","��","��","��","��","��","��","���","���","���","��","���","���","��","��","���",
            "���","���","���","��","�","��","��","���","���","��","�","�","��","�","��","��","��","��","��","���","���"},
        {"�","��","��","��","����","���","���","��","��","�","���","��","��","��","�","���","��","���","��","��","��","�","�","��","���","��","�",
            "�","��","��","�","��","��","�","��", "���", "���", "������","��","��","��","���","���"},
        {"���", "���", "����", "����", "����", "���", "���", "���", "���","���","���","����","���","���","��","��","��"},
        {"����","�����","����","���","���","���","���","���","�����","����","���","���","���","���","���","�����","���","���","������","������",
            "���","���","����","���","���","��","���","���","���","�����"},
        {"�����","�����","�����","������","�����","�������","����","�����","�����","����","�����","����","����","���","������","���","�����",
            "���","����","���","���","�����","��","���","����","������","�����","����","����","�����","���"},
        {"�","��","��","��"}
    };
    
    public boolean addGroup(int index, String newWord){
        for(String endword: groups[index]){
            if(newWord.substring(newWord.length()-endword.length()).compareTo(endword) == 0){
                add(newWord);
                return true;
            }
        }
        return false;
    }
    
    public void add(String newWord){
        CountWord word = new CountWord(newWord);
        int index;
        if((index = listWords.indexOf(word)) != -1){
            listWords.get(index).increment();
        }
        else{
            listWords.add(word);
        }      
    }
    
    public void sort(){
        Collections.sort(listWords);
    }
    
    public String getWord(int index) throws Exception{
        return listWords.get(index).getWord();
    }
}


/**
 *
 * @author seredov-a
 */
public class WarPeace {
    
    public static Integer tryParse(String text) throws NumberFormatException{
        return Integer.parseInt(text);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        if(args.length == 0)
            throw new IllegalArgumentException("not args");
        WordsArray wordsArray = new WordsArray();
        
        int minLen = 3;
        int maxLen = Integer.MAX_VALUE;
        int topOut = 1;
        int groupWord = 0;
        try{
            if(args.length>1)
                minLen = tryParse(args[1]);        
            if(args.length>2)
                maxLen = tryParse(args[2]);
            if(args.length>3)
                topOut = tryParse(args[3]);
            if(args.length>4)
                groupWord = tryParse(args[4]);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());            
        }
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "UTF-8"))){
            String line;
            
            
            
            
            while ((line = br.readLine()) != null){
                String[] words = line.toLowerCase().split("[^a-zA-Z0-9\u0401\u0451\u0410-\u044f]");
                for(String word: words){
                    if(word.length() <= minLen || word.length() > maxLen){
                        continue;
                    }
                    wordsArray.addGroup(groupWord, word);                    
                }
            }     
            
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        wordsArray.sort();
        
        try{
            System.out.println("Top " + topOut + " most frequency words:");
            for(int index=0;index<topOut;index++){
                System.out.println(wordsArray.getWord(index));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}
