package psti.unram.test

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lengthInput = findViewById<EditText>(R.id.lengthInput)
        val widthInput = findViewById<EditText>(R.id.widthInput)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        calculateButton.setOnClickListener {
            val length = lengthInput.text.toString().toDoubleOrNull()
            val width = widthInput.text.toString().toDoubleOrNull()

            if (length != null && width != null) {
                val area = length * width
                resultText.text = "Hasil: $area"
            } else {
                resultText.text = "Masukkan nilai yang valid"
            }
        }
    }
}