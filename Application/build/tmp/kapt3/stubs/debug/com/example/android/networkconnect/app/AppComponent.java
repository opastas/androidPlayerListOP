package com.example.android.networkconnect.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/android/networkconnect/app/AppComponent;", "", "inject", "", "app", "Landroid/app/Application;", "activity", "Lcom/example/android/networkconnect/StatusActivity;", "Application_debug"})
@dagger.Component(modules = {com.example.android.networkconnect.datafragment.datainj.ApiModule.class, com.example.android.networkconnect.app.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    android.app.Application app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.StatusActivity activity);
}