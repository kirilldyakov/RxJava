package com.example.user.myapplication.tasks;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import rx.Observable;
import rx.functions.Func1;

import java.util.Observer;


/**
 * Created by user on 06.06.16.
 */
public class RxJavaTask1 {

    public static Observable<Integer> task1Observable (@NotNull List<String> list){



        return Observable.from(list)
                .filter(new Func1<String, Boolean>() {
                    @Override
                    public Boolean call(String s) {
                        return s.contains("r")||s.contains("R");
                    }
                })
                .map(new Func1<String, Integer>() {
                    @Override
                    public Integer call(String s) {
                        return s.length();
                    }
                });
    }

}
