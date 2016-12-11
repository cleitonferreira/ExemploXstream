package br.com.nuvemapp.exemploxstream;

import com.thoughtworks.xstream.XStream;

import br.com.nuvemapp.exemploxstream.model.Livro;

public class DeserializacaoNovoCampo {

	public static void main(String[] args) {

		StringBuilder xml = new StringBuilder();
		xml.append("<livro><ano>2000</ano>");
		xml.append("<titulo>Assim Falou Zaratustra</titulo>");
		xml.append("<isbn>123</isbn>");
		xml.append("<valor>10.0</valor>");
		xml.append("</livro>");

		XStream xstream = new XStream();
		xstream.alias("livro", Livro.class);

		System.out.println(" --- Objeto Livro --- \n");
		Livro novoLivro = (Livro) xstream.fromXML(xml.toString());
		System.out.println("Titulo = " + novoLivro.getTitulo());
		System.out.println("Ano = " + novoLivro.getAno());
		System.out.println("ISBN = " + novoLivro.getIsbn());
		
		/**
		 * será lançada a seguinte exceção:
		 * Exception in thread "main" com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$UnknownFieldException: 
		 * No such field br.com.nuvemapp.exemploxstream.model.Livro.valor
		 */
		
	}

}
