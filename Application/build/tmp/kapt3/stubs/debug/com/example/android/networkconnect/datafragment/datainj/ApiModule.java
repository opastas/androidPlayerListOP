package com.example.android.networkconnect.datafragment.datainj;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/android/networkconnect/datafragment/datainj/ApiModule;", "", "()V", "BASE_URL", "", "provideCharacterApi", "Lcom/example/android/networkconnect/datafragment/model/DataApi;", "provideCharacterList", "Ljava/util/ArrayList;", "Lcom/example/android/networkconnect/datafragment/model/Character;", "Lkotlin/collections/ArrayList;", "provideCharacterService", "Lcom/example/android/networkconnect/datafragment/model/DataService;", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "Application_debug"})
@dagger.Module()
public final class ApiModule {
    private final java.lang.String BASE_URL = "https://mach-eight.uc.r.appspot.com";
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.android.networkconnect.datafragment.model.DataApi provideCharacterApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.android.networkconnect.datafragment.model.DataService provideCharacterService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.util.ArrayList<com.example.android.networkconnect.datafragment.model.Character> provideCharacterList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable() {
        return null;
    }
    
    public ApiModule() {
        super();
    }
}