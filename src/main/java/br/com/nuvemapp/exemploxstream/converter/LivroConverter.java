package br.com.nuvemapp.exemploxstream.converter;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import br.com.nuvemapp.exemploxstream.model.Livro;

public class LivroConverter implements Converter {

	public boolean canConvert(Class clazz) {
		return clazz.equals(Livro.class);
	}

	public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
	}

	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {

		Livro livro = new Livro();
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			if ("ano".equals(reader.getNodeName())) {
				Integer ano = (Integer) context.convertAnother(livro, Integer.class);
				livro.setAno(ano);
			} else if ("titulo".equals(reader.getNodeName())) {
				String titulo = (String) context.convertAnother(livro, String.class);
				livro.setTitulo(titulo);
			} else if ("isbn".equals(reader.getNodeName())) {
				String isbn = (String) context.convertAnother(livro, String.class);
				livro.setIsbn(isbn);
			}
			reader.moveUp();
		}

		return livro;
	}

}
