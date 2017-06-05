package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Thomas77843 on 5/19/2017.
 */
public class SithFragment extends Fragment {

    private static final String TAG = "tag";

    public Button mVader1;
    public Button mVader2;
    public Button mVader3;
    public Button mVader4;
    public Button mVader5;
    private MediaPlayer mpDV1;
    private MediaPlayer mpDV2;
    private MediaPlayer mpDV3;
    private MediaPlayer mpDV4;
    private MediaPlayer mpDV5;//end vader
    public Button mVaderObiWan;
    private MediaPlayer mpDVOW;
    //the emperor
    public Button mEmperor1;
    private MediaPlayer mpE1;
    public Button mEmperor2;
    private MediaPlayer mpE2;
    public Button mEmperor3;
    private MediaPlayer mpE3;
    public Button mEmperor4;
    private MediaPlayer mpE4;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sith, container, false);

        mVader1 = (Button) rootView.findViewById(R.id.vader1);
        mVader2 = (Button) rootView.findViewById(R.id.vader2);
        mVader3 = (Button) rootView.findViewById(R.id.vader3);
        mVader4 = (Button) rootView.findViewById(R.id.vader4);
        mVader5 = (Button) rootView.findViewById(R.id.vader5);
        mpDV1 = MediaPlayer.create(getActivity(), R.raw.darthvader_yourfather);
        mpDV2 = MediaPlayer.create(getActivity(), R.raw.darthvader_dontunderestimate);
        mpDV3 = MediaPlayer.create(getActivity(), R.raw.darthvader_failedme);
        mpDV4 = MediaPlayer.create(getActivity(), R.raw.dv_disturbg);
        mpDV5 = MediaPlayer.create(getActivity(), R.raw.dv_theme);//end vader
        mVaderObiWan = (Button) rootView.findViewById(R.id.vader_obi);
        mpDVOW = MediaPlayer.create(getActivity(), R.raw.dv_obi_circleiscomplete);
        // the emperor
        mEmperor1 = (Button) rootView.findViewById(R.id.emperor1);
        mpE1 = MediaPlayer.create(getActivity(), R.raw.e_expect2);
        mEmperor2 = (Button) rootView.findViewById(R.id.emperor2);
        mpE2 = MediaPlayer.create(getActivity(), R.raw.e_learndarkside);
        mEmperor3 = (Button) rootView.findViewById(R.id.emperor3);
        mpE3 = MediaPlayer.create(getActivity(), R.raw.e_nomercy);
        mEmperor4 = (Button) rootView.findViewById(R.id.emperor4);
        mpE4 = MediaPlayer.create(getActivity(), R.raw.e_willdie);

        //
        mVader1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDV1.seekTo(0);
                Log.e(TAG, "Sith 1 Clicked");
                mpDV1.start();
            }
        });


        mVader2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDV2.seekTo(0);
                Log.e(TAG, "Sith 2 Clicked");
                mpDV2.start();
            }
        });

        mVader3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDV3.seekTo(0);
                Log.e(TAG, "Sith 3 Clicked");
                mpDV3.start();
            }
        });

        mVader4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDV4.seekTo(0);
                Log.e(TAG, "Sith 4 Clicked");
                mpDV4.start();
            }
        });

        mVader5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDV5.seekTo(0);
                Log.e(TAG, "Sith 5 Clicked");
                mpDV5.start();
            }
        });
        //end vader
        mVaderObiWan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDVOW.seekTo(0);
                Log.e(TAG, "Sith 6 Clicked");
                mpDVOW.start();
            }
        });
        //start emperor
        mEmperor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpE1.seekTo(0);
                Log.e(TAG, "Sith 7 Clicked");
                mpE1.start();
            }
        });

        mEmperor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpE2.seekTo(0);
                Log.e(TAG, "Sith 8 Clicked");
                mpE2.start();
            }
        });

        mEmperor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpE3.seekTo(0);
                Log.e(TAG, "Sith 9 Clicked");
                mpE3.start();
            }
        });

        mEmperor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpE4.seekTo(0);
                Log.e(TAG, "Sith 10 Clicked");
                mpE4.start();
            }
        });


        return rootView;

    }
}