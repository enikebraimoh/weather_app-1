package com.enike.weatherapp.ui.splashScreen

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.enike.weatherapp.R
import com.enike.weatherapp.Utils
import com.enike.weatherapp.core.BaseFragment
import com.enike.weatherapp.core.FullScreenBaseFragment
import com.enike.weatherapp.databinding.FragmentSplashScreenBinding

class SplashScreenFragment :
    FullScreenBaseFragment<FragmentSplashScreenBinding>(R.layout.fragment_splash_screen) {

    override fun onResume() {
        super.onResume()
        loadAnimations()
        Handler().postDelayed({
            view?.let { view ->
                view.findNavController()
                    .navigate(SplashScreenFragmentDirections.actionSplashScreenFragmentToHomeFragment())
            }
        }, Utils.Constants.SPLASH_SCREEN_DURATION)
    }

    private fun loadAnimations(){
        val animation1 = AnimationUtils.loadAnimation(requireContext(),R.anim.buildings_fade_in)
        val animation2 = AnimationUtils.loadAnimation(requireContext(),R.anim.moon_fade_in)
        val animation3 = AnimationUtils.loadAnimation(requireContext(),R.anim.left_clouds_fade_in)
        val animation4 = AnimationUtils.loadAnimation(requireContext(),R.anim.right_clouds_fade_in)
        val animation5 = AnimationUtils.loadAnimation(requireContext(),R.anim.logo_fade_in)

        binding.buildings.startAnimation(animation1)
        binding.moon.startAnimation(animation2)
        binding.leftClouds.startAnimation(animation3)
        binding.rightClouds.startAnimation(animation4)
        binding.logo.startAnimation(animation5)
    }

}