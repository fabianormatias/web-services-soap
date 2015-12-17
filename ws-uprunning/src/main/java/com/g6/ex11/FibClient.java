package com.g6.ex11;

import utils.fibc.RabbitCounter;
import utils.fibc.RabbitCounterService;

class FibClient {
	public static void main(String[] args) {
		RabbitCounterService service = new RabbitCounterService();
		RabbitCounter port = service.getRabbitCounterPort();
		try {
			int n = -45;
			System.out.println("fib(" + n + ") = " + port.countRabbits(n));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}