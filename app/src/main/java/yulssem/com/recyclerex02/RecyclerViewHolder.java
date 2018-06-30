package yulssem.com.recyclerex02;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public CheckBox likeBt, shareBt;
    public ImageView photo;
    public TextView title;
    public RecyclerAdepter adepter;

    public RecyclerViewHolder(View itemView, RecyclerAdepter adepter) {
        super(itemView);
        this.adepter = adepter;
        likeBt = itemView.findViewById(R.id.bt_like);
        shareBt = itemView.findViewById(R.id.bt_share);
        photo = itemView.findViewById(R.id.iv_photo);
        title = itemView.findViewById(R.id.tv_tit);
    }
}
