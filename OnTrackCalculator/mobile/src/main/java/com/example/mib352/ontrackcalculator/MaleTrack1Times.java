


package com.example.mib352.ontrackcalculator;

/**
 * Created by mib352 on 2017-12-28.
 */
import android.app.Activity;

public class MaleTrack1Times extends Activity {
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


    public void MaleTrack1Times()
    {

        if (Age == 15) {
            x = 6;
            Track1 = new float[]{TwoFreestyle, FourFreestyle, EightFreestyle, Mile, TwoBack, twoBreast, FourMedley};
        }
        else if (Age == 16)
        {
            x =  11;
            Track1 = new float[]{HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack,
                    TwoBack, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
        }
        else if (Age == 17)
        {
            x = 12;
            Track1 = new float[]{HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack,
                    TwoBack, oneBreast, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
        }
        else if (Age == 18)
        {
            x = 13;
            Track1 = new float[]{FiftyFreestyle, HundredFreestyle, TwoFreestyle, FourFreestyle, EightFreestyle, Mile, HundredBack,
                    TwoBack, twoBreast, oneFly, twoFly, TwoMedley, FourMedley};
        }


    }


}


