package com.bari_ikutsu.coloredstatusbar

import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ToolbarをActionBarに設定
        val toolbar = findViewById(R.id.tool_bar) as Toolbar
        setSupportActionBar(toolbar)

        // ボタンのイベントハンドラ
        button_red.setOnClickListener {
            toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.actionbar_red))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.statusBarColor = ContextCompat.getColor(this, R.color.statusbar_red)
                window.navigationBarColor = ContextCompat.getColor(this, R.color.navigationbar_red)
            }
        }

        button_green.setOnClickListener {
            toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.actionbar_green))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.statusBarColor = ContextCompat.getColor(this, R.color.statusbar_green)
                window.navigationBarColor = ContextCompat.getColor(this, R.color.navigationbar_green)
            }
        }

        button_blue.setOnClickListener {
            toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.actionbar_blue))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.statusBarColor = ContextCompat.getColor(this, R.color.statusbar_blue)
                window.navigationBarColor = ContextCompat.getColor(this, R.color.navigationbar_blue)
            }
        }
    }
}
