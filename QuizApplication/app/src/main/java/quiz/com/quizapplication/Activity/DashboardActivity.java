package quiz.com.quizapplication.Activity;

import android.support.v4.app.Fragment;

import quiz.com.quizapplication.BaseUserInterface.BaseActivity;
import quiz.com.quizapplication.Fragment.DashboardFragment;

/**
 * Created by Deepak on 23-09-2016.
 */

public class DashboardActivity extends BaseActivity {



    @Override
    protected Fragment createFragment() {
        return new DashboardFragment();
    }

}
