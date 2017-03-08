package com.example.lobin;
import android.app.Activity;  
import android.content.Intent;  
import android.content.SharedPreferences;  
import android.content.SharedPreferences.Editor;  
import android.opengl.ETC1;  
import android.os.Bundle;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.view.Window;  
import android.view.animation.AlphaAnimation;  
import android.view.animation.Animation;  
import android.view.animation.Animation.AnimationListener;  
import android.widget.Button;  
import android.widget.ImageButton;  
import android.widget.ImageView;  
import android.widget.ProgressBar;  
  
public class LogoActivity extends Activity {  
    private ProgressBar progressBar;  
    private Button backButton;  
  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        // È¥³ý±êÌâ  
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);  
        setContentView(R.layout.logo);  
  
        progressBar = (ProgressBar) findViewById(R.id.pgBar);  
        backButton = (Button) findViewById(R.id.btn_back);  
  
        Intent intent = new Intent(this, WelcomeAvtivity.class);  
        LogoActivity.this.startActivity(intent);  
  
        backButton.setOnClickListener(new OnClickListener() {  
  
            public void onClick(View v) {  
                finish();  
  
            }  
        });  
  
    }  
  
}