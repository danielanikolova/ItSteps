package createXmlGraph;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.omg.CORBA.portable.InputStream;

public class XmlReader {

	  private JAXBContext jaxbContext;


	  public XmlReader() {
		
	}
	   
	   @SuppressWarnings("unchecked")
	    public <T>T getObject(Class<T> clazz, String path) throws JAXBException, IOException {

	        this.jaxbContext = JAXBContext.newInstance(clazz);

	        Unmarshaller unmarshaller = this.jaxbContext.createUnmarshaller();

	        T object = null;

	        try(
	                InputStream inputStream = (InputStream) clazz.getResourceAsStream(path);

	        ){
	            object =(T)unmarshaller.unmarshal(inputStream);
	            return object;
	        }

	    }


}
