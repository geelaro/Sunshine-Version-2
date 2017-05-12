package com.geelaro.android.sunshine.main.presenter;

import com.geelaro.android.sunshine.app.R;
import com.geelaro.android.sunshine.main.view.MainView;

/**
 * Created by geelaro on 2017/5/11.
 */

public class MainPresenterImpl implements MainPresenter {
    private MainView mMainView;

    public MainPresenterImpl(MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void switchNavigation(int id) {
        switch (id) {
            case R.id.navigation_item_weather:
                mMainView.switch2Weather();
                break;
            case R.id.navigation_item_news:
                mMainView.switch2News();
                break;
            case R.id.navigation_item_images:
                mMainView.switch2Images();
                break;
            case R.id.navigation_item_about:
                mMainView.switch2About();
                break;
            default:
                mMainView.switch2Weather();
        }
    }
}
