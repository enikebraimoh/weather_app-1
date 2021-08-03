package com.enike.weatherapp.core

import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

abstract class FullScreenBaseFragment<DB : ViewDataBinding>(@LayoutRes val layoutRes: Int) :
    BaseFragment<DB>(layoutRes) {

    override fun onResume() {
        super.onResume()
        setTransparentStatusBar()
    }

    override fun onDestroy() {
        super.onDestroy()
        activity?.window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
    }

    private fun setTransparentStatusBar() {
        // Hide the status bar.
        requireActivity().window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        activity?.window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LOW_PROFILE or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }

}