package com.vuscreen;

/*On a distant planet far away from Earth lives a boy named Aman.He loves to run everyday.But his running distance is directly affected by how much horlicks his mother mixed in his milk today.If his mother has mixed x grams of horlicks,then Aman will be capable of running 100*x meters at most on that day.

        Aman's instructor, Mr.Sharma ,is a very strict yet very caring.Everyday he asks Aman to run around a circle of radius r once.If Aman is able to complete the circle,he would get a toffee.

        Note:Take value of pie=22/7.

        CONSTRAINTS:

        1<=d<105

        1<=r<106

        1<=x<=104

        INPUT:

        First line contains d,no. of days Aman goes to his instructor.Next d lines each contain r,radius of circle and x,amount of horlicks.

        OUTPUT:

        Print total number of toffees Aman would finally have at the end of d days.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class AmanAndMrSharma {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int count = Integer.parseInt(s.nextLine());
        //     System.out.println(count);

        inputFun(s,count);
    }

    public static void inputFun(Scanner s,int count){
        int sum = 0;

//        System.out.println(count);
        for(int pos = 0;pos < count ;pos++){
            //    System.out.println(sum);
            String data = s.nextLine();
            //       System.out.println(data+"......"+count+"....."+pos);

            //     System.out.println("////"+splitSum(data));

            sum = sum + splitSum(data);
        }
        if(sum == 0){}else{
            System.out.println(sum);
        }

    }

    public static int splitSum(String data){
        //  System.out.println(data);
        String a[] = data.split("\\s+");
        //     System.out.println(data);
        int val1 = Integer.parseInt(a[0]);
        int val2 = Integer.parseInt(a[1]);
        // System.out.println(val1);
        //  System.out.println(val2);

        if((100 * val2) > (2*22*val1 / 7 ))
            return 1;
        else
            return 0;
    }

}

