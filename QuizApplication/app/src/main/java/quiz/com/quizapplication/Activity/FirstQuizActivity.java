package quiz.com.quizapplication.Activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.ToxicBakery.viewpager.transforms.CubeOutTransformer;

import quiz.com.quizapplication.Fragment.FifthQuizFragment;
import quiz.com.quizapplication.Fragment.FirstQuizFragment;
import quiz.com.quizapplication.Fragment.FourthQuizFragment;
import quiz.com.quizapplication.Fragment.SecondQuizFragment;
import quiz.com.quizapplication.Fragment.ThirdQuizFragment;
import quiz.com.quizapplication.R;

public class FirstQuizActivity extends AppCompatActivity {


    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_quiz);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setPageTransformer(true, new CubeOutTransformer());
        mPager.setAdapter(mPagerAdapter);

    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {

                case 0:
                    return new FirstQuizFragment();
                case 1: {
                    return new SecondQuizFragment();
                }
                case 2: {
                    return new ThirdQuizFragment();
                }
                case 3: {
                    return new FourthQuizFragment();
                }
                case 4: {
                    return new FifthQuizFragment();
                }
                default:
                    return new FirstQuizFragment();
            }        }

        @Override
        public int getCount() {
            return 5;
        }
    }
    }
