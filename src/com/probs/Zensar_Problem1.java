package com.probs;


import java.util.Scanner;

public class Zensar_Problem1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        boolean flag = true;
        int beforeIncryption = 0;
        int temp;
        int incryptValue;

        while (flag) {
            System.out.println("Please Enter exactly 4 digit enteger ");
            beforeIncryption = myScanner.nextInt();

            if (beforeIncryption - 1000 >= 0 && beforeIncryption - 1000
                    <= 8999)
                flag = false;
        }
        temp = beforeIncryption;

        int v1, v2, v3, v4;

        v4 = temp % 10;
        v4 += 7;
        v4 %= 10;

        temp /= 10;

        v3 = temp % 10;
        v3 += 7;
        v3 %= 10;

        temp /= 10;

        v2 = temp % 10;
        v2 += 7;
        v2 %= 10;

        temp /= 10;

        v1 = temp % 10;
        v1 += 7;
        v1 %= 10;

        temp = v1;
        v1 = v3;
        v3 = temp;

        temp = v2;
        v2 = v4;
        v4 = temp;


        incryptValue = v1 * 1000 + v2 * 100 + v3 * 10 + v4 * 1;// combine
        System.out.println("Encrypted data is " + incryptValue);

        int myIncrypt;//take encrypted input from user
        System.out.println("Enter encrypted data ");
        myIncrypt = myScanner.nextInt();
        //decryption process

        int dv1, dv2, dv3, dv4, decryptValue;

        dv4 = myIncrypt % 10;
        myIncrypt /= 10;

        dv3 = myIncrypt % 10;
        myIncrypt /= 10;

        dv2 = myIncrypt % 10;
        myIncrypt /= 10;

        dv1 = myIncrypt % 10;
        myIncrypt /= 10;

        temp = dv1;
        dv1 = dv3;
        dv3 = temp;

        temp = dv2;
        dv2 = dv4;
        dv4 = temp;

        dv1 += 10;
        dv1 -= 7;
        dv1 %= 10;

        dv2 += 10;
        dv2 -= 7;
        dv2 %= 10;

        dv3 += 10;
        dv3 -= 7;
        dv3 %= 10;

        dv4 += 10;
        dv4 -= 7;
        dv4 %= 10;

        decryptValue = dv1 * 1000 + dv2 * 100 + dv3 * 10 + dv4 * 1;

        System.out.println("decrypted data is" + decryptValue);

    }

}
