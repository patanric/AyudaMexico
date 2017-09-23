package io.github.erikcaffrey.ayudamexico.announcement.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.erikcaffrey.ayudamexico.R;
import io.github.erikcaffrey.ayudamexico.announcement.model.Announcement;
import io.github.erikcaffrey.ayudamexico.common.BaseAdapter;
import io.github.erikcaffrey.ayudamexico.common.BaseViewHolder;

/**
 * Created by silmood on 9/22/17.
 */

public class AnnouncementAdapter extends BaseAdapter<Announcement> {

    public AnnouncementAdapter() {
        super(R.layout.item_announcement);
    }

    @Override
    public BaseViewHolder<Announcement> getViewHolder(View view) {
        return new AnnouncementHolder(view);
    }

    class AnnouncementHolder extends BaseViewHolder<Announcement> {

        @BindView(R.id.label_place)
        TextView place;

        @BindView(R.id.label_announcement)
        TextView announcement;

        @BindView(R.id.label_contact)
        TextView contact;

        @BindView(R.id.label_update)
        TextView update;

        @BindView(R.id.button_map)
        Button map;

        Announcement item;

        public AnnouncementHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void bindItem(Announcement item) {
            this.item = item;
            int mapVisibility = item.getMap().isEmpty() ? View.GONE : View.VISIBLE;
            map.setVisibility(mapVisibility);

            place.setText(item.getPlace());
            announcement.setText(item.getAnnouncement());
            contact.setText(item.getContact());
            update.setText(item.getUpdated());
        }

        @OnClick(R.id.button_map)
        public void showMap() {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(item.getMap()));
            if (i.resolveActivity(itemView.getContext().getPackageManager()) != null) {
                itemView.getContext().startActivity(i);
            }
        }
    }
}
