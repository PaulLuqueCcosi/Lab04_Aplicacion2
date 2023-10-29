package unsa.idnp.lab04_aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textToSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToSend = findViewById(R.id.editTextMensaje);

    }

    public void sendOtherAppMenssage(View view){
        Log.d("salida", "Se presiona el boton de la otra app");
        // se envia el intent para que los broadcast lo escuchen
        Intent intent = new Intent();
        intent.setAction("com.example.APP1_ACTION");
        intent.putExtra("key", textToSend.getText().toString());
        sendBroadcast(intent);
    }
}