package us.sayederfanarefin.model;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import us.sayederfanarefin.R;

/**
 * Created by erfanarefin on 30/08/2017.
 */

public class friends_recycler_view extends RecyclerView.ViewHolder {
    final TextView name;
    final TextView mood;
    final TextView phone;
    final ImageView invite_friend_user_image;


    public friends_recycler_view(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.friend_list_without_button_item_name);
        mood = itemView.findViewById(R.id.friend_list_without_button_item_status);
        phone = itemView.findViewById(R.id.friend_list_without_button_item_user_id);
        invite_friend_user_image = itemView.findViewById(R.id.message_profile_image_without_button);
    }

    public void name(String namee){
        this.name.setText(namee);
    }

    public void mood(String mood){
        this.mood.setText(mood);
    }
    public void phone(String phone){
        this.phone.setText(phone);
    }
    public void invite_friend_user_image(Image image){
      //  this.invite_friend_user_image.setImageBitmap(image);
    }
}
