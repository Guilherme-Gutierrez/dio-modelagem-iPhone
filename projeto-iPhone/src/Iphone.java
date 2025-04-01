
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void tocar() {
		System.out.println("iPhone tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("iPhone pausando música");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("A música " + musica + " foi selecionada");
		
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("iPhone ligando para o número " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("iPhone atendendo chamada");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iPhone iniciando correio de voz");
		
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página de acordo com a url: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}

}
