package au.edu.unsw.infs3634.tourismguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SightAdapter extends RecyclerView.Adapter<SightAdapter.ViewHolder> {
    public static final int SORT_METHOD_RATING = 1;
    public static final int SORT_METHOD_NUMREVIEWS = 2;

    ArrayList<Sight> mLists;
    Context context;
    private OnItemClickListener onItemClickListener;

    public SightAdapter(Context context, ArrayList<Sight> mLists) {
        this.context = context;
        this.mLists = mLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sight, parent, false);
        return new ViewHolder(view);
    }

    // display all the data form Sight
    // call by RecyclerView to diplay data at the specified position
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Sight item = mLists.get(position);

        int image = context.getResources().getIdentifier(item.getImageName(),
                "drawable", "com.example.attractions");
        holder.iv_logo.setImageResource(image);
        holder.tv_rating.setText(item.getRating() + " " + item.getRatingDescription());
        holder.tv_ratingdes.setText(item.getAttractionType());
        holder.tv_location.setText(item.getLocation());
        holder.tvTitle.setText(item.getSightName());
        holder.tv_numberview.setText(item.getNumReviews() + "" + " Reviews ");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mLists.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    //sort function
    // sort rating from highest to lowest
    //sort num reviews from lowest to highest
    public void sort(final int sortMethod) {
        if (mLists.size() > 0) {
            Collections.sort(mLists, new Comparator<Sight>() {

                public int compare(Sight o1, Sight o2) {
                    if (sortMethod == SORT_METHOD_RATING) {
                        return o2.getRating().compareTo(o1.getRating());
                    } else if (sortMethod == SORT_METHOD_NUMREVIEWS) {
                        return Integer.compare(o1.getNumReviews(), o2.getNumReviews());

                    }
                    return Integer.compare(o1.getNumReviews(), o2.getNumReviews());
                }
            });

            notifyDataSetChanged();

        }

    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tv_rating;
        TextView tv_ratingdes;
        TextView tv_numberview;
        TextView tv_location;
        ImageView iv_logo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_name);
            tv_rating = itemView.findViewById(R.id.tv_rating);
            tv_ratingdes = itemView.findViewById(R.id.tv_ratingdes);
            tv_location = itemView.findViewById(R.id.tv_location);
            tv_numberview = itemView.findViewById(R.id.tv_numberview);
            iv_logo = itemView.findViewById(R.id.iv_logo);
        }
    }

}