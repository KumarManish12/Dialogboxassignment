package com.practice.dialogboxassignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var tventernumber: TextView
    lateinit var tvnumber: TextView
    lateinit var flobtnadd: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tventernumber = findViewById(R.id.tventernumber)
        tvnumber = findViewById(R.id.tvnumber)
        flobtnadd = findViewById(R.id.flobtnadd)
        flobtnadd.setOnClickListener {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.setTitle(resources.getString(R.string.alert))
                alertDialog.setMessage("Press add button to add 10         Press multi button to multiply 5        Press reset button to reset")
                alertDialog.setPositiveButton(resources.getString(R.string.addbutton), { _, _ ->
            tvnumber.text= (tvnumber.text.toString().toInt()+10).toString()})
                alertDialog.setNegativeButton(resources.getString(R.string.MultiButton),{_,_->
                    tvnumber.text=(tvnumber.text.toString().toInt()*5).toString()
                })
                alertDialog.setNeutralButton(resources.getString(R.string.ResetButton),{_,_->
                    tvnumber.text=0.toString()

                })
                alertDialog.show()

        }
    }
}




