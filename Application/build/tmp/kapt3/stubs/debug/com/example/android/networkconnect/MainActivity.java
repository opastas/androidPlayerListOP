package com.example.android.networkconnect;

import java.lang.System;

/**
 * Sample Activity demonstrating how to connect to the network and fetch raw
 * HTML. It uses a Fragment that encapsulates the network operations on an AsyncTask.
 *
 * This sample uses a TextView to display output.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0006\u0010\u0012\u001a\u00020\u000bJ\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/networkconnect/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/android/networkconnect/ActivityNavigation;", "()V", "viewModel", "Lcom/example/android/networkconnect/datafragment/viewmodel/ListViewModel;", "getViewModel", "()Lcom/example/android/networkconnect/datafragment/viewmodel/ListViewModel;", "setViewModel", "(Lcom/example/android/networkconnect/datafragment/viewmodel/ListViewModel;)V", "displayMessage", "", "findOrCreateItemViewFragment", "Lcom/example/android/networkconnect/itemdetail_ui/ItemDetailFragment;", "findOrCreateViewFragment", "Lcom/example/android/networkconnect/datafragment/DataFragment;", "findOrCreateViewModel", "navigateToFragment", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSupportNavigateUp", "", "Companion", "Application_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.android.networkconnect.ActivityNavigation {
    @org.jetbrains.annotations.NotNull()
    public com.example.android.networkconnect.datafragment.viewmodel.ListViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TASKS_VIEWMODEL_TAG = "TASKS_VIEWMODEL_TAG";
    public static final com.example.android.networkconnect.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.networkconnect.datafragment.viewmodel.ListViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.datafragment.viewmodel.ListViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void observeViewModel() {
    }
    
    private final void displayMessage() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final com.example.android.networkconnect.datafragment.viewmodel.ListViewModel findOrCreateViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void navigateToFragment() {
    }
    
    private final com.example.android.networkconnect.itemdetail_ui.ItemDetailFragment findOrCreateItemViewFragment() {
        return null;
    }
    
    private final com.example.android.networkconnect.datafragment.DataFragment findOrCreateViewFragment() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/networkconnect/MainActivity$Companion;", "", "()V", "TASKS_VIEWMODEL_TAG", "", "Application_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}