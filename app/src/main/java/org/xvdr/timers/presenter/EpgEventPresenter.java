package org.xvdr.timers.presenter;

import android.content.Context;
import android.support.v17.leanback.widget.ImageCardView;
import android.support.v17.leanback.widget.Presenter;
import android.text.TextUtils;

import org.xvdr.robotv.client.Connection;
import org.xvdr.robotv.client.model.Movie;
import org.xvdr.recordings.presenter.MoviePresenter;
import org.xvdr.recordings.util.Utils;
import org.xvdr.robotv.R;

public class EpgEventPresenter extends MoviePresenter {

    public EpgEventPresenter(Connection connection) {
        super(connection);
    }

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        Movie movie = (Movie) item;
        MoviePresenter.ViewHolder vh = (MoviePresenter.ViewHolder) viewHolder;
        ImageCardView cardView = vh.getCardView();
        Context context = cardView.getContext();

        cardView.setTitleText(movie.getTitle());
        String subText = movie.getDateTime() + (TextUtils.isEmpty(movie.getShortText()) ? "" : " - " + movie.getShortText());

        cardView.setContentText(subText);

        cardView.setMainImageDimensions(266, 400);
        cardView.setInfoAreaBackgroundColor(Utils.getColor(context, R.color.primary_color));

        vh.update(movie, connection, context);
    }
}
