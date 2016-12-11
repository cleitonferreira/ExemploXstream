package br.com.nuvemapp.exemploxstream;

import com.thoughtworks.xstream.XStream;

import br.com.nuvemapp.exemploxstream.converter.LivroConverter2;
import br.com.nuvemapp.exemploxstream.model.Livro;

public class SerializacaoPersonalizadaXML {

	public static void main(String[] args) {
		Livro livro = new Livro(2000, "Assim Falou Zaratustra", "123");

		XStream xstream = new XStream();

		// Registrando novo conversor
		xstream.registerConverter(new LivroConverter2());
		// Registrando alias
		xstream.alias("livro", Livro.class);
		// Gerando XML
		String xml = xstream.toXML(livro);

		System.out.println("--- XML --- \n"); 
		System.out.println(xml);

	}

}
