package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
  }

  /**
   * Set the initial (UI) state of the app.
   */
  private fun initViews() {
        submitButton.setOnClickListener{
            getFields()
            inputField1.setText("")
            inputField2.setText("")
            inputField3.setText("")
            inputField4.setText("")
        }
    }

  /**
   * Get the textfields and add to the array
   */
  private fun getFields() {
        val list: ArrayList<String> = ArrayList()

        list.add(inputField1.text.toString().trim())
        list.add(inputField2.text.toString().trim())
        list.add(inputField3.text.toString().trim())
        list.add(inputField4.text.toString().trim())

        compareArray(list)
    }

  /**
   * Compare the correctlist of values to the given list of values
   */
  private fun compareArray(list: ArrayList<String>) {
        //hardcoded array as these values are always the correctValues
        val correctList = arrayOf("T", "F", "F", "F")

        var correct = 0
        // hardcoded for as we now there should only be 4 values
        for(i in 0 .. 3) {
            // adds 1 to correct value if the 2 match
            if(list[i].toUpperCase() == correctList[i]){
                correct++
            }
        }
        // output a toast message
        showToast(correct)
    }

  /**
   * showtoast for correct given values
   */
  private fun showToast(correct: Int) {
        Toast.makeText(this, "correct amount is: $correct", Toast.LENGTH_LONG).show()

    }
}
