package binus.com.genshinguide;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mimage;
    TextView mtitle, mdesc;



    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mimage = itemView.findViewById(R.id.imageIv);
        this.mtitle = itemView.findViewById(R.id.titleTv);
        this.mdesc = itemView.findViewById(R.id.descriptionTv);


    }
}
