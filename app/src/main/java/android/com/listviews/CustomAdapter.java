package android.com.listviews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dexter John Datul on 06/08/2017.
 */

class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        View customView = layoutInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView textView = (TextView) customView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageView);

        textView.setText(singleFoodItem);
        imageView.setImageResource(R.mipmap.joke);

        return customView;
    }
}
