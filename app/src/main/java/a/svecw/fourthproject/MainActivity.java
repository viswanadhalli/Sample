package a.svecw.fourthproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.t1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")) {

                    Toast.makeText(MainActivity.this,"regno and password cannot be empty",Toast.LENGTH_SHORT).show();

                }

                else if((e1.getText().toString().equals("17b01a0502")||e1.getText().toString().equals("17b01a0524")||e1.getText().toString().equals("17b01a0528")||e1.getText().toString().equals("17b01a1209"))&&(e2.getText().toString().equals("webcap"))||e1.getText().toString().equals("admin")&&e2.getText().toString().equals("admin")){

                    if(e1.getText().toString().equals("admin")&&e2.getText().toString().equals("admin")) {
                        Intent newintent = new Intent(getApplicationContext(), Seventh.class);
                        startActivity(newintent);
                    }
                    else{
                        Intent newintent = new Intent(getApplicationContext(), First.class);
                        startActivity(newintent);
                    }
                    //Toast.makeText(Hostel8.this,"regno and password perfect",Toast.LENGTH_SHORT).show();

                }
                else{

                    Toast.makeText(MainActivity.this,"Wrong regno or Wrong password",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
