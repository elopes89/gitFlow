package m2Semana1;

public class TestaBanco {
	
	public static void main(String[] args) {

		Banco pinheiraMoney = new Banco();

		Conta conta1 = new Conta();
		conta1.setNumero("111");
		conta1.setSaldo(150);

		Conta conta2 = new Conta();
		conta2.setNumero("222");
		conta2.setSaldo(1500);

		Conta conta3 = new Conta();
		conta3.setNumero("333");
		conta3.setSaldo(800);

		Conta conta4 = new Conta();
		conta4.setNumero("444");
		conta4.setSaldo(8000);

		Conta conta5 = new Conta();
		conta4.setNumero("555");
		conta4.setSaldo(10000);

		pinheiraMoney.getContas().add(conta1);
		pinheiraMoney.getContas().add(conta2);
		pinheiraMoney.getContas().add(conta3);
		pinheiraMoney.getContas().add(conta4);
		pinheiraMoney.getContas().add(conta5);

		System.out.println(pinheiraMoney.transferencia("111", "555", 500000));
		System.out.println(pinheiraMoney.transferencia("555", "222", 100));
		System.out.println(pinheiraMoney.transferencia("222", "333", 50));

		System.out.println(pinheiraMoney.achaConta("111").getSaldo());
		System.out.println(pinheiraMoney.achaConta("222").getSaldo());
		System.out.println(pinheiraMoney.achaConta("555").getSaldo());

	}

}
