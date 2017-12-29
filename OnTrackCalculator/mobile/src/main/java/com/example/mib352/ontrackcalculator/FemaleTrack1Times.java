package com.example.mib352.ontrackcalculator;

/**
 * Created by mib352 on 2017-12-29.
 */
import android.app.Activity;
public class FemaleTrack1Times {

    Boolean male;
    Boolean female;
    int Age;
    public int x;
    float FiftyFreestyle;
    float HundredFreestyle;
    float TwoFreestyle;
    float FourFreestyle;
    float EightFreestyle;
    float Mile;
    float HundredBack;
    float TwoBack;
    float oneBreast;
    float twoBreast;
    float oneFly;
    float twoFly;
    float TwoMedley;
    float FourMedley;
    float Track1[];
    public void FemaleTrack1Times()
    {
        if (Age == 13)
        {
            x = 3;
            Track1 = new float[] {EightFreestyle, Mile, TwoBack, FourMedley};
        }
        else if (Age == 14)
        {
            x = 10;
            Track1 = new float[] {TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack, TwoBack, oneBreast, twoBreast,
                                twoFly, TwoMedley, FourMedley};
        }
        else if (Age == 15 || Age == 16 )
        {
            x = 12;
            Track1 = new float [] {HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack, TwoBack,
                                oneBreast, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
        }
        else if (Age == 17)
        {
            x = 13;
            Track1 = new float [] {FiftyFreestyle, HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack, TwoBack,
                    oneBreast, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
        }
        else if  (Age == 18)
        {
            x = 9;
            Track1 = new float[] {FiftyFreestyle, HundredFreestyle, TwoFreestyle, FourFreestyle, HundredBack, oneBreast, twoBreast,
                                oneFly, twoFly, TwoMedley};
        }
        else if (Age == 19)
        {
            x = 2;
            Track1 = new float[] {FiftyFreestyle, HundredFreestyle, oneFly};
        }
        else if (Age == 20 || Age == 21)
        {
            x = 0;
            Track1 = new float[] {FiftyFreestyle};
        }

    }

}
