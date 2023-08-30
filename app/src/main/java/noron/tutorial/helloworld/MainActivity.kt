package noron.tutorial.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

//app start
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set click on me button(r->Res,
        val btnClickMe = findViewById(R.id.button) as Button
        var myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        // set on-click listener, Toast = message on screen
        btnClickMe.setOnClickListener{
            myTextView.text = timesClicked.toString()
            timesClicked++
            Toast.makeText(this@MainActivity, "Hi Mohi", Toast.LENGTH_SHORT).show()
        }

    }
}