package lesson014;

public class AccountManager {

	public void depositMoney(Account account, int money) {
		if (money > 0 && money <= 10000) {
			account.setMoney(account.getMoney() + money);
			System.out.println(money + " Tl para hesaba yatırıldı güncel bakiyeniz " + account.getMoney());
		} else {
			System.err.println("Sadece 1 ile 10.000 tl Arasında işlem yapabilirsiniz");
		}
	}
	
	public void withdrawMoney(Account account,int money) {
		if (money > account.getMoney()) {
			System.err.println("Yetersiz bakiye");
		} else {
			account.setMoney(account.getMoney() - money);
			System.out.println(money + " Tl para hesaptan çekildi güncel bakiyeniz " + account.getMoney());
		}
	}
	
	public void accountDetails(Account account) {
		System.out.println("Hesap No: " + account.getAccountNo() + " Güncel Bakiyeniz: "+ account.getMoney());
	}
}