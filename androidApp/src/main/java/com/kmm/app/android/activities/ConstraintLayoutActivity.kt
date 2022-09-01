package com.kmm.app.android.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.kmm.app.android.R
import com.kmm.app.android.adapter.LIstAdapter
import com.kmm.app.android.databinding.ActivityConstraintLayoutBinding
import com.kmm.app.bean.DataBean
import com.kmm.app.bean.TestBean
import kotlinx.coroutines.launch

class ConstraintLayoutActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)



    }
}