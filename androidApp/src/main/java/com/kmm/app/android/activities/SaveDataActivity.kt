package com.kmm.app.android.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kmm.app.android.R


class SaveDataActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_data)

        val tvSaveData: TextView = findViewById(R.id.tv_save_data)
        val tvGetData:TextView=findViewById(R.id.tv_get_data)




        tvSaveData.setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {

            }
        })


        tvGetData.setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {

            }
        })

    }

    override fun onDestroy() {
        super.onDestroy()

    }

}
