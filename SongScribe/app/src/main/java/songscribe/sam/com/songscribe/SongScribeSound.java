package songscribe.sam.com.songscribe;

import android.media.MediaPlayer;

/**
 * Created by Cotty on 2/5/2015.
 */
public class SongScribeSound {

    public void playSound(){

        MediaPlayer mediaPlayer = MediaPlayer.create(, R.raw.test);
        mediaPlayer.start();

    }

}
