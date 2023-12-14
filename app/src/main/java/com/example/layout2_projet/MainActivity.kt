package com.example.projetcreativite

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.layout2_projet.R

class MainActivity : AppCompatActivity() {

    private lateinit var nom: EditText
    private lateinit var affiche: Button
    private lateinit var boutton: Button
    private lateinit var tableRow2: TableRow
    private lateinit var tableLayout: TableLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom = findViewById(R.id.editTextText)
        affiche = findViewById(R.id.button2)
        boutton = findViewById(R.id.button3)
        tableRow2 = findViewById(R.id.tableRow2)
        tableLayout = findViewById(R.id.tableLayout)

        affiche.setOnClickListener {
            afichage()
        }

        boutton.setOnClickListener {
            list()
        }
    }

    private fun afichage() {
        val anarana = nom.text.toString()

        if (anarana.isEmpty()) {
            Toast.makeText(this, "fenoy ny banga", Toast.LENGTH_SHORT).show()
        } else {
            val mess = "nom:$anarana"
            Toast.makeText(this, mess, Toast.LENGTH_LONG).show()
        }
    }

    private fun list() {
        val anarana = nom.text.toString()

        if (anarana.isEmpty()) {
            Toast.makeText(this, "fenoy ny banga", Toast.LENGTH_SHORT).show()
        } else {
            val message = "nom:$anarana"

            // TableLayout
            tableRow2.removeAllViews()  // Supprimez les vues existantes dans tableRow2 si nécessaire

            // ... (Votre code existant pour ajouter des vues à tableRow2)
            val textView = TextView(this)
            textView.text = message
            tableRow2.addView(textView)
            tableLayout.addView(tableRow2)
        }
    }
}
