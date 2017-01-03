package animallover.example.abc.animallover;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends Activity {


    int cat = 0;
    int dog = 0;
    int tiger = 0;
    int bird = 0;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        cat = intent.getIntExtra("cat",0);
        dog = intent.getIntExtra("dog",0);
        tiger = intent.getIntExtra("tiger",0);
        bird = intent.getIntExtra("bird",0);
        result = (TextView) findViewById(R.id.mainresult);
        int numbers[] = {cat,dog,tiger,bird};
        int largest = numbers[0];

        for(int i=1; i< numbers.length; i++)
        {
            if(numbers[i] > largest)
                largest = numbers[i];
        }
        if(largest == cat){
            result.setText("Cat");
        }else if(largest == dog){
            result.setText("dog");
        }else if(largest == tiger){
            result.setText("tiger");
        }else if(largest == bird){
            result.setText("bird");
        }


    }
}
