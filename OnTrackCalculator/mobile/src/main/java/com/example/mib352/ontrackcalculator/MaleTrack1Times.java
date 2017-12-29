


package com.example.mib352.ontrackcalculator;

/**
 * Created by mib352 on 2017-12-28.
 */
import android.app.Activity;


public class MaleTrack1Times extends Activity {
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


    public void MaleTrack1Times()
    {

        if (Age == 15)
        {
            x = 6;
            Track1 = new double[]{TwoFreestyle, FourFreestyle, EightFreestyle, Mile, TwoBack, twoBreast, FourMedley};
            TwoFreestyle = 113.74;
            FourFreestyle = 242.71;
            EightFreestyle = 500.80;
            Mile = 2768.22;
            TwoBack = 125.27;
            twoBreast = 143.80;
            FourMedley = 278.64;
        }
        else if (Age == 16)
        {
            x =  11;
            Track1 = new double[]{HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack,
                    TwoBack, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
            HundredFreestyle = 51.72;
            TwoFreestyle = 111.68;
            FourFreestyle = 237.78;
            EightFreestyle = 491.33;
            Mile = 2746.64;
            HundredBack = 57.59;
            TwoBack = 122.84;
            twoBreast = 139.78;
            oneFly = 56.19;
            twoFly = 125.10;
            TwoMedley = 126.77;
            FourMedley = 271.64;
        }
        else if (Age == 17)
        {
            x = 12;
            Track1 = new double[]{HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack,
                    TwoBack, oneBreast, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
            HundredFreestyle = 50.74;
            TwoFreestyle = 109.90;
            FourFreestyle = 233.62;
            EightFreestyle = 483.97;
            Mile = 2728.56;
            HundredBack = 56.44;
            TwoBack = 120.76;
            oneBreast = 64.38;
            twoBreast = 136.39;
            oneFly = 54.87;
            twoFly = 122.17;
            TwoMedley = 124.47;
            FourMedley = 265.91;
        }
        else if (Age == 18 && Age == 19)
        {
            x = 13;
            Track1 = new double[]{FiftyFreestyle, HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack,
                    TwoBack, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
            if (Age == 18)
            {
                FiftyFreestyle = 23.18;
                HundredFreestyle = 49.89;
                TwoFreestyle = 108.40;
                FourFreestyle = 230.20;
                EightFreestyle = 478.31;
                Mile = 2713.79;
                HundredBack = 55.46;
                TwoBack = 119.01;
                oneBreast = 63.02;
                twoBreast = 133.57;
                oneFly = 53.75;
                twoFly = 119.84;
                TwoMedley = 122.56;
                FourMedley = 261.36;
            }
            else
            {
                FiftyFreestyle = 22.84;
                HundredFreestyle = 49.17;
                TwoFreestyle = 107.15;
                FourFreestyle = 227.43;
                EightFreestyle = 474.31;
                Mile = 2701.97;
                HundredBack = 54.65;
                TwoBack = 117.58;
                oneBreast = 61.90;
                twoBreast = 131.26;
                oneFly = 52.83;
                twoFly = 118.04;
                TwoMedley = 121.00;
                FourMedley = 257.88;
            }
        }
        else if (Age == 20)
        {
            x = 6;
            Track1 = new double[]{FiftyFreestyle, HundredFreestyle, HundredBack, oneBreast, oneFly, twoFly, TwoMedley};
            FiftyFreestyle = 22.55;
            HundredFreestyle = 48.58;
            HundredBack = 53.99;
            oneBreast = 60.98;
            oneFly = 52.08;
            twoFly = 116.72;
            TwoMedley = 119.77;
        }
        else if (Age == 21)
        {
            x = 1;
            Track1 = new double[]{FiftyFreestyle, oneBreast};
            FiftyFreestyle = 22.30;
            oneBreast = 60.26;
        }
        else if (Age == 22)
        {
            x = 0;
            Track1 = new double[]{FiftyFreestyle};
            FiftyFreestyle = 22.10;
        }

    }
}


