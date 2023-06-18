import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.calculadoraactivity2.R

class ResultActivity : AppCompatActivity() {
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_activity)

        textViewResult = findViewById(R.id.textViewResult)

        val result = intent.getIntExtra("result", 0)
        textViewResult.text = "Resultado: $result"
    }
}
