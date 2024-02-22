package napier.mad.multiactivity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn_activityA = (Button)findViewById(R.id.btn_activityA);
		btn_activityA.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//Intent activityA = new Intent(MainActivity.this, ActivityA.this);
				Intent activityA = new Intent(MainActivity.this, ActivityA.class);
				startActivityForResult(activityA, 1);
			}
		});
		
		
		Button btn_activityB = (Button)findViewById(R.id.btn_activityB);
		btn_activityB.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent activityB = new Intent(MainActivity.this, ActivityB.class);
				startActivityForResult(activityB, 2);
			}
		});
	}
	
	
	
	
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		if (requestCode == 1) { // Respond to the right request ID
			if (resultCode == 1) {
				String returnString = data.getStringExtra("String");
				Toast.makeText(getBaseContext(), "In main activity. String = " + returnString, Toast.LENGTH_SHORT).show();
			}
		}
	}
}