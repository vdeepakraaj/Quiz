package quiz.com.quizapplication.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import quiz.com.quizapplication.Activity.FirstQuizActivity;
import quiz.com.quizapplication.Activity.LoginActivity;
import quiz.com.quizapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {
    @Bind(R.id.result)
    TextView mSubmit;
    @Bind(R.id.scoreButton)
    Button mScoreButton;

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_result, container, false);
        ButterKnife.bind(this,rootView);
        mSubmit.setText(String.valueOf(FirstQuizFragment.mCount));
        mScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(FirstQuizFragment.mCount<5){
                    Intent intent = new Intent(getActivity(), FirstQuizActivity.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                }
            }
        });

        return rootView;
    }
}
