package quiz.com.quizapplication.Activity;

import android.support.v4.app.Fragment;

import quiz.com.quizapplication.BaseUserInterface.BaseActivity;
import quiz.com.quizapplication.Fragment.FirstQuizFragment;

public class FirstQuizActivity extends BaseActivity {

    @Override
    protected Fragment createFragment() {
        return new FirstQuizFragment();
    }
}
