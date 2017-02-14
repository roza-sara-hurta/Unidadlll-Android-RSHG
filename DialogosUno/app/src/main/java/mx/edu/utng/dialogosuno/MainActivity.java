package mx.edu.utng.dialogosuno;

import android.app.DatePickerDialog;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast, btnDialog, btnFecha;
    private int dia, mes,año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast = (Button) findViewById(R.id.btnToast);
        btnDialog = (Button) findViewById(R.id.btnDialog);
        btnFecha = (Button) findViewById(R.id.btnFecha);
        btnFecha.setOnClickListener(this);




        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Mensaje por medio del Toast", Toast.LENGTH_SHORT);
                toast1.show();
            }
        });
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogoAlerta dialogo = new DialogoAlerta();
                dialogo.show(fragmentManager, "tagAlerta");
            }

        });
    }

    @Override
    public void onClick(View v) {
        if(v== btnFecha){
            final Calendar c = Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
           mes=c.get(Calendar.MONTH);
            año=c.get(Calendar.YEAR);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {


            }

        }
          ,dia,mes,año);
            datePickerDialog.show();

        }
    }
}

