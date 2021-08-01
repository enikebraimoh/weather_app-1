package com.enike.weatherapp.core

import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

abstract class FullScreenBaseFragment<DB : ViewDataBinding>(@LayoutRes val layoutRes: Int) :
    BaseFragment<DB>(layoutRes) {

    override fun onResume() {
        super.onResume()
        requireActivity().window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN

        }
    }

}