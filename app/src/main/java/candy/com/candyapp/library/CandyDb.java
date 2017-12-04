package candy.com.candyapp.library;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import candy.com.candyapp.library.util.QueryBuilder;

/**
 * Created by hakan on 12/4/17.
 */


public class CandyDb extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "traitsDB";
    private static final int DATABASE_VERSION = 1;



    private static CandyDb sInstance;


    private CandyDb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized CandyDb getInstance(Context context) {

        if (sInstance == null) {
            sInstance = new CandyDb(context.getApplicationContext());
        }
        return sInstance;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        Log.v("TABLO OLUSTU","OPINION");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        

        onCreate(sqLiteDatabase);
    }


}
