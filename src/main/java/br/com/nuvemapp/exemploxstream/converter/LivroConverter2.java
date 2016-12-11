package br.com.nuvemapp.exemploxstream.converter;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import br.com.nuvemapp.exemploxstream.model.Livro;

public class LivroConverter2 implements Converter {

	public boolean canConvert(Class clazz) {
		return clazz.equals(Livro.class);
	}

	public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {

		Livro livro = (Livro) value;
		writer.startNode("ano");
		context.convertAnother(livro.getAno());
		writer.endNode();

		writer.startNode("titulo");
		context.convertAnother(livro.getTitulo());
		writer.endNode();
	}

	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		return null;
	}

}
