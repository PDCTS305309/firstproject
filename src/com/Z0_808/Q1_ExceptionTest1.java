/**
 * https://www.examsnet.com/test/java-se-8-programmer-1z0%E2%80%93808-practice-full-test-1/1
 **/

package com.Z0_808;

import java.io.IOException;

class X {
    public void printFileContent() throws Exception {
        //code here
        throw new IOException();
    }
}

class Y extends X {

    @Override
    public void printFileContent() throws IOException {
        //code here
        throw new IOException();
    }
}

public class Q1_ExceptionTest1 {
    public static void main(String[] args) throws Exception {
        X x = new X();
        x.printFileContent();
    }
}
