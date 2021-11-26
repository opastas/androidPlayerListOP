package com.example.android.networkconnect.datafragment.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/android/networkconnect/datafragment/adapter/CharacterListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/android/networkconnect/datafragment/adapter/CharacterListAdapter$CharacterViewHolder;", "characters", "Ljava/util/ArrayList;", "Lcom/example/android/networkconnect/datafragment/model/Character;", "Lkotlin/collections/ArrayList;", "mNavigation", "Lcom/example/android/networkconnect/datafragment/viewmodel/ItemClickNavigation;", "(Ljava/util/ArrayList;Lcom/example/android/networkconnect/datafragment/viewmodel/ItemClickNavigation;)V", "getCharacters", "()Ljava/util/ArrayList;", "setCharacters", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "updateCharacters", "newCharacters", "", "CharacterViewHolder", "Application_debug"})
public final class CharacterListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.android.networkconnect.datafragment.adapter.CharacterListAdapter.CharacterViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.android.networkconnect.datafragment.model.Character> characters;
    private final com.example.android.networkconnect.datafragment.viewmodel.ItemClickNavigation mNavigation = null;
    
    public final void updateCharacters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.networkconnect.datafragment.model.Character> newCharacters) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.android.networkconnect.datafragment.adapter.CharacterListAdapter.CharacterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.datafragment.adapter.CharacterListAdapter.CharacterViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.android.networkconnect.datafragment.model.Character> getCharacters() {
        return null;
    }
    
    public final void setCharacters(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.android.networkconnect.datafragment.model.Character> p0) {
    }
    
    public CharacterListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.android.networkconnect.datafragment.model.Character> characters, @org.jetbrains.annotations.NotNull()
    com.example.android.networkconnect.datafragment.viewmodel.ItemClickNavigation mNavigation) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/android/networkconnect/datafragment/adapter/CharacterListAdapter$CharacterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/android/networkconnect/datafragment/adapter/CharacterListAdapter;Landroid/view/View;)V", "characterEmail", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "characterName", "characterPhone", "imageEmailView", "Landroid/widget/ImageView;", "imagePhoneView", "imageView", "progressDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "bind", "", "character", "Lcom/example/android/networkconnect/datafragment/model/Character;", "Application_debug"})
    public final class CharacterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageView = null;
        private final android.widget.ImageView imagePhoneView = null;
        private final android.widget.ImageView imageEmailView = null;
        private final android.widget.TextView characterName = null;
        private final android.widget.TextView characterPhone = null;
        private final android.widget.TextView characterEmail = null;
        private final androidx.swiperefreshlayout.widget.CircularProgressDrawable progressDrawable = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.android.networkconnect.datafragment.model.Character character) {
        }
        
        public CharacterViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}