package test.ban.com.test_android;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by brander on 2017/7/7.
 */

public class MyService extends IntentService {
    private static final String TAG = "MyService";

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public MyService() {
        super(MyService.class.getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "onHandleIntent: ");
    }
}
