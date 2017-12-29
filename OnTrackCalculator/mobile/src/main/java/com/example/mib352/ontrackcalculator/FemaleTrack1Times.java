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
    double FiftyFreestyle;
    double HundredFreestyle;
    double TwoFreestyle;
    double FourFreestyle;
    double EightFreestyle;
    double Mile;
    double HundredBack;
    double TwoBack;
    double oneBreast;
    double twoBreast;
    double oneFly;
    double twoFly;
    double TwoMedley;
    double FourMedley;
    double Track1[];
    public void FemaleTrack1Times()
    {
        female = true;
        male = false;
        if (Age == 13)
        {
            x = 3;
            Track1 = new double[] {EightFreestyle, Mile, TwoBack, FourMedley};
            EightFreestyle = 547.18;
            Mile = 1079.24;
            TwoBack = 260.75;
            FourMedley = 298.15;
        }
        else if (Age == 14)
        {
            x = 10;
            Track1 = new double[] {TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack, TwoBack, oneBreast, twoBreast,
                                twoFly, TwoMedley, FourMedley};
            TwoFreestyle = 124.86;
            FourFreestyle = 261.51;
            EightFreestyle = 536.28;
            Mile = 1050.49;
            HundredBack = 64.46;
            TwoBack = 137.55;
            oneBreast = 71.35;
            twoBreast = 175.28;
            twoFly = 137.55;
            TwoMedley = 140.78;
            FourMedley = 292.16;
        }
        else if (Age == 15 || Age == 16 )
        {
            x = 12;
            Track1 = new double[] {HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack, TwoBack,
                                oneBreast, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
            if (Age == 15)
            {
                HundredFreestyle = 57.18;
                TwoFreestyle = 122.61;
                FourFreestyle = 257.31;
                EightFreestyle = 527.15;
                Mile = 1036.55;
                HundredBack = 63.36;
                TwoBack = 134.83;
                oneBreast = 70.10;
                twoBreast = 152.62;
                oneFly = 61.32;
                twoFly = 134.96;
                TwoMedley = 138.31;
                FourMedley = 286.98;
            }
            else
            {
                HundredFreestyle = 56.34;
                TwoFreestyle = 120.69;
                FourFreestyle = 253.75;
                EightFreestyle = 519.15;
                Mile = 1017.14;
                HundredBack = 62.41;
                TwoBack = 132.56;
                oneBreast = 69.00;
                twoBreast = 150.29;
                oneFly = 60.31;
                twoFly = 132.64;
                TwoMedley = 136.21;
                FourMedley = 282.59;
            }
        }
        else if (Age == 17)
        {
            x = 13;
            Track1 = new double[] {FiftyFreestyle, HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack, TwoBack,
                    oneBreast, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
            FiftyFreestyle = 25.69;
            HundredFreestyle = 55.62;
            TwoFreestyle = 119.07;
            FourFreestyle = 250.76;
            EightFreestyle = 513.73;
            Mile = 1002.04;
            HundredBack = 61.59;
            TwoBack = 130.68;
            oneBreast = 68.04;
            twoBreast = 148.29;
            oneFly = 59.46;
            twoFly = 130.73;
            TwoMedley = 134.45;
            FourMedley = 278.91;
        }
        else if  (Age == 18)
        {
            x = 9;
            Track1 = new double[] {FiftyFreestyle, HundredFreestyle, TwoFreestyle, FourFreestyle, HundredBack, oneBreast, twoBreast,
                                oneFly, twoFly, TwoMedley};
            FiftyFreestyle = 25.43;
            HundredFreestyle = 55.01;
            TwoFreestyle = 117.74;
            FourFreestyle = 248.34;
            HundredBack = 60.89;
            oneBreast = 67.22;
            twoBreast = 146.58;
            oneFly = 58.74;
            twoFly = 129.21;
            TwoMedley = 133.01;
        }
        else if (Age == 19)
        {
            x = 2;
            Track1 = new double[] {FiftyFreestyle, HundredFreestyle, oneFly};
            FiftyFreestyle = 25.20;
            HundredFreestyle = 54.50;
            oneFly = 58.15;
        }
        else if (Age == 20 || Age == 21)
        {
            x = 0;
            Track1 = new double[] {FiftyFreestyle};
            if (Age == 20)
            {
                FiftyFreestyle = 25.00;
            }
            else
            {
                FiftyFreestyle = 24.82;
            }
        }
    }
}
