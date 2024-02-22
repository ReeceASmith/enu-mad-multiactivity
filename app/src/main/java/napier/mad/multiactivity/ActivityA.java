package napier.mad.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
		
		
		EditText txt_entry = (EditText)findViewById(R.id.txt_entry);
		Button btn_updateReturnString = (Button)findViewById(R.id.btn_updateReturnString);
		btn_updateReturnString.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				returnIntent.removeExtra("String");
				returnIntent.putExtra("String", txt_entry.getText().toString());
				//setResult(1, returnIntent);
			}
			
		});
		
		
		txt_entry.setOnKeyListener(new View.OnKeyListener() {
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				returnIntent.removeExtra("String");
				returnIntent.putExtra("String", txt_entry.getText().toString());
				return true;
			}
		});
	}
}