package ir.tjyar.android.viewmodel;

import android.content.Context;

import androidx.databinding.BaseObservable;

import ir.tjyar.android.MainActivity;

public class MainViewModel extends BaseObservable {

    private Context context;
    private MainActivity.MainActivityHandler handler;

    public MainViewModel(Context context) {
        this.context = context;
    }

    public MainActivity.MainActivityHandler getHandler() {
        return handler;
    }

    public void setHandler(MainActivity.MainActivityHandler handler) {
        this.handler = handler;
    }
}
