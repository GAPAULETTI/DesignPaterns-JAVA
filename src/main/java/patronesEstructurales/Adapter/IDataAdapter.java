package patronesEstructurales.Adapter;

import java.io.IOException;

public interface IDataAdapter {
    String convert(XMLToJSON xml) throws IOException;
}
