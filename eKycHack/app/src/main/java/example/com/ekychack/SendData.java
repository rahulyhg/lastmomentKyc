package example.com.ekychack;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SendData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data);
        ProgressDialog progressDialog=new ProgressDialog(SendData.this);
        progressDialog.setMessage("Verifying auth-reference with eMudhra");
        progressDialog.show();
    }
}
