package napier.mad.multiactivity;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class ActivityB extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activityb);
		
		Toast.makeText(getBaseContext(), "In Activity B", Toast.LENGTH_SHORT);
	}
}