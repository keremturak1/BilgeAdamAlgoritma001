package lesson014;

public class Main {

	public static void main(String[] args) {

		// Account sınıfımız olsun sınıfımız attributeleri
		// accountNo, money

		// paraYatir()
		// paraCekMethodu()

		// paraYatir() -->hesabamızı bizim belirttiğimiz miktarda para eklencek
		// paraCekMethodu() -->hesabamızdan bizim belirttiğimiz miktarda para düşücek

		// bakiye 0
		// paraYatir() --> 100 tl yatırdınız güncel bakiyeniz 100
		// paraCekMethodu() --> 50 tl hesaptan para çektiniz güncel bakiyeniz 50

		// para çekmek istediğimiz zaman hesapta o kadar para yoksa çekmemize izin
		// vermesin
		// para yatırırıken max 10.000tl limit

		// AccountManager sınıf oluşturalım para cek ve para yatır methodlarını
		// AccountManager sınıfına taşıyalım

		// AccountManager sınıfında bilgileri göster methodu
		// hesapnomuzu ve güncel bakiyemizi

		// User sınıfı oluşturalım
		// String name, surname, email, Account account
		// mainde user oluştururken birde accountu verelim

		// kullanıcıdan aldıgımız name ve surname değerleri ile
		// otomatik @xbanka.com uzantılı mail oluşturalım
		// Xbanka
		// name.surname@xbanka.com

		// User olarak
		// krediBaşvurusunuda bulunalım
		// krediyi çekeceği accountu bir de ne kadar kredi istiyorsa, miktar

		// Account sınıfının içinde
		// private boolean krediBasvurusu
		// private int istenenKrediMiktari --> 10.000
		// krediBasvurusndaBulun() --> Account account, int para
		// UserManager içinde yazalım

		// AdminManager sınıfı oluşturalım
		// krediBasvurusunuOnayla();
		// kredibaşvurusnun olması lazım
		// bizim hesabımızı çekmek istediğimiz kadar kredimiktarı hesabımıza düşsün
		
		//KrediBasvurusunuReddet()
		//kredibaşvurusnun olması lazım
		
		//krediBorcunuÖde()
		//dışardan nakit ödeme
		//eğer user'ın çekmiş oldugu kredi yoksa ve ya kredi başvurusu reddilmiş ise
		//işleminizi gerçekleştiremiyoruz
		//çekilmiş kredi varsa parametre olarak girdiğimiz miktar kadar ödeme yapmış olalım
		//ve kredi kartı borcundan düşülsün
		//çıktı olarak--> güncel kredi kartı borcunuz ....TL.
		
		//hesaptan kredi borcunu öde();
		
		//Nakit avas çekicez
		//nakit avans çekmemiz için kredi notunun 50 den yüksek olması gerek
		//eğer 50 den fazla ise  hesaptaki paranın yarısı kadar nakit avans almış olucaz
		//50 den az ise kredi notumuz yetersizdir ve kredi nootunu bastıralım
		
		

		AccountManager accountManager = new AccountManager();
		UserManger userManger = new UserManger();
		AdminManager adminManager = new AdminManager();

		Account account = new Account();
		account.setMoney(30000);
		accountManager.accountDetails(account);

		Account account2 = new Account();
		account2.setMoney(20000);
		accountManager.accountDetails(account2);

		
		User user1 = new User("ahmet", "yaz", account);
		System.out.println(user1.getAccount().getMoney());

		User user2 = new User();
		user2.setEmail("asd@gmail.com");
		user2.setName("mehmet");
		user2.setSurname("kış");
		user2.setAccount(account2);
		System.out.println(user2.getAccount().getMoney() + " " + user2.getEmail());

		

		System.out.println("*****************");
		System.out.println(account.getMoney());
		userManger.krediBasvurusundaBulun(account, 17500);
		
		adminManager.krediBasvurusunuOnayla(account);
		adminManager.krediBasvurusunuReddet(account);
		adminManager.krediBasvurusunuOnayla(account);
		System.out.println(account.getMoney());
		

		System.out.println("*****************");
		userManger.krediBasvurusundaBulun(account2, 25000);

		adminManager.krediBasvurusunuOnayla(account2);
		adminManager.krediBasvurusunuReddet(account2);
		
		userManger.krediBorcunuOde(account2, 30000);
		System.out.println(account2.getMoney());
		userManger.hesaptanKrediBorcunuOde(account2, 1000);
		System.out.println(account2.getMoney());
		userManger.nakitAvansBasvurusundaBulun(account2, 5000);
		System.out.println(account2.getNakitAvansBorcu());
	
		
		


	}

}
