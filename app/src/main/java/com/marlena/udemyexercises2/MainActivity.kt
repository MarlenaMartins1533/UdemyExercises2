package com.marlena.udemyexercises2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateBTN.setOnClickListener {
            try {
                if(valor_recebidoEDT != null) {

                    valor_dolarTXT.text = ("R$ " + String.format("%2f", (valor_recebidoEDT.text.toString().toDouble() / 4)))
                    valor_euroTXT.text = ("R$ " + String.format("%2f", (valor_recebidoEDT.text.toString().toDouble() / 5)))

                    Toast.makeText(this, "Valor calculado", Toast.LENGTH_LONG).show()
                }
            }catch (e: Exception) {
                Toast.makeText(this, "Erro! Informe um valor", Toast.LENGTH_LONG).show()
            }
        }

        valor_dolarTXT.setText(" ")
        valor_euroTXT.setText(" ")
    }

}
