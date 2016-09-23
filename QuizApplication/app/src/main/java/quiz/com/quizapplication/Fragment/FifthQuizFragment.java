package quiz.com.quizapplication.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import quiz.com.quizapplication.Activity.ResultActivity;
import quiz.com.quizapplication.R;


public class FifthQuizFragment extends Fragment {
    @Bind(R.id.ans)
    RadioGroup mAnswerGroup;
    @Bind(R.id.ans1)
    RadioButton mFirstAnswer;
    @Bind(R.id.ans2)
    RadioButton mAnswer2;
    @Bind(R.id.ans3)
    RadioButton mAnswer3;
    @Bind(R.id.ans4)
    RadioButton mAnswer4;
    @Bind(R.id.finish)
    Button mFinish;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fifth_quiz, container, false);
        ButterKnife.bind(this,rootView);
        mAnswerGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if ((checkedId == R.id.ans1)){
                    mFinish.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), ResultActivity.class);
                            startActivity(intent);
                            FirstQuizFragment.mCount++;
                        }
                    });
                }
                /*else {
                    mFinish.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getContext(),"Please select the correct answer",Toast.LENGTH_LONG).show();
                        }
                    });
                }*/
            }
        });
        return rootView;
    }
}
