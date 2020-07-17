package it.dst.model;

import it.dst.service.MailService;

public class ScheduleCompito implements Runnable {
	private MailService email;
	private Compito compito;

	public ScheduleCompito(MailService email, Compito compito) {
		this.email = email;
		this.compito = compito;
	}

	@Override
	public void run() {
		Utente utente = compito.getUtente();
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
