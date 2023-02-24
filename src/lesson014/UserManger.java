package lesson014;

public class UserManger {

	private final String emailFormat = "@xbanka.com";

	public void generetaAutoEmail(User user) {
		user.setEmail(
				user.getName().toLowerCase().replace(" ", ".") + '.' +
				user.getSurname().toLowerCase() + emailFormat);
	}

	public void alternatifOtomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
				.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;
		user.setEmail(otomatikOlusanEmail);
	}
	
	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		
		System.out.println(para + " Değerinde kredi başvursu yaptınız");
		System.out.println("Lütfen onay bekleyin... ");
		
	}
	public void nakitAvansBasvurusundaBulun(Account account, int para) {
		account.setNakitAvansDurum(true);
		account.setIstenenNakitAvans(para);
		
		System.out.println(para + " Değerinde nakit avans başvursu yaptınız");
		System.out.println("Lütfen onay bekleyin... ");
		if (account.getKrediNotu()<50) {
			System.out.println("nakit avans miktarı hesabınıza yatmıştır");
			account.setMoney(account.getMoney() + account.getIstenenNakitAvans());
			account.setNakitAvansDurum(false);
			account.setIstenenNakitAvans(0);
			account.setNakitAvansBorcu(account.getIstenenNakitAvans());
			System.out.println("nakit avans borcunuz"+account.getNakitAvansBorcu());
			
		}else {
			System.out.println("Kredi notunuz Nakit Avan için uygun değildir"+account.getKrediNotu());
			account.setNakitAvansDurum(false);
			account.setIstenenNakitAvans(0);
		}
	
	}
	public void krediBorcunuOde(Account account,int taksit){
		if (account.isKrediAlindimi()) {
			if (account.getKrediBorcu()<taksit) {
				System.out.println("kart borcunuz yatırılann miktradan fazla");
				
			}else {
			account.setKrediBorcu(account.getKrediBorcu()-taksit);
			System.out.println(taksit+"taksit kadar ödeme yazptınız"+account.getKrediBorcu());
			}
		}else {
			System.out.println("Kredi borcunuz bulunmamaktadır..");
		}
		}public void hesaptanKrediBorcunuOde(Account account,int taksit){
			if (account.isKrediAlindimi()) {
				if (account.getMoney()<=taksit ||account.getKrediBorcu()<taksit ) {
					System.out.println("kart borcunuz yatırılann miktradan fazla veya bakiyeniz yetersiz");
					
				}else {
				account.setKrediBorcu(account.getKrediBorcu()-taksit);
				account.setMoney(account.getMoney()-taksit);
				
				System.out.println(taksit+"taksit kadar ödeme yazptınız"+account.getKrediBorcu());
				}
			}else {
				System.out.println("Kredi borcunuz bulunmamaktadır..");
			}
		
		
		
	}

}