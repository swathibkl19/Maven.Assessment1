package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j)
    {
        int highJump=k/j;
        int lowJump =k%j;
//
//        Object jump;
//        jump =k;
       // return ((k/j)+k%j);
        return highJump + lowJump;
    }
}
