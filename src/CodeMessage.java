import com.sun.jdi.CharValue;
import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodeMessage {

    private String plainText = "abcd";
    int length = plainText.length();
    private int[] ciphers = new int[length];
    private int shiftValue;

    public int ciphering(char c) {
        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(c);
        return index;
    }

    public void encrypt() {

        ArrayList<Integer> arraylll = new ArrayList<>();
        arraylll.add(2);
        arraylll.add(1);
        System.out.println(arraylll.toString());
        Collections.sort(arraylll, new Comparator());
        System.out.println(arraylll.toString());

        char[] chars = plainText.toCharArray();
        int counter = 0;
        for (char c : plainText.toCharArray()) {
            ciphers[counter] = ciphering(chars[counter]);
            counter++;
        }
        System.out.println(Arrays.toString(ciphers));
        System.out.println();
        for (int i = 0; i < plainText.length(); i++) {
            char[] chars2 = plainText.toCharArray();
            ciphers[i] = ciphering(chars2[i]);
        }
        System.out.println(Arrays.toString(ciphers));
    }

    public static void main(String[] args){
        CodeMessage codeMessage = new CodeMessage();

        try {
            File path = new File("member.txt");
            BufferedWriter fw = new BufferedWriter(new FileWriter(path));

            fw.write("hejhej");
            fw.newLine();

            fw.write("hejhej");

            fw.write("hejhej");
            BufferedReader fr = new BufferedReader(new FileReader(path));
            System.out.println(fr.readLine());
            codeMessage.encrypt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Check if everything is right");
        }
    }
}
