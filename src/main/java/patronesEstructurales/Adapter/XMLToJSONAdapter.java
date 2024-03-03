package patronesEstructurales.Adapter;

import java.io.IOException;

public class XMLToJSONAdapter implements IDataAdapter{

    private final XMLToJSON xmlToJSON;

    public XMLToJSONAdapter(XMLToJSON xmlToJSON){
        this.xmlToJSON = xmlToJSON;
    }
    @Override
    public String convert(XMLToJSON xml) throws IOException {
        return xmlToJSON.convertToJSONFromXML();
    }
}
