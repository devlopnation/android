package animallover.example.abc.animallover;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import animallover.example.abc.animallover.esource.Resource;

public class QuestionThree extends Activity {

    Button submit;
    RadioGroup group;
    RadioButton radioButton;
    TextView question;
    String result;
    int cat = 0;
    int dog = 0;
    int tiger = 0;
    int bird = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
        submit = (Button) findViewById(R.id.submit);
        group = (RadioGroup) findViewById(R.id.radioGroup);
        question = (TextView) findViewById(R.id.question);
        question.setText(Resource.questions[2]);
        Intent intent = getIntent();
        cat = intent.getIntExtra("cat",0);
        dog = intent.getIntExtra("dog",0);
        tiger = intent.getIntExtra("tiger",0);
        bird = intent.getIntExtra("bird",0);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = (RadioButton) findViewById(checkedId);
                if(radioButton.getText().equals("tiger")){
                    tiger++;
                    result = "tiger";
                }else if(radioButton.getText().equals("dog")){
                    dog++;
                    result = "dog";
                }else if(radioButton.getText().equals("cat")){
                    cat++;
                    result = "cat";
                }else if (radioButton.getText().equals("bird")){
                    result = "bird";
                    bird++;
                }else{
                    result = "nothing";
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.equals("nothing")){
                    Toast.makeText(QuestionThree.this,"Please Select One Option",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(QuestionThree.this,QuestionFour.class);
                    intent.putExtra("result",result);
                    intent.putExtra("cat",cat);
                    intent.putExtra("dog",dog);
                    intent.putExtra("tiger",tiger);
                    intent.putExtra("bird",bird);
                    startActivity(intent);
                }
            }
        });
    }
}
