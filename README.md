# FragmentLifecycler Images
![FragmentLifecycler Images](https://github.com/dotrinhdev/FragmentLifecycler/blob/master/Fragment%20LifeCycle.jpg)


public class MainActivity extends Activity {
    Button btnSearchWord;
    Button btnSearchKanji;
    private final String TAG = getClass().getSimpleName();
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSearchWord = (Button) findViewById(R.id.btnSearchWord);
        btnSearchKanji = (Button) findViewById(R.id.btnSearchKanji);

        manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, new SearchWord(), "SearchWord");
        transaction.commit();

        btnSearchKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.container, new SearchKanji(), "SearchKanji");
                transaction.commit();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
