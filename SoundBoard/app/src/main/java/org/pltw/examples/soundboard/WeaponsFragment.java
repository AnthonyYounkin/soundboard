package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by jacob55052 on 5/19/2017.
 */
public class WeaponsFragment extends Fragment {

    public static final String TAG = WeaponsFragment.class.getName();

    public Button mWeapons1;
    public Button mWeapons2;
    public Button mWeapons3;
    public Button mWeapons4;
    public Button mWeapons5;
    public Button mWeapons6;
    public Button mWeapons7;
    public Button mWeapons8;
    public Button mWeapons9;
    public Button mWeapons10;
    public Button mWeapons11;
    public Button mWeapons12;
    public Button mWeapons13;
    public Button mWeapons14;
    public Button mWeapons15;

    private MediaPlayer mpW1;
    private MediaPlayer mpW2;
    private MediaPlayer mpW3;
    private MediaPlayer mpW4;
    private MediaPlayer mpW5;
    private MediaPlayer mpW6;
    private MediaPlayer mpW7;
    private MediaPlayer mpW8;
    private MediaPlayer mpW9;
    private MediaPlayer mpW10;
    private MediaPlayer mpW11;
    private MediaPlayer mpW12;
    private MediaPlayer mpW13;
    private MediaPlayer mpW14;
    private MediaPlayer mpW15;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_weapons, container, false);

        mWeapons1 = (Button) rootView.findViewById(R.id.Weapons1);
        mWeapons2 = (Button) rootView.findViewById(R.id.Weapons2);
        mWeapons3 = (Button) rootView.findViewById(R.id.Weapons3);
        mWeapons4 = (Button) rootView.findViewById(R.id.Weapons4);
        mWeapons5 = (Button) rootView.findViewById(R.id.Weapons5);
        mWeapons6 = (Button) rootView.findViewById(R.id.Weapons6);
        mWeapons7 = (Button) rootView.findViewById(R.id.Weapons7);
        mWeapons8 = (Button) rootView.findViewById(R.id.Weapons8);
        mWeapons9 = (Button) rootView.findViewById(R.id.Weapons9);
        mWeapons10 = (Button) rootView.findViewById(R.id.Weapons10);
        mWeapons11 = (Button) rootView.findViewById(R.id.Weapons11);
        mWeapons12 = (Button) rootView.findViewById(R.id.Weapons12);
        mWeapons13 = (Button) rootView.findViewById(R.id.Weapons13);
        mWeapons14 = (Button) rootView.findViewById(R.id.Weapons14);
        mWeapons15 = (Button) rootView.findViewById(R.id.Weapons15);

        mpW1 = MediaPlayer.create(getActivity(), (R.raw.aat_gun));
        mpW2 = MediaPlayer.create(getActivity(), (R.raw.atat_sideguns));
        mpW3 = MediaPlayer.create(getActivity(), (R.raw.atst_chinguns));
        mpW4 = MediaPlayer.create(getActivity(), (R.raw.dstar_super1));
        mpW5 = MediaPlayer.create(getActivity(), (R.raw.falcon_guns));
        mpW6 = MediaPlayer.create(getActivity(), (R.raw.isd_laser2));
        mpW7 = MediaPlayer.create(getActivity(), (R.raw.lightsaber_01));
        mpW8 = MediaPlayer.create(getActivity(), (R.raw.lightsaber_04));
        mpW9 = MediaPlayer.create(getActivity(), (R.raw.naboo_torp));
        mpW10 = MediaPlayer.create(getActivity(), (R.raw.probe_gun));
        mpW11 = MediaPlayer.create(getActivity(), (R.raw.slave1_guns));
        mpW12 = MediaPlayer.create(getActivity(), (R.raw.slave1_seismic));
        mpW13 = MediaPlayer.create(getActivity(), (R.raw.tie_fire));
        mpW14 = MediaPlayer.create(getActivity(), (R.raw.xwing_laser));
        mpW15 = MediaPlayer.create(getActivity(), (R.raw.xwing_proton));

        mWeapons1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW1.seekTo(0);
                Log.e(TAG, "Weapons 1 Clicked");
                mpW1.start();
            }
        });

        mWeapons2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW2.seekTo(0);
                Log.e(TAG, "Weapons 2 Clicked");
                mpW2.start();
            }
        });

        mWeapons3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW3.seekTo(0);
                Log.e(TAG, "Weapons 3 Clicked");
                mpW3.start();
            }
        });

        mWeapons4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW4.seekTo(0);
                Log.e(TAG, "Weapons 4 Clicked");
                mpW4.start();
            }
        });

        mWeapons5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW5.seekTo(0);
                Log.e(TAG, "Weapons 5 Clicked");
                mpW5.start();
            }
        });

        mWeapons6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW6.seekTo(0);
                Log.e(TAG, "Weapons 6 Clicked");
                mpW6.start();
            }
        });

        mWeapons7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW7.seekTo(0);
                Log.e(TAG, "Weapons 7 Clicked");
                mpW7.start();
            }
        });

        mWeapons8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW8.seekTo(0);
                Log.e(TAG, "Weapons 8 Clicked");
                mpW8.start();
            }
        });

        mWeapons9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW9.seekTo(0);
                Log.e(TAG, "Weapons 9 Clicked");
                mpW9.start();
            }
        });

        mWeapons10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW10.seekTo(0);
                Log.e(TAG, "Weapons 10 Clicked");
                mpW10.start();
            }
        });

        mWeapons11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW11.seekTo(0);
                Log.e(TAG, "Weapons 11 Clicked");
                mpW11.start();
            }
        });

        mWeapons12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW12.seekTo(0);
                Log.e(TAG, "Weapons 12 Clicked");
                mpW12.start();
            }
        });

        mWeapons13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW13.seekTo(0);
                Log.e(TAG, "Weapons 13 Clicked");
                mpW13.start();
            }
        });

        mWeapons14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW14.seekTo(0);
                Log.e(TAG, "Weapons 14 Clicked");
                mpW14.start();
            }
        });

        mWeapons15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpW15.seekTo(0);
                Log.e(TAG, "Weapons 15 Clicked");
                mpW15.start();
            }
        });
     return rootView;
    }
}