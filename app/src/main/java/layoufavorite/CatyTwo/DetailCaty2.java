package layoufavorite.CatyTwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.teaja.FragmentTEAJA.XMLDOMParser;
import com.example.teaja.R;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class DetailCaty2 extends AppCompatActivity {
    private Toolbar tlCy2;
    private ListView lv_CatyTwo;
    ArrayList<String> arrayTitle, arrayLink;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_caty2);
        tlCy2 = findViewById(R.id.Tool_ComeBackTy2);
        lv_CatyTwo = findViewById(R.id.lst_CatyTwo);

        arrayTitle = new ArrayList<>();
        arrayLink = new ArrayList<>();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayTitle);
        lv_CatyTwo.setAdapter(adapter);

        setSupportActionBar(tlCy2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        new Reading().execute("https://vnexpress.net/rss/the-gioi.rss");
        //new Reading().execute("https://laodong24h.com.vn/ky-su-nhat-ban/");

        lv_CatyTwo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(DetailCaty2.this, DetailCatatyFavorite.class);
                intent.putExtra("linkTheGioi", arrayLink.get(i));
                startActivity(intent);
            }
        });
    }

    private class Reading extends AsyncTask<String, Void, String>{
        @Override
        protected String doInBackground(String... strings) {
            StringBuilder content = new StringBuilder();
            try {
                URL url = new URL(strings[0]);
                InputStreamReader inputStreamReader = new InputStreamReader(url.openConnection().getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    content.append(line);
                }
                bufferedReader.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
          XMLDOMParser parser = new XMLDOMParser();
          Document document = parser.getDocment(s);
          NodeList nodeList = document.getElementsByTagName("item");
          String tieuDe = "";
          for (int i = 0; i < nodeList.getLength(); i++){
              Element element = (Element) nodeList.item(i);
              tieuDe = parser.getValue(element, "title");
              arrayTitle.add(tieuDe);
              arrayLink.add(parser.getValue(element, "link"));
          }
          adapter.notifyDataSetChanged();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_set, menu);
        return super.onCreateOptionsMenu(menu);
    }
}