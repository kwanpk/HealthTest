package comsci.kwan.healthtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EnterYourName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_your_name);
    }

    public void onClicklogin (View view){
        Intent intent = new Intent(EnterYourName.this,Starts.class);
        startActivity(intent);

    }

}
