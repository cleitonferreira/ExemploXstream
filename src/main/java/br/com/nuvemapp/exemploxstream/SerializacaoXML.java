package br.com.nuvemapp.exemploxstream;

import com.thoughtworks.xstream.XStream;

import br.com.nuvemapp.exemploxstream.model.Livro;

public class SerializacaoXML {

	public static void main(String[] args) {
		XStream xstream = new XStream();
        Livro livro = new Livro(2000, "Assim Falou Zaratustra", "123");
        String xml = xstream.toXML(livro);
        System.out.println("--- Serializando objeto Livro ---"); 
        System.out.println(xml);
	}

}
