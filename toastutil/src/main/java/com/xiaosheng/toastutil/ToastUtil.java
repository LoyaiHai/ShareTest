package com.xiaosheng.toastutil;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lenovo on 2019/7/24.
 * CurrentClassName:
 * CurrentClassExplain:
 * author:023
 */
public class ToastUtil {
    private static Toast toast;

    public static void show(Context context, CharSequence message) {
        if (toast == null) {
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        } else {
            toast.setText(message);
        }

        toast.show();
    }
}
