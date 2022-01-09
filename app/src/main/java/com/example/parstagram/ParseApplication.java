package com.example.parstagram;

import android.app.Application;
import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GNZE4DlkWdWSWtIIRDwR6lhKjyxYTg0O8JDJqunq")
                .clientKey("qa5seoGJYlRdVF6o9YaLJgSuxx3Rh0e8Pj2j1fnb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
