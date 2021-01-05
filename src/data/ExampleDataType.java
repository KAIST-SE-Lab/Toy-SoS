package data;

import kr.ac.kaist.se.model.sos.data.DataVar;
import kr.ac.kaist.se.model.sos.data.DataVarDomain;

public class ExampleDataType extends DataVar {


    public ExampleDataType(String dataId, String dataName, String dataType, String dataDefaultValue, DataVarDomain dataDomain) {
        super(dataId, dataName, dataType, dataDefaultValue, dataDomain);
    }

    public ExampleDataType(String dataId, String dataName, String dataType, String dataDefaultValue, String dataCurValue, DataVarDomain dataDomain) {
        super(dataId, dataName, dataType, dataDefaultValue, dataCurValue, dataDomain);
    }
}
