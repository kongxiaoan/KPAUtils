package com.kpa.utils

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.util.Log
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    val path = "https://1sapp.manlinggame.com/qupost/image/sp/2018/04/12/1523513574861.jpeg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val manager = this.windowManager
        val outMetrics = DisplayMetrics()
        manager.defaultDisplay.getMetrics(outMetrics)
        val width = outMetrics.widthPixels
        val height = outMetrics.heightPixels
        Log.e("kuan","宽 === 高${width} === ${height}")

        val i = width * width + height * height
        val densityUtils = DensityUtils(this)
        Log.e("density", DensityUtils.getDmDensityDpi().toString())
        val config = resources.configuration
        val smallestScreenWidth = config.smallestScreenWidthDp
        Log.e("最小宽度", "smallest width : $smallestScreenWidth")

        tv.setText(smallestScreenWidth.toString())
    }

}
