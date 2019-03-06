package com.capstone.milkteabooking.api;

/**
 * Created by lucky on 13-Sep-17.
 */

public class RetrofitService {

    public static <T> T getService(final Class<T> tClass) {
        return RetrofitClient.getClient().create(tClass);
    }

}
