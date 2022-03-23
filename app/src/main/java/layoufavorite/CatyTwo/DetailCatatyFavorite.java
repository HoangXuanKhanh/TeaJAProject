package layoufavorite.CatyTwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.teaja.R;

public class DetailCatatyFavorite extends AppCompatActivity {

    private Toolbar mToolbar;
    private WebView wb_DuLieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cataty_favorite);
        mToolbar = findViewById(R.id.Tool_BacktieuDe);
        wb_DuLieu = findViewById(R.id.wb_Delieu);

        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        Intent intent = getIntent();
        String link = intent.getStringExtra("linkTheGioi");
        wb_DuLieu.loadUrl(link);

        wb_DuLieu.setWebViewClient(new WebViewClient());
    }
}