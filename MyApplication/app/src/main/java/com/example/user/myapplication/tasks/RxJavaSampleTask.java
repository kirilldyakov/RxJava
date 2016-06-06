package com.example.user.myapplication.tasks;

import android.support.annotation.NonNull;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by user on 06.06.16.
 */
public class RxJavaSampleTask {
    @NonNull
    public static Observable<Boolean> isLollipopOrHigher(int version) {
        return Observable.just(version >= 21);
    }
}


//https://habrahabr.ru/company/e-Legion/blog/272459/
// 32:59