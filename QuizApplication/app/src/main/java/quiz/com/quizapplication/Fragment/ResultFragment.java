package quiz.com.quizapplication.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import quiz.com.quizapplication.Activity.DashboardActivity;
import quiz.com.quizapplication.Activity.FirstQuizActivity;
import quiz.com.quizapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {
    @Bind(R.id.result)
    EditText mSubmit;
    @Bind(R.id.scoreButton)
    Button mScoreButtonBelow;
    @Bind(R.id.scoreButton1)
    Button mScoreButtonEqual;
    private int count;

    public ResultFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_result, container, false);
        ButterKnife.bind(this,rootView);
        count = 0;

        if(FirstQuizFragment.first){
            count = count+1;
        } if(SecondQuizFragment.second){
            count = count+1;
        } if(ThirdQuizFragment.third){
            count = count+1;
        } if(FourthQuizFragment.fourth){
            count = count+1;
        } if(FifthQuizFragment.fifth){
            count = count+1;
        }
        mScoreButtonBelow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 5) {
                    count = 0;
                    mSubmit.getText().clear();
                    Log.v("count", String.valueOf(count));
                    Intent intent = new Intent(getActivity(), FirstQuizActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                }
            }
                });

                mScoreButtonEqual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (count == 5) {
                            Intent intent = new Intent(getActivity(), DashboardActivity.class);
                            intent.putExtra("COUNT", String.valueOf(count));
                            startActivity(intent);
                            count =0;
                            mSubmit.getText().clear();
                            getActivity().finish();
                        }
                    }
                });
        mSubmit.setText(String.valueOf(count));

        return rootView;
            }

    @Override
    public void onResume() {
        super.onResume();
    }
}


