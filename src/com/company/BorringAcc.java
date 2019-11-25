package com.company;

public class BorringAcc {
    public boolean adtive_acc(int balanse, int subscription) //проверка на активность
    {
        if ((balanse>-1) | (subscription>0))
            return false;
        else
            return true;
    }
}
