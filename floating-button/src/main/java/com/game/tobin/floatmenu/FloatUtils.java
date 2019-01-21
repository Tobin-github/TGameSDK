package com.game.tobin.floatmenu;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 工具类
 * 
 * Created by Tobin on 2017/8/16.
 *
 */
public class FloatUtils {
	public static int dip2px(Context context, float dpValue) {
		float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}


	// 设置悬浮按钮位置
	protected static void setFloatMenuOrigin(Context ctx, int x, int y) {
	    if (ctx == null){
	        return;
        }
		SharedPreferences sp = ctx.getSharedPreferences("Tobin_Float_Menu_Origin", 0);
		sp.edit().putInt("FloatMenuOriginX", x).putInt("FloatMenuOriginY", y).commit();
	}

	// 获得悬浮窗初始化位置
	protected static int[] getFloatMenuOrigin(Context ctx) {
        if (ctx == null){
            return null;
        }
		SharedPreferences sp = ctx.getSharedPreferences("Tobin_Float_Menu_Origin", 0);
		int x = sp.getInt("FloatMenuOriginX", -1);
		int y = sp.getInt("FloatMenuOriginY", -1);
		if (x < 0 || y < 0)
			return null;
		return new int[] { x, y };
	}


}
