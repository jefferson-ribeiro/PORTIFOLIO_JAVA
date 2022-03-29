package exercicio07;

public class MostraRelogio {

	public static void main(String[] args) {

		// hora padrão
		Relogio r1 = new Relogio(24, 59, 59);

		// inserir outra hora

		// hora
		if (r1.setHora(23)) {
			System.out.println("Horas atualizados");
		} else {
			System.out.println("Horas incorretos");
		}
		// minutos
		if (r1.setMinutos(59)) {
			System.out.println("Minutos atualizados");
		} else {
			System.out.println("Minutos incorretos");
		}

		// segundos
		if (r1.setSegundos(59)) {
			System.out.println("Segundos atualizados");
		} else {
			System.out.println("Segundos incorretos");
		}

		System.out.println("Hora atual: " + r1.getHoraAtual());

	}

}
