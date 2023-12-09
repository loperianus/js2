package com.example.belajarandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.belajarandroid.ui.theme.BelajarAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val buttonButton: Button = findViewById(R.id.buttonButton)
        val buttonTextView: TextView = findViewById(R.id.buttonTextView)

        buttonTextView.text = resources.getString(R.string.app_name)

        buttonButton.setOnClickListener {
            val name = nameEditText.text.toString()
            buttonTextView.text = resources.getString(R.string.buttonTextView, name)


            resources.getStringArray(R.array.names).forEach { Log.i("PZN",it) }

        }

        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BelajarAndroidTheme {
        Greeting("Android")
    }
}