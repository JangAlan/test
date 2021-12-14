package com.alan.test_online.ui.bottomSheet

import android.view.View

interface OnBottomSheetCallbacks {
    fun onStateChanged(bottomSheet: View, newState: Int)
}