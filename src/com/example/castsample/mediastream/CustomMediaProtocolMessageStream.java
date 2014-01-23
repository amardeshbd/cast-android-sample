package com.example.castsample.mediastream;

import android.util.Log;

import com.google.cast.MediaProtocolMessageStream;

import org.json.JSONObject;

/**
 * A custom {@link com.google.cast.MediaProtocolMessageStream} class that can handle callback methods from remote media
 * receiver.
 * 
 * @see <a
 *      href="https://developers.google.com/cast/reference/android/javadoc/reference/com/google/cast/MediaProtocolMessageStream">MediaProtocolMessageStream</a>
 * @author hossaink
 */
public class CustomMediaProtocolMessageStream extends MediaProtocolMessageStream {
    private static final String LOG_TAG = CustomMediaProtocolMessageStream.class.getSimpleName();

    @Override
    protected void onStatusUpdated() {
        // NOTE: This is called back each ~0.5 seconds
        //Log.d(LOG_TAG, "onStatusUpdated()"); // Turned off logging.
    }

    @Override
    protected void onTrackListUpdated() {
        Log.d(LOG_TAG, "onTrackListUpdated()");
    }

    @Override
    protected void onError(final String errorDomain, final long errorCode, final JSONObject errorInfo) {
        Log.e(LOG_TAG, "onError() :: errorDomain=" + errorDomain + ", errorCode=" + errorCode + ", errorInfo=" + errorInfo);
    }

    @Override
    protected void onKeyRequested(final long requestId, final String method, final String[] requests) {
        Log.d(LOG_TAG, "onKeyRequested() :: requestId=" + requestId + ", method=" + method + ", requests=" + requests);
   }
}
