package com.example.user.myapplication.tasks;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.List;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * Created by user on 06.06.16.
 */
public class RxJavaTask2 {

    public static Observable<BigInteger> task2Observable (){



        return Observable.range(1, 100_000)
                .map(integer -> integer*2)
                .skip(40_000)
                .skipLast(40_000)
                .filter(integer -> integer %3 == 0 )
                .map(BigInteger::valueOf)
                .reduce(BigInteger::multiply)
                .cache();
                ;
    }
}


