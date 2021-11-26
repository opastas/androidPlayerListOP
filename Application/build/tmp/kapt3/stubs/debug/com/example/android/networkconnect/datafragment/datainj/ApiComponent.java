package com.example.android.networkconnect.datafragment.datainj;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/networkconnect/datafragment/datainj/ApiComponent;", "", "inject", "", "activity", "Lcom/example/android/networkconnect/MainActivity;", "Lcom/example/android/networkconnect/StatusActivity;", "service", "Lcom/example/android/networkconnect/datafragment/model/DataService;", "viewModel", "Lcom/example/android/networkconnect/datafragment/viewmodel/ListViewModel;", "Application_debug"})
@dagger.Component(modules = {com.example.android.networkconnect.datafragment.datainj.ApiModule.class, com.example.android.networkconnect.app.AppModule.class})
public abstract interface ApiComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.datafragment.model.DataService service);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.datafragment.viewmodel.ListViewModel viewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.StatusActivity activity);
}