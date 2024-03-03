package patronesEstructurales.Adapter;




import java.io.IOException;

public class XMLToJSON {
    private final String xml;

    public XMLToJSON(String xml){
        this.xml = xml;
    }

    public String convertToJSONFromXML() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();



        String jsonString ="";


        return jsonString;
    }


}
