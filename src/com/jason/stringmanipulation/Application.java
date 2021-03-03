package com.jason.stringmanipulation;

public class Application {
    public static void main(String[] args) {

        String text = "012345";
        String output = text.substring(2, 6);
        System.out.println(output);

        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category:apparel and the slightly "
                + "more in demand category:makeup along with the category:furniture and ….";

        String print = null;
        int i = 0;
        while (true) {
            int found = str.indexOf("category:", i);
            if (found == -1) break;
            int start = found + 9;
            int end = str.indexOf(" ", start);

            System.out.println(str.substring(start, end));

            i = end + 1;
        }

        System.out.println("Program done");


    }
}
