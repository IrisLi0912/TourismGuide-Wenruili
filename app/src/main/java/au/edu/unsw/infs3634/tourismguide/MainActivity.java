package au.edu.unsw.infs3634.tourismguide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Sight> allSight;
    private ArrayList<Sight> adapterList;
    private SightAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // modify the toolbar, set title and  text color
        Toolbar mToolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(mToolbar);
        mToolbar.setTitleTextColor(Color.BLACK);
        mToolbar.setBackgroundColor(Color.CYAN);


        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        allSight = Sight.getSights();
        adapterList = new ArrayList<>();
        adapterList.addAll(allSight);

        //modify the whole recycler view is clickable
        adapter = new SightAdapter(this, adapterList);
        recyclerView.setAdapter(adapter);
        // redirect to detail page
        adapter.setOnItemClickListener(new SightAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("data", adapterList.get(position));
                startActivity(intent);
            }
        });
    }

    //search function
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchView search = (SearchView) menu.findItem(R.id.action_search).getActionView();
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                ArrayList<Sight> searchList = new ArrayList<>();
                for (int i = 0; i < allSight.size(); i++) {
                    if (allSight.get(i).getSightName().toLowerCase().contains(query.toLowerCase())) {
                        searchList.add(allSight.get(i));

                    }

                }
                adapterList.clear();
                adapterList.addAll(searchList);
                adapter.notifyDataSetChanged();
                return true;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    adapterList.clear();
                    adapterList.addAll(allSight);
                    adapter.notifyDataSetChanged();
                    return true;

                } else {
                    return false;

                }
            }


        });
        return true;
    }

    //sort function
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sort_rating:
                adapter.sort(SightAdapter.SORT_METHOD_RATING);
                return true;
            case R.id.sort_numReviews:
                adapter.sort(SightAdapter.SORT_METHOD_NUMREVIEWS);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}