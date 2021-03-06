package org.xvdr.recordings.presenter;

import android.content.Context;
import android.support.v17.leanback.widget.AbstractDetailsDescriptionPresenter;

import org.xvdr.robotv.R;
import org.xvdr.robotv.client.model.Event;
import org.xvdr.robotv.client.model.Movie;

public class DetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter {
    @Override
    protected void onBindDescription(ViewHolder viewHolder, Object item) {
        Movie movie = (Movie) item;

        if(movie == null) {
            return;
        }

        if(movie.isTvShow()) {
            viewHolder.getTitle().setText(movie.getShortText());

            String desc = movie.getDescription();
            Event.SeasonEpisodeHolder episode = movie.getSeasionEpisode();
            if(episode.valid()) {
                Context context = viewHolder.view.getContext();
                desc += "\n";
                desc += context.getString(R.string.season_episode, episode.season, episode.episode);
            }
            viewHolder.getBody().setText(desc);
            return;
        }

        viewHolder.getTitle().setText(movie.getTitle());
        viewHolder.getSubtitle().setText(movie.getShortText());
        viewHolder.getBody().setText(movie.getDescription());
    }
}
