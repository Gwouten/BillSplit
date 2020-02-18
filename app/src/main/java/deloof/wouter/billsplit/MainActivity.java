package deloof.wouter.billsplit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import deloof.wouter.billsplit.utils.TabPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabPagerAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link elementen in layout view
        AppBarLayout appbar = findViewById(R.id.appbar);
        Toolbar toolbar = findViewById(R.id.billSplitToolbar);
        setSupportActionBar(toolbar);

        // setup adapter
        adapter = new TabPagerAdapter(getSupportFragmentManager());

        viewPager = findViewById(R.id.frag_container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tl_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
