package com.company;

public class BillCycle { //механизм общего пакета услуг, типа подписки

    private int subscription; //сколько осталось подписки

    public boolean adtive(int user_data, int end_subscription) //проверка на активность
                        // user_data - дата формирования запроса , end_subscription - срок подписки
    {
        this.subscription=end_subscription-user_data;
        if (subscription>0)
        return true;
         else 
        return false;
    }

}
