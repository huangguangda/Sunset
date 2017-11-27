package cn.edu.gdmec.android.sunset;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;

/**
 * Created by Jack on 2017/11/27.
 */

public class SunsetFragment extends Fragment{
    private View mSceneView;
    private View mSunView;
    private View mSkyView;

    public static SunsetFragment newInstance(){
        return new SunsetFragment ();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate ( R.layout.fragment_sunset, container, false );

        mSceneView = view;
        mSunView = view.findViewById ( R.id.sum );
        mSkyView = view.findViewById ( R.id.sky );

        mSceneView.setOnClickListener ( new View.OnClickListener (){
            @Override
            public void onClick(View v){
                startAnimation ();
            }
        } );
        return view;
    }

    private void startAnimation(){
        float sunYStart = mSunView.getTop ();
        float sumYEnd = mSkyView.getHeight ();

        ObjectAnimator heightAnimator = ObjectAnimator
                .ofFloat ( mSunView, "y", sunYStart, sumYEnd )
                .setDuration(3000);
        //添加特效
        heightAnimator.setInterpolator ( new AccelerateInterpolator (  ) );
        heightAnimator.start ();
    }
}
