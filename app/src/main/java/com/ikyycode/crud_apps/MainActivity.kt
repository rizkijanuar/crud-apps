package com.ikyycode.crud_apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    // INISIASI VARIABEL DARI XML
    private lateinit var rv : RecyclerView
    private lateinit var fab : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CALL VARIABEL
        rv = findViewById(R.id.rv)
        fab = findViewById(R.id.fb)

    }
}