package fonket.drinkquest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.R.attr.value;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class DrinkActivity extends AppCompatActivity {
    int beerlevel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        Button btnfinal = (Button) findViewById(R.id.btnfinal);


        final String sex = getIntent().getStringExtra("sex");
        Log.d("debug", sex);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar2);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                beerlevel = progress;
                Log.d("HOLI", String.valueOf(beerlevel));
                TextView textView = (TextView) findViewById(R.id.countTv);
                textView.setText(String.valueOf(beerlevel));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        }
        );

        btnfinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(DrinkActivity.this, ResultActivity.class);
                intent.putExtra("valueSex",sex);
                intent.putExtra("valueBeer", beerlevel);
                startActivity(intent);


            }
        });


        if (sex.contains("hombre")) {


        } else {



        }
    }}

