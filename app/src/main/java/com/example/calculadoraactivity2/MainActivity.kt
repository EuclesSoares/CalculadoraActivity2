import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.calculadoraactivity2.R


class MainActivity : AppCompatActivity() {
    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var buttonSum: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.editTextNumber1)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        buttonSum = findViewById(R.id.buttonSum)

        buttonSum.setOnClickListener {
            val number1 = editTextNumber1.text.toString().toInt()
            val number2 = editTextNumber2.text.toString().toInt()
            val sum = number1 + number2

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("result", sum)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, sum: Any) {
    TODO("Not yet implemented")
}

private operator fun Any.plus(number2: Any): Any {
    TODO("Not yet implemented")
}

private fun String.toInt(): Any {
    TODO("Not yet implemented")
}
