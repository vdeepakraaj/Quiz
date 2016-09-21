package quiz.com.quizapplication.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import quiz.com.quizapplication.R;


public class FirstQuizFragment extends Fragment {
    private static int mCount = 0;
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
    @Bind(R.id.submit)
    TextView mSubmit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_first_quiz, container, false);
        ButterKnife.bind(this,rootView);
        mAnswerGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mSubmit.setVisibility(View.VISIBLE);
                if ((checkedId == R.id.ans1)){
                    Toast.makeText(getContext(),"You are a fucker",Toast.LENGTH_LONG).show();
                    mCount=mCount+1;

                }
            }
        });
        return rootView;
    }
}
