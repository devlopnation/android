package imagestudio.devlopnation.com.imagestudio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);

        Intent intent = getIntent();
        int position = intent.getExtras().getInt("position");

        ImageAdapter imageAdapter = new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.images[position]);

    }
}
