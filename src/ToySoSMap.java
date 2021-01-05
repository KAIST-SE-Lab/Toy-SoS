import data.MapCoordinateDimensionDomain;
import data.MapCoordinateDimensionType;
import data.MapFloorDimensionDomain;
import data.MapFloorDimensionType;
import kr.ac.kaist.se.model.abst.data.EnumDomainType;
import kr.ac.kaist.se.model.sos.data.DimensionVar;
import kr.ac.kaist.se.model.sos.geo.SimMap;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;

public class ToySoSMap extends SimMap {

    public static MapCoordinateDimensionType xDim;
    public static MapCoordinateDimensionType yDim;
    public static MapFloorDimensionType floorDim;

    public ToySoSMap(String mapId, String mapName) {
        super(mapId, mapName);
//        initDimensions();
    }

    public ToySoSMap(String mapId, String mapName, ArrayList<DimensionVar> mapDimensions) {
        super(mapId, mapName, mapDimensions);
//        initDimensions();
    }

    @Override
    protected void initMapDimensions() {

        /* Definition of domains for each dimension variable */
        MapCoordinateDimensionDomain xDimDomain = new MapCoordinateDimensionDomain(EnumDomainType.VALUE_RANGE, 0, 5);
        MapCoordinateDimensionDomain yDimDomain = new MapCoordinateDimensionDomain(EnumDomainType.VALUE_RANGE, 0, 5);
        MapFloorDimensionDomain floorDimDomain = new MapFloorDimensionDomain(EnumDomainType.ENUMERATION, new ArrayList<String>(Arrays.asList("FLOOR_B1", "FLOOR_1", "FLOOR_2", "FLOOR_3", "FLOOR_4", "FLOOR_5", "FLOOR_6", "FLOOR_7", "FLOOR_8")));

        /* Initialization of every dimension with the domains defined */
        xDim = new MapCoordinateDimensionType("DIM_X", "xDimension", "Int", "0", xDimDomain);
        yDim = new MapCoordinateDimensionType("DIM_Y", "yDimension", "Int", "0", yDimDomain);
        floorDim = new MapFloorDimensionType("DIM_FLOOR", "floorNumDimension", "Enum", "FLOOR_1", floorDimDomain);

        /* Add dimensions to this map */
        mapDimVars.add(xDim);
        mapDimVars.add(yDim);
        mapDimVars.add(floorDim);

    }

    @Override
    protected void initMapInformation() {

    }

    @Override
    protected void buildMap(String mapInitInfo) {

    }


}
