package com.dreamworks.javabased;

import java.util.List;

public interface AccountDao {

	public void insert(Account account);
	public void update(Account account);
	public void update(List<Account> accounts);
	public void delete(long accountID);
	public Account find(long accountID);
	public List<Account> find(List<Long> accountIds);
	public List<Account> find(String ownerName);
	public List<Account> find(boolean locked);
}
