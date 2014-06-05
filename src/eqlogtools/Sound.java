package eqlogtools;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sound {
	
	static AudioClip trigger;

	public static void Play()
	{
		URL urlClick = Sound.class.getResource("/res/sound.wav");
		trigger = Applet.newAudioClip(urlClick);
	    trigger.play();
	}
}
