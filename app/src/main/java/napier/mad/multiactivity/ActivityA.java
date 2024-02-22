package napier.mad.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ActivityA extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitya);
		
		Toast.makeText(getBaseContext(), "In Activity A", Toast.LENGTH_SHORT).show();
		
		String stringReturn = "Edinburgh Napier University";
		Intent returnIntent = new Intent();
		returnIntent.putExtra("String", stringReturn);
		setResult(1, returnIntent);
		
		Button btn_close = (Button)findViewById(R.id.btn_close);
		btn_close.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
	}
}