package br.com.nuvemapp.exemploxstream;

import com.thoughtworks.xstream.XStream;

import br.com.nuvemapp.exemploxstream.model.Livro;

public class SerializaDeserializaXML {

	public static void main(String[] args) {
		XStream xstream = new XStream();
        Livro livro = new Livro(2000, "Assim Falou Zaratustra", "123");
        // Serializando objeto
        xstream.alias("livro", Livro.class);
        String xml = xstream.toXML(livro);
        
        // Deserializando objeto
        Livro novoLivro = (Livro)xstream.fromXML(xml);

        System.out.println("Titulo = " + novoLivro.getTitulo());
        System.out.println("Ano = " + novoLivro.getAno());
        System.out.println("ISBN = " + novoLivro.getIsbn());
	}

}
