import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.soma2.R


class TelaResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        val resultado = intent.getIntExtra("resultado", 0)
        "Resultado: $resultado"
    }
}
