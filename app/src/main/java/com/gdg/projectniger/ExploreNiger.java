package com.gdg.projectniger;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.gesture.GestureOverlayView;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreNiger extends Fragment {
    View rootView;

    public ExploreNiger() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_exploreniger, container, false);
        ImageButton share = (ImageButton) rootView.findViewById(R.id.share_button);
        ImageButton share1 = (ImageButton) rootView.findViewById(R.id.share_button1);
        ImageButton share2 = (ImageButton) rootView.findViewById(R.id.share_button2);
        ImageButton share3 = (ImageButton) rootView.findViewById(R.id.share_button3);
        ImageButton share4 = (ImageButton) rootView.findViewById(R.id.share_button4);
        ImageButton share5 = (ImageButton) rootView.findViewById(R.id.share_button5);
        ImageButton share6 = (ImageButton) rootView.findViewById(R.id.share_button6);

        ImageButton map = (ImageButton) rootView.findViewById(R.id.map_button);
        ImageButton map1 = (ImageButton) rootView.findViewById(R.id.map_button1);
        ImageButton map2 = (ImageButton) rootView.findViewById(R.id.map_button2);
        ImageButton map3 = (ImageButton) rootView.findViewById(R.id.map_button3);
        ImageButton map4 = (ImageButton) rootView.findViewById(R.id.map_button4);
        ImageButton map5 = (ImageButton) rootView.findViewById(R.id.map_button5);
        ImageButton map6 = (ImageButton) rootView.findViewById(R.id.map_button6);

        ImageButton Favourite = (ImageButton) rootView.findViewById(R.id.save_button);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Zuma Rock");
                share.putExtra(Intent.EXTRA_TEXT, "Zuma Rock is located at Suleja Try and  Visit it");
                startActivity(share);
            }
        });

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Zuma Rock");
                share.putExtra(Intent.EXTRA_TEXT, "Zuma Rock is located at Suleja Try and  Visit it");
                startActivity(share);
            }
        });

        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Zuma Rock");
                share.putExtra(Intent.EXTRA_TEXT, "Zuma Rock is located at Suleja Try and  Visit it");
                startActivity(share);
            }
        });

        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Zuma Rock");
                share.putExtra(Intent.EXTRA_TEXT, "Zuma Rock is located at Suleja Try and  Visit it");
                startActivity(share);
            }
        });

        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Zuma Rock");
                share.putExtra(Intent.EXTRA_TEXT, "Zuma Rock is located at Suleja Try and  Visit it");
                startActivity(share);
            }
        });

        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Zuma Rock");
                share.putExtra(Intent.EXTRA_TEXT, "Zuma Rock is located at Suleja Try and  Visit it");
                startActivity(share);
            }
        });

        share6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Zuma Rock");
                share.putExtra(Intent.EXTRA_TEXT, "Zuma Rock is located at Suleja Try and  Visit it");
                startActivity(share);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.8275000, -122.554444"));
                I.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(I);
            }
        });

        map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.8275000, -122.554444"));
                I.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(I);
            }
        });

        map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.8275000, -122.554444"));
                I.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(I);
            }
        });

        map3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.8275000, -122.554444"));
                I.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(I);
            }
        });

        map4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.8275000, -122.554444"));
                I.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(I);
            }
        });

        map5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.8275000, -122.554444"));
                I.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(I);
            }
        });

        map6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.8275000, -122.554444"));
                I.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(I);
            }
        });

        return rootView;
    }

}
