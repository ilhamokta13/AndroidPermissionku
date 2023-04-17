package com.example.androidpermissionku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.androidpermissionku.databinding.ActivityNormalPermissionsBinding

class NormalPermissions : AppCompatActivity() {
    lateinit var binding: ActivityNormalPermissionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNormalPermissionsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLoadImage.setOnClickListener {
            Glide.with(this)
                .load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.ivBinar)
        }


    }
}