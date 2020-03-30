package com.example.homework2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private ArrayList<Restaurant> mRestaurants;

    public RestaurantAdapter(ArrayList<Restaurant> restaurants) {
        mRestaurants = restaurants;
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        public TextView name, cuisine, location, rating;

        public RestaurantViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.tvName);
            cuisine = v.findViewById(R.id.tvCuisine);
            location = v.findViewById(R.id.tvLocation);
            rating = v.findViewById(R.id.tvRating);
        }
    }
    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_row, parent, false);
        return new RestaurantViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant restaurant = mRestaurants.get(position);
        holder.name.setText(restaurant.getName());
        holder.cuisine.setText(restaurant.getCuisine());
        holder.location.setText(restaurant.getLocation());
        holder.rating.setText(String.valueOf(restaurant.getRating()));
    }

    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }
}
