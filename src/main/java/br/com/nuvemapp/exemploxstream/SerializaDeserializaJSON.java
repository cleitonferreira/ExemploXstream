package br.com.nuvemapp.exemploxstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import br.com.nuvemapp.exemploxstream.model.Livro;

public class SerializaDeserializaJSON {

	public static void main(String[] args) {
		XStream xstream = new XStream(new JettisonMappedXmlDriver());
		xstream.setMode(XStream.NO_REFERENCES);
        Livro livro = new Livro(2000, "Assim Falou Zaratustra", "123");
        xstream.alias("livro", Livro.class);
        String json = xstream.toXML(livro);
        System.out.println("--- JSON --- \n"); 
        System.out.println(json);
        
		System.out.println("\n --- Objeto Livro --- \n");
        Livro novoLivro = (Livro)xstream.fromXML(json);
        System.out.println("Titulo = " + novoLivro.getTitulo());
        System.out.println("Ano = " + novoLivro.getAno());
        System.out.println("ISBN = " + novoLivro.getIsbn());
	}

}
