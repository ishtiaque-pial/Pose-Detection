package com.example.posedetection;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedHelper {

    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;

    public static void putKey(Context context, String Key, String Value) {
        sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(Key, Value);
        editor.commit();

    }


    public static void putLongKey(Context context, String Key, long Value) {
        sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putLong(Key,Value);
        editor.commit();
    }
    public static long getLongKey(Context contextGetKey, String Key) {
        sharedPreferences = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        long Value = sharedPreferences.getLong(Key, 0);
        return Value;

    }

    public static void putIntKey(Context context, String Key, int Value) {
        sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt(Key,Value);
        editor.commit();

    }

    public static int getIntKey(Context contextGetKey, String Key) {
        sharedPreferences = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        int Value = sharedPreferences.getInt(Key, 0);
        return Value;

    }
    public static void putKey(Context context, String Key, boolean Value) {
        sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putBoolean(Key, Value);
        editor.commit();

    }

    public static String getKey(Context contextGetKey, String Key) {
        sharedPreferences = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        String Value = sharedPreferences.getString(Key, "");
        return Value;

    }
    public static boolean getBoolenKey(Context contextGetKey, String Key) {
        sharedPreferences = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        boolean Value = sharedPreferences.getBoolean(Key, false);
        return Value;

    }
    public static void putDoubleKey(Context context, String Key, double Value) {
        sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(Key, String.valueOf(Value));
        editor.commit();

    }
    public static double getDoubleKey(Context contextGetKey, String Key) {
        sharedPreferences = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        String temp="0";
        try{
            temp=sharedPreferences.getString(Key, "-1.0");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return -1.0f;
        }
        double Value = Double.parseDouble(temp);
        return Value;

    }
    public static void clearSharedPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().apply();
    }



}
