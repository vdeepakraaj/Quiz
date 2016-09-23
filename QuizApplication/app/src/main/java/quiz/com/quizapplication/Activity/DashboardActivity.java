package quiz.com.quizapplication.Activity;

import android.os.Bundle;

import quiz.com.quizapplication.BaseUserInterface.BaseActivity;

/**
 * Created by Deepak on 23-09-2016.
 */

public class DashboardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return new android.support.v4.app.Fragment();
    }
}
