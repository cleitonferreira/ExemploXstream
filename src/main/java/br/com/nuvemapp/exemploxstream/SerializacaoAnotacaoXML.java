package br.com.nuvemapp.exemploxstream;

import com.thoughtworks.xstream.XStream;

import br.com.nuvemapp.exemploxstream.model.Livro4;

public class SerializacaoAnotacaoXML {

	public static void main(String[] args) {

		XStream xstream = new XStream();
		xstream.processAnnotations(Livro4.class);
		Livro4 livro = new Livro4(2000, "Assim Falou Zaratustra", "123", 10.0);
		String xml = xstream.toXML(livro);
		System.out.println("--- XML --- \n"); 
		System.out.println(xml);
	}

}
