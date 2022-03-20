package com.harman.project2;

import java.io.*;

public class Fileread {
    public static void main(String[] args) {
        try
        {
            FileInputStream obj_inp = new FileInputStream("data.txt");
            DataInputStream in = new DataInputStream(obj_inp);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str = br.readLine();
            int cnt[] = new int[5];
            for (int i = 0; i < str.length(); ++i)
            {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
                {
                    cnt[0]++;
                }
                if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                    cnt[1]++;
                }
                if (str.charAt(i) == 'i' || str.charAt(i) == 'I')
                {
                    cnt[2]++;
                }
                if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
                {
                    cnt[3]++;
                }
                if (str.charAt(i) == 'u' || str.charAt(i) == 'U')
                {
                    cnt[4]++;
                }
            }
            System.out.println("Count of A = " + cnt[0]);
            System.out.println("Count of E = " + cnt[1]);
            System.out.println("Count of I = " + cnt[2]);
            System.out.println("Count of O = " + cnt[3]);
            System.out.println("Count of U = " + cnt[4]);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
