package com.example.exo4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvNom, tvPrenom, tvEmail, tvPhone, tvAdresse, tvVille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialiser les TextViews
        tvNom = findViewById(R.id.tv_nom);
        tvPrenom = findViewById(R.id.tv_prenom);
        tvEmail = findViewById(R.id.tv_email);
        tvPhone = findViewById(R.id.tv_phone);
        tvAdresse = findViewById(R.id.tv_adresse);
        tvVille = findViewById(R.id.tv_ville);

        // Récupérer les informations de l'intent
        String nom = getIntent().getStringExtra("NOM");
        String prenom = getIntent().getStringExtra("PRENOM");
        String email = getIntent().getStringExtra("EMAIL");
        String phone = getIntent().getStringExtra("PHONE");
        String adresse = getIntent().getStringExtra("ADRESSE");
        String ville = getIntent().getStringExtra("VILLE");

        // Afficher les informations
        tvNom.setText("Nom : " + nom);
        tvPrenom.setText("Prénom : " + prenom);
        tvEmail.setText("Email : " + email);
        tvPhone.setText("Téléphone : " + phone);
        tvAdresse.setText("Adresse : " + adresse);
        tvVille.setText("Ville : " + ville);
    }
}
