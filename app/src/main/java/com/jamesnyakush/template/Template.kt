package com.jamesnyakush.template

import android.app.Application
import androidx.annotation.Nullable
import org.jetbrains.annotations.NotNull
import timber.log.Timber

class Template : Application() {

    override fun onCreate() {
        super.onCreate()

        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(object : Timber.DebugTree() {
                @Nullable
                override fun createStackElementTag(@NotNull element: StackTraceElement): String? {
                    return super.createStackElementTag(element) + ":" + element.lineNumber
                }
            })
        } else {
            //Timber.plant(CrashlyticsTree())
        }
    }
}