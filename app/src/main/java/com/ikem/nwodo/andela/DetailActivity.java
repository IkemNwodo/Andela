package com.ikem.nwodo.andela;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ikem.nwodo.andela.pageArrays.CoreArray;
import com.ikem.nwodo.andela.pageArrays.JavaScriptArray;
import com.ikem.nwodo.andela.pageArrays.PythonArray;
import com.ikem.nwodo.andela.adapters.DrawerAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class DetailActivity extends AppCompatActivity implements DrawerAdapter.ItemClickListener {


    private RecyclerView recyclerView;

    // Array of pages
    private Fragment[] pages;

    private  int PAGE_COUNTER = 0;
    private  int NUMBER_OF_PAGES;

    // Buttons
    Button nextButton, previousButton;

    // Nav header title
    TextView navHeaderTitle;

    // page number textview
    TextView pageNumber;
    TextView totalPageNumber;

    // Drawer && toolbar titles
    String[] titles;

    Toolbar toolbar;

    DrawerLayout drawer;

    DrawerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navHeaderTitle = findViewById(R.id.nav_header_title);

        pageNumber = findViewById(R.id.page_number);
        totalPageNumber = findViewById(R.id.total_page_number);

        nextButton = findViewById(R.id.next_button);
        previousButton = findViewById(R.id.previous_button);

        recyclerView = findViewById(R.id.left_drawer);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Bundle bundle = getIntent().getBundleExtra("bundle");
        int tabNumber = bundle.getInt("tabNumber");
        int titlePosition = bundle.getInt("titlePosition");

        // SetUp Drawer RecyclerView and Adapter
        setUpCustomDrawer(tabNumber, titlePosition);
        setupPages(tabNumber, titlePosition);

        // no of pages
        NUMBER_OF_PAGES = pages.length;
        totalPageNumber.setText(String.valueOf(NUMBER_OF_PAGES));

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        displayPage();

    }

    private void displayPage() {
        // set toolbar title
        toolbar.setTitle(titles[PAGE_COUNTER]);

        int pageNumberCounter = PAGE_COUNTER;
        pageNumber.setText(String.valueOf(pageNumberCounter+1));

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, pages[PAGE_COUNTER])
                .commit();
    }

    private void setupPages(int tabNumber, int titlePosition) {
        if (tabNumber == 0){
            if (titlePosition == 0){
                pages = CoreArray.integration;
            }
            else if (titlePosition == 1){
                pages = CoreArray.git;
            }
            else if (titlePosition == 2){
                pages = CoreArray.Winning;
            }
            else if ( titlePosition == 3){
                pages = CoreArray.databases;
            }
        }
        else if (tabNumber == 1){
            switch (titlePosition){
                case 0:
                    pages = JavaScriptArray.programming;
                    break;
                case 1:
                    pages = JavaScriptArray.OOP;
                    break;
                case 2:
                    pages = JavaScriptArray.dataStructuresAlgorithms;
                    break;
                case 3:
                    pages = JavaScriptArray.ttd;
                    break;
                case 4:
                    pages = JavaScriptArray.webProgramming;
                    break;
                case 5:
                    pages = JavaScriptArray.es6;
                    break;
            }
        }
        else if (tabNumber == 2){
            switch (titlePosition){
                case 0:
                    pages = PythonArray.programming;
                    break;
                case 1:
                    pages = PythonArray.OOP;
                    break;
                case 2:
                    pages = PythonArray.dataStructuresAlgorithms;
                    break;
                case 3:
                    pages = PythonArray.tdd;
                    break;
                case 4:
                    pages = PythonArray.webProgramming;
                    break;
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    private void setUpCustomDrawer(int tabNumber, int titlePosition) {
        ArrayList<String> titleNames;
        if (tabNumber == 0) {
            switch (titlePosition) {
                case 0:
                    titles = getResources().getStringArray(R.array.integration);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_Integration);
                    break;
                case 1:
                    titles = getResources().getStringArray(R.array.git_and_version_control);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_git_and_version_control);
                    break;
                case 2:
                    titles = getResources().getStringArray(R.array.winning_with_people);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_winning_with_people);
                    break;
                case 3:
                    titles = getResources().getStringArray(R.array.databases);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_databases);
                    break;

            }
        } else if (tabNumber == 1) {
            switch (titlePosition) {
                case 0:
                    titles = getResources().getStringArray(R.array.introduction_to_programming_javascript);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_introduction_to_programming);
                    break;
                case 1:
                    titles = getResources().getStringArray(R.array.object_oriented_programming_javascript);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_object_oriented_programming);
                    break;
                case 2:
                    titles = getResources().getStringArray(R.array.data_structures_and_algorithms_javascript);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_data_structures_algorithms);
                    break;
                case 3:
                    titles = getResources().getStringArray(R.array.test_driven_development_javascript);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_tdd_javascript);
                    break;
                case 4:
                    titles = getResources().getStringArray(R.array.web_programming_javascript);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_web_programming_javascript);
                    break;
                case 5:
                    titles = getResources().getStringArray(R.array.introduction_to_es6);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_introduction_to_es6);
                    break;
            }

        } else if (tabNumber == 2) {
            switch (titlePosition) {
                case 0:
                    titles = getResources().getStringArray(R.array.introduction_to_programming_python);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_introduction_to_programming);
                    break;
                case 1:
                    titles = getResources().getStringArray(R.array.object_oriented_programming_python);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_object_oriented_programming);
                    break;
                case 2:
                    titles = getResources().getStringArray(R.array.data_structures_and_algorithms);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_data_structures_algorithms);
                    break;
                case 3:
                    titles = getResources().getStringArray(R.array.test_driven_development);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_tdd_python);
                    break;
                case 4:
                    titles = getResources().getStringArray(R.array.web_programming);
                    titleNames = new ArrayList<>(Arrays.asList(titles));
                    adapter = new DrawerAdapter(titleNames, this);
                    recyclerView.setAdapter(adapter);

                    navHeaderTitle.setText(R.string.nav_web_programming_python);
                    break;
            }

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClickListener(int adapterPosition) {
        PAGE_COUNTER = adapterPosition;
        changePage(adapterPosition);
        drawer.closeDrawers();
    }

    public void onNextPrevious(View view) {
        if (view.getId() == R.id.next_button){
            if (PAGE_COUNTER < NUMBER_OF_PAGES - 1) {
                PAGE_COUNTER++;
                changePage(PAGE_COUNTER);
            }
        }
        else if (view.getId() == R.id.previous_button){
            if (PAGE_COUNTER > 0){
                PAGE_COUNTER--;
                changePage(PAGE_COUNTER);
            }
        }
    }

    private void changePage(int pageCounter) {
        // set toolbar
        toolbar.setTitle(titles[pageCounter]);

        pageNumber.setText(String.valueOf(pageCounter +1));

        // set button visibility
        if (pageCounter > 0){
            previousButton.setVisibility(View.VISIBLE);
        }
        else {
            previousButton.setVisibility(View.INVISIBLE);
        }

        if (pageCounter == NUMBER_OF_PAGES - 1) {
            nextButton.setVisibility(View.INVISIBLE);
        }
        else {
            nextButton.setVisibility(View.VISIBLE);
        }        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, pages[pageCounter])
                .commit();
    }

}
