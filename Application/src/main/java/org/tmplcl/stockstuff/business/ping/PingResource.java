package org.tmplcl.stockstuff.business.ping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingResource {

	private Ping ping;

	@Autowired
	public PingResource(Ping ping) {
		this.ping = ping;
	}

	@RequestMapping("api/ping2")
	public Ping ping() {
		return this.ping;
	}

}
