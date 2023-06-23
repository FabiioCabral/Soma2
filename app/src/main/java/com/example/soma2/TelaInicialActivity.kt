import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.soma2.R

class TelaInicialActivity : AppCompatActivity() {

    private lateinit var editTextNumero1: EditText
    private lateinit var editTextNumero2: EditText
    private lateinit var buttonSomar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        editTextNumero1 = findViewById(R.id.editTextNumero1)
        editTextNumero2 = findViewById(R.id.editTextNumero2)
        buttonSomar = findViewById(R.id.buttonSomar)

        buttonSomar.setOnClickListener {
            val numero1 = editTextNumero1.text.toString().toInt()
            val numero2 = editTextNumero2.text.toString().toInt()

            val resultado = numero1 + numero2

            val intent = Intent(this, TelaResultadoActivity::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
    }
}
