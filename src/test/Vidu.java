package test;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import com.vq.TestLo;

public class Vidu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 1;
		while (true) {
			x= sc.nextInt();
			File file = new File("E:\\JavaNew\\Test\\src\\com\\vq\\vine-boom2.wav");
			try {
				AudioInputStream audio = AudioSystem.getAudioInputStream(file);
				Clip clip = AudioSystem.getClip();
				clip.open(audio);
				if(x==2)
				clip.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
