package preflistener.utils

import android.util.Log
import preflistener.PrefListener
import preflistener.development

object Logger {

    private const val TAG = "PrefListener"

    fun logD(message: String) {
        if (PrefListener.isDebuggable && development) {
            Log.d(TAG, message)
        }
    }

    fun logP(message: String) {
        if (PrefListener.isDebuggable) {
            Log.d(TAG, message)
        }
    }

}
