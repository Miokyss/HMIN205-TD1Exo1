package td1.exo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        TextView tv = new TextView(this);
        tv.setText("TextView from java code");
        EditText editText = new EditText(this);
        editText.setText("EditText from java code");
        linearLayout.addView(tv);
        linearLayout.addView(editText);
    }
}