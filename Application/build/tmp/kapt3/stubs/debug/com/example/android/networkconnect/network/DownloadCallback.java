package com.example.android.networkconnect.network;

import java.lang.System;

/**
 * Sample interface containing bare minimum methods needed for an asynchronous task
 * to update the UI Context.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0010"}, d2 = {"Lcom/example/android/networkconnect/network/DownloadCallback;", "", "activeNetworkInfo", "Landroid/net/NetworkInfo;", "getActiveNetworkInfo", "()Landroid/net/NetworkInfo;", "finishDownloading", "", "onProgressUpdate", "progressCode", "", "percentComplete", "updateFromDownload", "result", "", "Progress", "Application_debug"})
public abstract interface DownloadCallback {
    
    /**
     * Get the device's active network status in the form of a NetworkInfo object.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract android.net.NetworkInfo getActiveNetworkInfo();
    
    /**
     * Indicates that the callback handler needs to update its appearance or information based on
     * the result of the task. Expected to be called from the main thread.
     */
    public abstract void updateFromDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String result);
    
    /**
     * Indicate to callback handler any progress update.
     * @param progressCode must be one of the constants defined in DownloadCallback.Progress.
     * @param percentComplete must be 0-100.
     */
    public abstract void onProgressUpdate(int progressCode, int percentComplete);
    
    /**
     * Indicates that the download operation has finished. This method is called even if the
     * download hasn't completed successfully.
     */
    public abstract void finishDownloading();
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/android/networkconnect/network/DownloadCallback$Progress;", "", "Companion", "Application_debug"})
    public static abstract interface Progress {
        public static final com.example.android.networkconnect.network.DownloadCallback.Progress.Companion Companion = null;
        public static final int ERROR = -1;
        public static final int CONNECT_SUCCESS = 0;
        public static final int GET_INPUT_STREAM_SUCCESS = 1;
        public static final int PROCESS_INPUT_STREAM_IN_PROGRESS = 2;
        public static final int PROCESS_INPUT_STREAM_SUCCESS = 3;
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/android/networkconnect/network/DownloadCallback$Progress$Companion;", "", "()V", "CONNECT_SUCCESS", "", "ERROR", "GET_INPUT_STREAM_SUCCESS", "PROCESS_INPUT_STREAM_IN_PROGRESS", "PROCESS_INPUT_STREAM_SUCCESS", "Application_debug"})
        public static final class Companion {
            public static final int ERROR = -1;
            public static final int CONNECT_SUCCESS = 0;
            public static final int GET_INPUT_STREAM_SUCCESS = 1;
            public static final int PROCESS_INPUT_STREAM_IN_PROGRESS = 2;
            public static final int PROCESS_INPUT_STREAM_SUCCESS = 3;
            
            private Companion() {
                super();
            }
        }
    }
}