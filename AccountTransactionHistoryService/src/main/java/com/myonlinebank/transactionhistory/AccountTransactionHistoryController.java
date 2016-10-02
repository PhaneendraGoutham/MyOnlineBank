/**
 * 
 */
package com.myonlinebank.transactionhistory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aman
 *
 */

@RestController
@RequestMapping("/transactionhistoryservice")
public class AccountTransactionHistoryController {
	
	@GetMapping(value="/transactions", produces="application/JSON")
	public List<TransactionHistory> getTransactionHistory(){
		List<TransactionHistory>  transactionList = new ArrayList<>();
		transactionList.add(new TransactionHistory(22.00, "Chicago Deep Dish Pizza", new Date()));
		transactionList.add(new TransactionHistory(10.00, "Train Ride", new Date()));
		return transactionList;
	}

}
