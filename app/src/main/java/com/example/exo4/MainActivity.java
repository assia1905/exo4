package com.example.exo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editNom, editPrenom, editEmail, editPhone, editAdresse, editVille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialiser les champs
        editNom = findViewById(R.id.edit_nom);
        editPrenom = findViewById(R.id.edit_prenom);
        editEmail = findViewById(R.id.edit_email);
        editPhone = findViewById(R.id.edit_phone);
        editAdresse = findViewById(R.id.edit_adresse);
        editVille = findViewById(R.id.edit_ville);

        Button btnEnvoyer = findViewById(R.id.btn_envoyer);

        // Action du bouton "Envoyer"
        btnEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les informations saisies
                String nom = editNom.getText().toString();
                String prenom = editPrenom.getText().toString();
                String email = editEmail.getText().toString();
                String phone = editPhone.getText().toString();
                String adresse = editAdresse.getText().toString();
                String ville = editVille.getText().toString();

                // Créer un Intent pour passer à la deuxième activité
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("NOM", nom);
                intent.putExtra("PRENOM", prenom);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);
                intent.putExtra("ADRESSE", adresse);
                intent.putExtra("VILLE", ville);
                startActivity(intent);
            }
        });
    }
}
