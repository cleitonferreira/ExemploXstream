package br.com.nuvemapp.exemploxstream;

import com.thoughtworks.xstream.XStream;

import br.com.nuvemapp.exemploxstream.model.Editora;
import br.com.nuvemapp.exemploxstream.model.Endereco;
import br.com.nuvemapp.exemploxstream.model.Livro2;

public class SerializaDeserializaObjetoComposto {

	public static void main(String[] args) {
		XStream xstream = new XStream();
		Endereco endereco = new Endereco(100, "Wall Street", "123456-789");
		Editora editora = new Editora("Abril", endereco);
		Livro2 livro = new Livro2(2000, "Assim Falou Zaratustra", "123", editora);
		xstream.alias("livro", Livro2.class);
		xstream.alias("editora", Editora.class);
		xstream.alias("endereco", Endereco.class);
		String xml = xstream.toXML(livro);
		System.out.println("--- XML --- \n"); 
		System.out.println(xml);

		System.out.println("\n --- Objeto Livro --- \n");
		Livro2 novoLivro = (Livro2) xstream.fromXML(xml);
		System.out.println("Titulo = " + novoLivro.getTitulo());
		System.out.println("Ano = " + novoLivro.getAno());
		System.out.println("ISBN = " + novoLivro.getIsbn());
		System.out.println("Editora = " + novoLivro.getEditora().getNome());
		System.out.println("Endereco = " + novoLivro.getEditora().getEndereco().getCep());
		System.out.println("Logradouro = " + novoLivro.getEditora().getEndereco().getLogradouro());
	}
}
