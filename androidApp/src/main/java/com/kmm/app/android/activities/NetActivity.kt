package com.kmm.app.android.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.kmm.app.Greeting
import com.kmm.app.android.R
import com.kmm.app.android.adapter.LIstAdapter
import com.kmm.app.bean.DataBean
import com.kmm.app.bean.TestBean
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch


class NetActivity : AppCompatActivity() {

    lateinit var mRecyclerView:RecyclerView;

    private val scope = MainScope()

    private  val greet= Greeting();

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net)

        val tv: TextView = findViewById(R.id.text_view)
        mRecyclerView= findViewById(R.id.recycler_view)
        val symbol:TextView=findViewById(R.id.symbol)

        var dataList: MutableList<DataBean> = mutableListOf();

        var adapter: LIstAdapter=LIstAdapter();
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        mRecyclerView.adapter=adapter;

        scope.launch {
            kotlin.runCatching {
                greet.greeting()
            }.onSuccess {

                var bean:TestBean=Gson().fromJson(it,TestBean::class.java)

                bean.stocks?.get(0)?.data?.let {
                        it1 -> dataList.addAll(it1)
                }
                adapter.setList(dataList)
                symbol.text="港股代码NO.：${bean.stocks?.get(0)?.symbol}"


            }.onFailure {
                tv.text = it.localizedMessage
            }
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }

}
