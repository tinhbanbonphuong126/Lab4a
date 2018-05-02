package android.adnetplus.com.lap4a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

//        ImageButton mainAct = (ImageButton) findViewById(R.id.idTrain);
//        mainAct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ServiceActivity.this, MainActivity.class);
//                intent.putExtra("maNhanVien", "123456");

//                startActivityForResult(intent);
//                startActivity(intent);
//            }
//        });
    }
}
