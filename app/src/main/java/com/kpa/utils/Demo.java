package com.kpa.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

    public static void gen() {

        File file = new File("./app/src/main/res/values/dimens.xml");
        BufferedReader reader = null;
        StringBuilder sw480 = new StringBuilder();
        StringBuilder sw600 = new StringBuilder();
        StringBuilder sw720 = new StringBuilder();
        StringBuilder sw800 = new StringBuilder();
        StringBuilder w820 = new StringBuilder();
        StringBuilder w360 = new StringBuilder();
        StringBuilder w1080 = new StringBuilder();
        StringBuilder w1440 = new StringBuilder();
        StringBuilder w1200 = new StringBuilder();
        StringBuilder w1600 = new StringBuilder();
        StringBuilder w2048 = new StringBuilder();
        StringBuilder w2560 = new StringBuilder();
        StringBuilder w240 = new StringBuilder();
        StringBuilder w900 = new StringBuilder();
        StringBuilder w1442 = new StringBuilder();
        StringBuilder w1014 = new StringBuilder();
        StringBuilder w785 = new StringBuilder();

        try {
            System.out.println("生成不同分辨率：");
            reader = new BufferedReader(new FileReader(file));
            String tempString;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束

            while ((tempString = reader.readLine()) != null) {

                if (tempString.contains("</dimen>")) {
                    //tempString = tempString.replaceAll(" ", "");
                    String start = tempString.substring(0, tempString.indexOf(">") + 1);
                    String end = tempString.substring(tempString.lastIndexOf("<") - 2);
                    float num = Float.valueOf(tempString.substring(tempString.indexOf(">") + 1, tempString.indexOf("</dimen>") - 2));

                    sw480.append(start).append(splitAndRound((float) (num * 0.67), 3)).append(end).append("\n");
                    sw600.append(start).append(splitAndRound((float) (num * 0.83), 3)).append(end).append("\n");
                    sw720.append(start).append(splitAndRound((float) (num * 1.00), 3)).append(end).append("\n");
                    sw800.append(start).append(splitAndRound((float) (num * 1.11), 3)).append(end).append("\n");
                    w820.append(start).append(splitAndRound((float) (num * 1.34), 3)).append(end).append("\n");
                    w360.append(start).append(splitAndRound((float) (num * 0.50), 3)).append(end).append("\n");
                    w1080.append(start).append(splitAndRound((float) (num * 1.50), 3)).append(end).append("\n");
                    w1440.append(start).append(splitAndRound((float) (num * 2.00), 3)).append(end).append("\n");
                    w1200.append(start).append(splitAndRound((float) (num * 1.67), 3)).append(end).append("\n");
                    w1600.append(start).append(splitAndRound((float) (num * 2.22), 3)).append(end).append("\n");
                    w2048.append(start).append(splitAndRound((float) (num * 2.84), 3)).append(end).append("\n");
                    w2560.append(start).append(splitAndRound((float) (num * 3.56), 3)).append(end).append("\n");
                    w240.append(start).append(splitAndRound((float) (num * 0.33), 3)).append(end).append("\n");
                    w900.append(start).append(splitAndRound((float) (num * 1.25), 3)).append(end).append("\n");
                    w1442.append(start).append(splitAndRound((float) (num * 2.003), 3)).append(end).append("\n");
                    w1014.append(start).append(splitAndRound((float) (num * 1.375), 3)).append(end).append("\n");
                    w785.append(start).append(splitAndRound((float) (num * 2.453125), 3)).append(end).append("\n");
                } else {
                    sw480.append(tempString).append("\n");
                    sw600.append(tempString).append("\n");
                    sw720.append(tempString).append("\n");
                    sw800.append(tempString).append("\n");
                    w820.append(tempString).append("\n");
                    w360.append(tempString).append("\n");
                    w1080.append(tempString).append("\n");
                    w1440.append(tempString).append("\n");
                    w1200.append(tempString).append("\n");
                    w1600.append(tempString).append("\n");
                    w2048.append(tempString).append("\n");
                    w2560.append(tempString).append("\n");
                    w240.append(tempString).append("\n");
                    w900.append(tempString).append("\n");
                    w1442.append(tempString).append("\n");
                    w1014.append(tempString).append("\n");
                    w785.append(tempString).append("\n");
                }
                line++;
            }
            reader.close();
            System.out.println("<!--  sw480 -->");
            System.out.println(sw480);
            System.out.println("<!--  sw600 -->");
            System.out.println(sw600);

            System.out.println("<!--  sw720 -->");
            System.out.println(sw720);
            System.out.println("<!--  sw800 -->");
            System.out.println(sw800);

            String sw480file = "./app/src/main/res/values-sw480dp/dimens.xml";
            String sw600file = "./app/src/main/res/values-sw600dp/dimens.xml";
            String sw720file = "./app/src/main/res/values-sw720dp/dimens.xml";
            String sw800file = "./app/src/main/res/values-sw800dp/dimens.xml";
            String w820file = "./app/src/main/res/values-w820dp/dimens.xml";
            String w360file = "./app/src/main/res/values-w360dp/dimens.xml";
            String w1080file = "./app/src/main/res/values-w1080dp/dimens.xml";
            String w1200file = "./app/src/main/res/values-w1200dp/dimens.xml";
            String w1440file = "./app/src/main/res/values-w1440dp/dimens.xml";
            String w1600file = "./app/src/main/res/values-w1600dp/dimens.xml";
            String w2048file = "./app/src/main/res/values-w2048dp/dimens.xml";
            String w2560file = "./app/src/main/res/values-w2560dp/dimens.xml";
            String w240file = "./app/src/main/res/values-sw240dp/dimens.xml";
            String w900file = "./app/src/main/res/values-w900dp/dimens.xml";
            String w1442file = "./app/src/main/res/values-w1442dp/dimens.xml";
            String w1014file = "./app/src/main/res/values-sw1014dp/dimens.xml";
            String w785file = "./app/src/main/res/values-sw785dp/dimens.xml";
            writeFile(sw480file, sw480.toString());
            writeFile(sw600file, sw600.toString());
            writeFile(sw720file, sw720.toString());
            writeFile(sw800file, sw800.toString());
            writeFile(w820file, w820.toString());
            writeFile(w360file, w360.toString());
            writeFile(w1200file, w1200.toString());
            writeFile(w1440file, w1440.toString());
            writeFile(w1080file, w1080.toString());
            writeFile(w1600file, w1600.toString());
            writeFile(w2048file, w2048.toString());
            writeFile(w2560file, w2560.toString());
            writeFile(w240file, w240.toString());
            writeFile(w900file, w900.toString());
            writeFile(w1442file, w1442.toString());
            writeFile(w1014file, w1014.toString());
            writeFile(w785file, w785.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static float splitAndRound(float a, int n) {
        a = (float) (a * Math.pow(10, n));
        return (float) ((Math.round(a)) / (Math.pow(10, n)));
    }

    public static void writeFile(String file, String text) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.close();
    }

    public static void main(String[] args) {
        gen();
    }
}