package lesson014;

public class Account {

	private String accountNo;
	private int money;

	private boolean krediBasvurusu;
	private int istenenKredi;
	private int krediBorcu;
	private boolean krediAlindimi;
	private int krediNotu;
	private int istenenNakitAvans;
	private boolean nakitAvansDurum;
	private int nakitAvansBorcu;

	public int getKrediNotu() {
		return krediNotu;
	}

	public void setKrediNotu(int krediNotu) {
		this.krediNotu = krediNotu;
	}

	public int getIstenenNakitAvans() {
		return istenenNakitAvans;
	}

	public void setIstenenNakitAvans(int istenenNakitAvans) {
		this.istenenNakitAvans = istenenNakitAvans;
	}

	public boolean isNakitAvansDurum() {
		return nakitAvansDurum;
	}

	public void setNakitAvansDurum(boolean nakitAvansDurum) {
		this.nakitAvansDurum = nakitAvansDurum;
	}public boolean getNakitAvansDurum() {
		return this.nakitAvansDurum;
	}

	public int getNakitAvansBorcu() {
		return nakitAvansBorcu;
	}

	public void setNakitAvansBorcu(int nakitAvansBorcu) {
		this.nakitAvansBorcu = nakitAvansBorcu;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getKrediBorcu() {
		return krediBorcu;
	}

	public void setKrediBorcu(int krediBorcu) {
		this.krediBorcu = krediBorcu;
	}

	public boolean isKrediAlindimi() {
		return krediAlindimi;
	}

	public void setKrediAlindimi(boolean krediAlindimi) {
		this.krediAlindimi = krediAlindimi;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public int getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(int istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//	public void depositMoney(int money) {
//		if (money > 0 && money <= 10000) {
//			this.setMoney(this.getMoney() + money);
//			System.out.println(money + " para hesaba yatırıldı güncel bakiyeniz " + this.getMoney());
//		} else {
//			System.err.println("Sadece 1 ile 10.000 tl Arasında işlem yapabilirsiniz");
//		}
//	}
//
//	public void withdrawMoney(int money) {
//		if (money > this.getMoney()) {
//			System.err.println("Yetersiz bakiye");
//		} else {
//			this.setMoney(this.getMoney() - money);
//			System.out.println(money + " para hesaptan çekildi güncel bakiyeniz " + this.getMoney());
//		}
//	}

	
}