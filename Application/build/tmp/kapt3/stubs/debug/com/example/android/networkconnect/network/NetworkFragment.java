package com.example.android.networkconnect.network;

import java.lang.System;

/**
 * Implementation of headless Fragment that runs an AsyncTask to fetch data from the network.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0006\u0010\u0013\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/android/networkconnect/network/NetworkFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mCallback", "Lcom/example/android/networkconnect/network/DownloadCallback;", "mDownloadTask", "Lcom/example/android/networkconnect/network/NetworkFragment$DownloadTask;", "mUrlString", "", "cancelDownload", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDetach", "startDownload", "Companion", "DownloadTask", "Application_debug"})
public final class NetworkFragment extends androidx.fragment.app.Fragment {
    private com.example.android.networkconnect.network.DownloadCallback mCallback;
    private com.example.android.networkconnect.network.NetworkFragment.DownloadTask mDownloadTask;
    private java.lang.String mUrlString;
    private static final java.lang.String TAG = "NetworkFragment";
    private static final java.lang.String URL_KEY = "UrlKey";
    public static final com.example.android.networkconnect.network.NetworkFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * Start non-blocking execution of DownloadTask.
     */
    public final void startDownload() {
    }
    
    /**
     * Cancel (and interrupt if necessary) any ongoing DownloadTask execution.
     */
    public final void cancelDownload() {
    }
    
    public NetworkFragment() {
        super();
    }
    
    /**
     * Implementation of AsyncTask that runs a network operation on a background thread.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u000e\u0012\f\u0018\u00010\u0004R\u00060\u0000R\u00020\u00050\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\f\u0018\u00010\u0004R\u00060\u0000R\u00020\u00052\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\t\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0018\u00010\u0004R\u00060\u0000R\u00020\u0005H\u0014J\u001a\u0010\u0011\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0018\u00010\u0004R\u00060\u0000R\u00020\u0005H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J%\u0010\u0013\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\t\"\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002\u00a8\u0006\u001b"}, d2 = {"Lcom/example/android/networkconnect/network/NetworkFragment$DownloadTask;", "Landroid/os/AsyncTask;", "", "", "Lcom/example/android/networkconnect/network/NetworkFragment$DownloadTask$Result;", "Lcom/example/android/networkconnect/network/NetworkFragment;", "(Lcom/example/android/networkconnect/network/NetworkFragment;)V", "doInBackground", "urls", "", "([Ljava/lang/String;)Lcom/example/android/networkconnect/network/NetworkFragment$DownloadTask$Result;", "downloadUrl", "url", "Ljava/net/URL;", "onCancelled", "", "result", "onPostExecute", "onPreExecute", "onProgressUpdate", "values", "([Ljava/lang/Integer;)V", "readStream", "stream", "Ljava/io/InputStream;", "maxLength", "Result", "Application_debug"})
    final class DownloadTask extends android.os.AsyncTask<java.lang.String, java.lang.Integer, com.example.android.networkconnect.network.NetworkFragment.DownloadTask.Result> {
        
        /**
         * Cancel background network operation if we do not have network connectivity.
         */
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        /**
         * Defines work to perform on the background thread.
         */
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected com.example.android.networkconnect.network.NetworkFragment.DownloadTask.Result doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... urls) {
            return null;
        }
        
        /**
         * Send DownloadCallback a progress update.
         */
        @java.lang.Override()
        protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
        java.lang.Integer... values) {
        }
        
        /**
         * Updates the DownloadCallback with the result.
         */
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        com.example.android.networkconnect.network.NetworkFragment.DownloadTask.Result result) {
        }
        
        /**
         * Override to add special behavior for cancelled AsyncTask.
         */
        @java.lang.Override()
        protected void onCancelled(@org.jetbrains.annotations.Nullable()
        com.example.android.networkconnect.network.NetworkFragment.DownloadTask.Result result) {
        }
        
        /**
         * Given a URL, sets up a connection and gets the HTTP response body from the server.
         * If the network request is successful, it returns the response body in String form. Otherwise,
         * it will throw an IOException.
         */
        private final java.lang.String downloadUrl(java.net.URL url) throws java.io.IOException {
            return null;
        }
        
        /**
         * Converts the contents of an InputStream to a String.
         */
        private final java.lang.String readStream(java.io.InputStream stream, int maxLength) throws java.io.IOException {
            return null;
        }
        
        public DownloadTask() {
            super();
        }
        
        /**
         * Wrapper class that serves as a union of a result value and an exception. When the
         * download task has completed, either the result value or exception can be a non-null
         * value. This allows you to pass exceptions to the UI thread that were thrown during
         * doInBackground().
         */
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0013\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0002\u0010\bR\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/android/networkconnect/network/NetworkFragment$DownloadTask$Result;", "", "resultValue", "", "(Lcom/example/android/networkconnect/network/NetworkFragment$DownloadTask;Ljava/lang/String;)V", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/example/android/networkconnect/network/NetworkFragment$DownloadTask;Ljava/lang/Exception;)V", "mException", "getMException", "()Ljava/lang/Exception;", "setMException", "(Ljava/lang/Exception;)V", "mResultValue", "getMResultValue", "()Ljava/lang/String;", "setMResultValue", "(Ljava/lang/String;)V", "Application_debug"})
        public final class Result {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String mResultValue;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Exception mException;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMResultValue() {
                return null;
            }
            
            public final void setMResultValue(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Exception getMException() {
                return null;
            }
            
            public final void setMException(@org.jetbrains.annotations.Nullable()
            java.lang.Exception p0) {
            }
            
            public Result(@org.jetbrains.annotations.NotNull()
            java.lang.String resultValue) {
                super();
            }
            
            public Result(@org.jetbrains.annotations.NotNull()
            java.lang.Exception exception) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/networkconnect/network/NetworkFragment$Companion;", "", "()V", "TAG", "", "URL_KEY", "getInstance", "Lcom/example/android/networkconnect/network/NetworkFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "url", "Application_debug"})
    public static final class Companion {
        
        /**
         * Static initializer for NetworkFragment that sets the URL of the host it will be downloading
         * from.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.networkconnect.network.NetworkFragment getInstance(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}