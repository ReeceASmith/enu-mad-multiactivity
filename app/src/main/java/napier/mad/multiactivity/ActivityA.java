package napier.mad.multiactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class ActivityA extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitya);
		
		Toast.makeText(getBaseContext(), "In Activity A", Toast.LENGTH_SHORT).show();
	}
}