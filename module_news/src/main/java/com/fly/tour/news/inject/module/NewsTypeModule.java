package com.fly.tour.news.inject.module;

import android.content.Context;

import com.fly.tour.news.contract.NewsDetailContract;
import com.fly.tour.news.contract.NewsTypeContract;

import dagger.Module;
import dagger.Provides;

/**
 * Description: <NewsDetailModule><br>
 * Author:      mxdl<br>
 * Date:        2019/5/31<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
@Module
public class NewsTypeModule {
    private NewsTypeContract.View mView;
    public NewsTypeModule(NewsTypeContract.View view) {
        this.mView = view;
    }
    @Provides
    public Context providerContext(){
        return mView.getContext();
    }
    @Provides
    public NewsTypeContract.View providerNewsTypeView(){
        return mView;
    }

}
