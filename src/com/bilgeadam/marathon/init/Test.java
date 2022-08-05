package com.bilgeadam.marathon.init;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.bilgeadam.marathon.dao.EntityController;
import com.bilgeadam.marathon.entity.Account;
import com.bilgeadam.marathon.entity.AccountType;
import com.bilgeadam.marathon.entity.Branch;
import com.bilgeadam.marathon.entity.Customer;
import com.bilgeadam.marathon.entity.ProcessDetail;
import com.bilgeadam.marathon.entity.Process;
import com.bilgeadam.marathon.utils.HibernateSession;

public class Test {
	
	public static void main(String[] args) {

		initEntity();
		
		
	}
	
	
	
	
	public static void initEntity() {
		
		EntityController<Account> accountController = new EntityController<Account>();
		EntityController<AccountType> accountTypeController = new EntityController<AccountType>();
		EntityController<Branch> branchController = new EntityController<Branch>();
		EntityController<Customer> customerController = new EntityController<Customer>();
		EntityController<Process> processController = new EntityController<Process>();
		EntityController<ProcessDetail> processDetailController = new EntityController<ProcessDetail>();
		Collection<Process> aliEuroProcessList = new ArrayList<>();
		Collection<Process> aliTlProcessList = new ArrayList<>();
		Collection<Process> ayseTlProcessList = new ArrayList<>();
		Collection<Process> ayseDolarProcessList = new ArrayList<>();
		
		Customer customer = new Customer("100","Ali KARA");
		Customer customer2 = new Customer("101","Ayþe SARI");
		
		Branch branch = new Branch("74","Bartýn");
		Branch branch2 = new Branch("67","Zonguldak");
		Branch branch3 = new Branch("78", "Karabük");
		
		Account account = new Account(7410010); 
		Account account2 = new Account(6710011);
		Account account3 = new Account(7810112);
		Account account4 = new Account(7410110);
		
		AccountType accountType = new AccountType("TL",10);
		AccountType accountType2 = new AccountType("EURO",11);
		AccountType accountType3 = new AccountType("USD",12);
		
		Process process = new Process("100001");
		Process process2 = new Process("100002");
		Process process3 = new Process("100003");
		Process process4 = new Process("100025");
		Process process5 = new Process("100058");
		Process process6 = new Process("101005");
		Process process7 = new Process("101048");
		
		aliTlProcessList.add(process);
		aliTlProcessList.add(process2);
		aliTlProcessList.add(process3);
		aliEuroProcessList.add(process4);
		
		ayseDolarProcessList.add(process5);
		ayseTlProcessList.add(process6);
		ayseTlProcessList.add(process7);
		
		
		
		ProcessDetail processDetail = new ProcessDetail("ATMden para yatirma", 400, LocalDate.of(2022, 1, 2));
		ProcessDetail processDetail2 = new ProcessDetail("ATMden para cekme", -200, LocalDate.of(2022, 1, 25));
		ProcessDetail processDetail3 = new ProcessDetail("Internetten fatura odeme", -89, LocalDate.of(2022, 1, 20));
		ProcessDetail processDetail4 = new ProcessDetail("Subeden para yatirma", 200, LocalDate.of(2022, 1, 15)); //euro
		ProcessDetail processDetail5 = new ProcessDetail("ATMden para cekme", -100, LocalDate.of(2022, 2, 2)); //dolar
		ProcessDetail processDetail6 = new ProcessDetail("Subeden para yatirma", 200, LocalDate.of(2022, 1, 20));
		ProcessDetail processDetail7 = new ProcessDetail("Internetten fatura odeme", -115, LocalDate.of(2022, 1, 20));
		
		account.setBranch(branch);
		account.setCustomer(customer);
		account.setAccountType(accountType);
		account.setProcessList(aliTlProcessList);
		
		account2.setBranch(branch2);
		account2.setCustomer(customer);
		account2.setAccountType(accountType2);
		account2.setProcessList(aliEuroProcessList);
		
		account3.setBranch(branch3);
		account3.setCustomer(customer2);
		account3.setAccountType(accountType3);
		account3.setProcessList(ayseDolarProcessList);
		
		account4.setBranch(branch);
		account4.setCustomer(customer2);
		account4.setAccountType(accountType);
		account4.setProcessList(ayseTlProcessList);
		
				
		process.setAccount(account);
		process.setProcessDetail(processDetail);
		
		process2.setAccount(account);
		process2.setProcessDetail(processDetail2);
		
		process3.setAccount(account);
		process3.setProcessDetail(processDetail3);
		
		process4.setAccount(account2);
		process4.setProcessDetail(processDetail4);
		
		process5.setAccount(account3);
		process5.setProcessDetail(processDetail5);
		
		process6.setAccount(account4);
		process6.setProcessDetail(processDetail6);
		
		process7.setAccount(account4);
		process7.setProcessDetail(processDetail7);
		
		
		processDetail.setProcess(process);
		processDetail2.setProcess(process2);
		processDetail3.setProcess(process3);
		processDetail4.setProcess(process4);
		processDetail5.setProcess(process5);
		processDetail6.setProcess(process6);
		processDetail7.setProcess(process7);
		
		
		
		 ////
		accountTypeController.create(accountType);
		accountTypeController.create(accountType2);
		accountTypeController.create(accountType3);
		
		branchController.create(branch);
		branchController.create(branch2);
		branchController.create(branch3);
		
		customerController.create(customer);
		customerController.create(customer2);
		
		accountController.create(account);
		accountController.create(account2);
		accountController.create(account3);
		accountController.create(account4);
		
		processController.create(process);
		processController.create(process2);
		processController.create(process3);
		processController.create(process4);
		processController.create(process5);
		processController.create(process6);
		processController.create(process7);
		
		processDetailController.create(processDetail);
		processDetailController.create(processDetail2);
		processDetailController.create(processDetail3);
		processDetailController.create(processDetail4);
		processDetailController.create(processDetail5);
		processDetailController.create(processDetail6);
		processDetailController.create(processDetail7);
		
		
		
		
		
	}
	
}
