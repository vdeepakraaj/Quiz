package quiz.com.quizapplication.Fragment;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import quiz.com.quizapplication.Activity.FirstQuizActivity;
import quiz.com.quizapplication.Activity.VideoActivity;
import quiz.com.quizapplication.R;

/**
 * Created by Deepak on 23-09-2016.
 */

public class DashboardFragment extends Fragment implements View.OnClickListener{
    private MediaPlayer mp;
    @Bind(R.id.products_layout)
    LinearLayout mProductList;
    @Bind(R.id.recycle_bin_layout)
    LinearLayout mRecycleBin;
    @Bind(R.id.reuse_layout)
    LinearLayout mReuse;

    @Bind(R.id.click_here)
    LinearLayout mClickHere;

    public DashboardFragment() {
    }



    /****************************************************/
    // Abstract Method Implementation

    /****************************************************/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mp = MediaPlayer.create(getActivity(), R.raw.song);
        mp.start();
        View rootView = inflater.inflate(R.layout.dashboard, container, false);
        ButterKnife.bind(this, rootView);
        this.mProductList.setOnClickListener(this);
        this.mRecycleBin.setOnClickListener(this);
        this.mReuse.setOnClickListener(this);
        this.mClickHere.setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.products_layout:
                Intent intent_products = new Intent(getActivity(), FirstQuizActivity.class);
                startActivity(intent_products);
                getActivity().overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                if (mp.isPlaying()) {

                    mp.stop();
                }
                break;
            case R.id.recycle_bin_layout:
                Bundle extras = getActivity().getIntent().getExtras();
                if (extras != null) {
                String count = extras.getString("COUNT");
                Log.v("rec",count);
                if(Integer.parseInt(count)==5) {
                    Intent intent_recycle = new Intent(getActivity(), VideoActivity.class);
                    startActivity(intent_recycle);
                    getActivity().overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    if (mp.isPlaying()) {

                        mp.stop();
                    }
                }
                }
                else{
                    Toast.makeText(getActivity(),"Please proceed with questions before you click this",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
