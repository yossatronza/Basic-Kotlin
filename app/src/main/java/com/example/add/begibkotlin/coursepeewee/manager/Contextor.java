package com.example.add.begibkotlin.coursepeewee.manager;

import android.content.Context;

/**
 * Created by add on 31/8/2560.
 */

public class Contextor {
    private static Contextor contextor;

    public static Contextor getInstance() {
        if (contextor == null)
            contextor = new Contextor();

        return contextor;
    }

    public Contextor() {
    }

    private Context mContext;

    public void init(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return mContext;
    }
}
