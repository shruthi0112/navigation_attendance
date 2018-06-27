package com.example.shruthibhat.adminlogin;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;
import android.support.v4.view.ViewPager;

import static com.example.shruthibhat.adminlogin.R.string.navigation_drawer_close;
import static com.example.shruthibhat.adminlogin.R.string.navigation_drawer_open;

public class MainActivity4 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public Toolbar toolBar;
    public TabLayout tabLayout;
    public ViewPager viewPager;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        toolBar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView=(NavigationView)findViewById(R.id.nav_View);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setSupportActionBar(Toolbar toolBar) {
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.iditem1)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem2)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem3)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem3)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem4)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem5)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem6)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem7)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.iditem8)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
