package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your tweet here: ");
        String newTweet = s.nextLine();

        if (newTweet.length() <= 140) {

            System.out.println("Length correct");

            int numberOfAttributes = 0;
            int numberOfHashtags = 0;
            int numberOfLinks = 0;

            for (int i = 0; i < newTweet.length()-1; i++) {

                if (newTweet.charAt(i) == '@'&& newTweet.charAt(i+1)!= ' ') {
                    numberOfAttributes++;
                } else if (newTweet.charAt(i) == '#'&& newTweet.charAt(i+1)!= ' ') {
                    numberOfHashtags++;
                }
                }
            System.out.println("Number of Attributes: " + numberOfAttributes);
            System.out.println("Number of Hashtags: " + numberOfHashtags);

            for (int i = 0; i < newTweet.length()-6;i++){
                if(newTweet.substring(i,i+7).toLowerCase().equals("http://")){
                    numberOfLinks++;
                }
            }
            System.out.println("Number of links: " + numberOfLinks);
        }else{
                System.out.println("Exceed Characters: " + (newTweet.length() - 140));
            }

        }

    }



