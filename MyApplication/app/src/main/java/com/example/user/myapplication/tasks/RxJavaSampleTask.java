package com.example.user.myapplication.tasks;

import android.support.annotation.NonNull;

import android.database.Observable;

/**
 * Created by user on 06.06.16.
 */
public class RxJavaSampleTask {
    @NonNull
    public static Observable<Boolean> isLollipopOrHigher(int version) {
        return Observable.just(version >= 21);
    }
}
