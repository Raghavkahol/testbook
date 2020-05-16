package com.example.testbook.testBookHome.module.home

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.testbook.R
import com.example.testbook.databinding.ActivityHomeBinding
import com.example.testbook.testBookHome.AppApplication
import com.example.testbook.testBookHome.di.component.DaggerHomeComponent
import com.example.testbook.testBookHome.di.module.HomeModule
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var homeViewModel: HomeViewModel
    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        setupFragmentComponent()
        binding.viewModel = homeViewModel
        binding.lifecycleOwner = this
    }

     fun setupFragmentComponent() {
         DaggerHomeComponent.builder()
             .applicationComponent(AppApplication.getInstance()?.mComponent)
             .homeModule(HomeModule(this))
             .build().inject(this)
    }
}
