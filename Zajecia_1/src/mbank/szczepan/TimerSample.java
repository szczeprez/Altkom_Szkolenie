package mbank.szczepan;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerSample {

	/**
	 * Prezentacja strona 327.
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		final int delayInMs = 10000;
		System.out.println("Strat ...");

		Date timeToRun = new Date(System.currentTimeMillis() + delayInMs);

		Timer timer = new Timer();
		/*
		 * Klasa anomimowa poni¿ej new TimerTask();
		 */
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("jestem w klasie run()");
			}

		}, timeToRun);
		for (int i = 0; i < 10; i++) {
			System.out.println(". ." + i);
			Thread.sleep(100);

		}
	}

}
