package br.com.appviral.appviral;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class PrincipalActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec aba1 = tabHost.newTabSpec("TAB1");
        Intent intent = new Intent(this, ListaRecebidosActivity.class);
        aba1.setContent(intent);
        aba1.setIndicator("",getResources().getDrawable(R.mipmap.ic_aba1));
        tabHost.addTab(aba1);

        TabHost.TabSpec aba2 = tabHost.newTabSpec("TAB2");
        aba2.setContent(R.id.id_aba2);
        aba2.setIndicator("",getResources().getDrawable(R.mipmap.ic_aba2));
        tabHost.addTab(aba2);

        TabHost.TabSpec aba3 = tabHost.newTabSpec("TAB3");
        aba3.setContent(R.id.id_aba3);
        aba3.setIndicator("",getResources().getDrawable(R.mipmap.ic_aba3));
        tabHost.addTab(aba3);
    }
}
