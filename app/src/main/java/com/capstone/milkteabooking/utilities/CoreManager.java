package com.capstone.milkteabooking.utilities;

import android.content.Context;
import android.util.Log;

import com.capstone.milkteabooking.models.User;


/**
 * Created by lucky on 15-Oct-17.
 */

public class CoreManager {
    private static User mUser = null;

    //    private static User mCurrentUser = null;
    private CoreManager() {

    }

    public static User getUser(Context context) {
        mUser = Utils.getUserInSharePref(context);
        if (mUser == null) {
            Log.d(AppConst.DEBUG_CORE_TAG, "get User from share prefef Null");
        }
        return mUser;
    }

    public static void setUser(Context context, User user) {
        Utils.saveUserInSharePref(context, user);

    }

    public static void clearUser(Context context) {
        Utils.saveUserInSharePref(context, null);
//         setCurrentUser(-1, context);
        mUser = null;
    }


}
