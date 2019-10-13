package org.tmplcl.stockstuff.business.stock;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockResource {

	List<Stock> stockData;

	public StockResource() {
		this.stockData = List.of(
				new Stock(LocalDate.of(2019, 1, 1), new BigDecimal("100.2"), new BigDecimal("103.1"), "MSFT"),
				new Stock(LocalDate.of(2019, 1, 2), new BigDecimal("100.5"), new BigDecimal("105.5"), "MSFT"),
				new Stock(LocalDate.of(2019, 1, 3), new BigDecimal("99.0"), new BigDecimal("100.7"), "MSFT"));
	}

	@RequestMapping("api/stocks")
	public List<Stock> stocks() {
		return this.stockData;
	}

}
