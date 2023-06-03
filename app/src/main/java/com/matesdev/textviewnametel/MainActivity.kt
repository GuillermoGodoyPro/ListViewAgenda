package com.matesdev.textviewnametel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        var nombre = findViewById<EditText>(R.id.idName)
        var telefono = findViewById<EditText>(R.id.idTel)
        var bTenviar = findViewById<Button>(R.id.btEnviar)
        var agendaList = findViewById<ListView>(R.id.idListView)

        val agendaArray = arrayListOf<String>()
        var adapterAgenda = ArrayAdapter(this, android.R.layout.simple_list_item_1, agendaArray )
        agendaList.adapter = adapterAgenda

        bTenviar.setOnClickListener {
            val nameSend = nombre.text.toString().trim()
            val telSend = telefono.text.toString().trim()

            if (nameSend.isNotEmpty() && telSend.isNotEmpty()) {
                agendaArray.add(nameSend+" "+telSend)
                // Limpiar los campos de entrada

                adapterAgenda.notifyDataSetChanged()

                nombre.text.clear()
                telefono.text.clear()
            }
        }








    }
}