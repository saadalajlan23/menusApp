package com.example.menusapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var Tag: ConstraintLayout
    private var number = 0
    private lateinit var numberText : TextView
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Tag = findViewById(R.id.main)
        val s = Snackbar.make(Tag,"Hi saad", Snackbar.LENGTH_LONG)
        s.show()
        numberText = findViewById(R.id.numText)
        plusButton = findViewById(R.id.buttonP)
        minusButton = findViewById(R.id.button2N)

        if (number==0){
            numberText.setTextColor(Color.BLACK)
        }


        minusButton.setOnClickListener{
            number-=1
            if (number==0){
                numberText.setTextColor(Color.BLACK)
            }
            else if (number <0) {
                numberText.setTextColor(Color.RED)
            }

            numberText.text= number.toString()


        }
        plusButton.setOnClickListener{
            number+=1
            if (number==0){
                numberText.setTextColor(Color.BLACK)
            }

            else if(number>0){
                numberText.setTextColor(Color.GREEN)
            }

            numberText.text= number.toString()
        }


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuHi -> {
                Snackbar.make(Tag, "Hello there!", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.menuBye -> {
                Snackbar.make(Tag, "Goodbye", Snackbar.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}