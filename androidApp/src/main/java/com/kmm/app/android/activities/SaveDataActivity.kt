package com.kmm.app.android.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kmm.app.Platform
import com.kmm.app.android.R


class SaveDataActivity : AppCompatActivity() {


    private val key:String="key"

    private lateinit var tv_show_data:TextView;

    private lateinit var editInput:EditText;

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_data)

        val tvSaveData: TextView = findViewById(R.id.tv_save_data)
        val tvGetData:TextView=findViewById(R.id.tv_get_data)

        tv_show_data=findViewById(R.id.tv_show_data)

        editInput=findViewById(R.id.edit_input)

        tvSaveData.setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {

                var input=editInput.text.toString();
                Platform().putString(this@SaveDataActivity,key,input)

                Toast.makeText(this@SaveDataActivity,"存储成功",Toast.LENGTH_SHORT).show()
            }
        })


        tvGetData.setOnClickListener(object : View.OnClickListener{

            override fun onClick(v: View?) {

                var result=Platform().getData(this@SaveDataActivity,key)

                tv_show_data.text=result
            }
        })

    }

    override fun onDestroy() {
        super.onDestroy()

    }

}
