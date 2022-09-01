package com.kmm.app.android.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kmm.app.android.R


class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNet: TextView = findViewById(R.id.tv_net)
        val saveData:TextView=findViewById(R.id.tv_save_data)


        tvNet.setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {
                var intent:Intent=Intent();
                intent.setClass(this@MainActivity,NetActivity::class.java)
                startActivity(intent)
            }
        })


        saveData.setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {
                var intent:Intent=Intent();
                intent.setClass(this@MainActivity,SaveDataActivity::class.java)
                startActivity(intent)
            }
        })


        findViewById<TextView>(R.id.tv_constraint).setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {
                var intent:Intent=Intent();
                intent.setClass(this@MainActivity,ConstraintLayoutActivity::class.java)
                startActivity(intent)
            }
        })

    }

    override fun onDestroy() {
        super.onDestroy()

    }

}
