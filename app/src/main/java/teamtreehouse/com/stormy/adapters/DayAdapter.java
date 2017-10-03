package teamtreehouse.com.stormy.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import teamtreehouse.com.stormy.weather.Day;

/**
 * Created by chrisgaona on 10/3/17.
 */

public class DayAdapter extends BaseAdapter {
    private Context mContext;
    private Day[] mDays;

    public DayAdapter(Context context, Day[] days) {
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int i) {
        return mDays[i];
    }

    @Override
    public long getItemId(int i) {
        return 0; // we aren't going to use this. Tag items for easy reference
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
