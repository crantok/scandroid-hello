package com.example.scandroid.helloworld

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class HelloWorld extends Activity {
  /**Called when the activity is first created. */
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
      setContentView(R.layout.main)

      sayHelloFromScala()
  }

  def sayHelloFromScala(){
    val textView = findViewById(R.id.helloWorld).asInstanceOf[TextView]
      textView.setText("Hello from Scala")
  }
}
                              
