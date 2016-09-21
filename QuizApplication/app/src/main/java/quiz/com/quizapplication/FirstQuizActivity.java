package quiz.com.quizapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import quiz.com.quizapplication.BaseUserInterface.BaseActivity;

public class FirstQuizActivity extends BaseActivity {

    @Override
    protected Fragment createFragment() {
        return new FirstQuizFragment();
    }
}
