package cn.edu.gdmec.android.sunset;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SunsetActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return SunsetFragment.newInstance ();
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sunset );
    }*/
}
