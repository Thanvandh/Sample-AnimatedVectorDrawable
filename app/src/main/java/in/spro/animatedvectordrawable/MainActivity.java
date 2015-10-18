package in.spro.animatedvectordrawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView animatedView;
    private Drawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animatedView = (ImageView) findViewById(R.id.imageView);
        drawable = animatedView.getDrawable();
        ((Animatable) drawable).start();
        animatedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Animatable) drawable).isRunning()) {
                    ((Animatable) drawable).stop();
                } else {
                    ((Animatable) drawable).start();
                }
            }
        });
    }
}
