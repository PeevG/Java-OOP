package p2_CarShopExtended;

import java.io.Serializable;

public interface Car extends Serializable {

    public Integer TIRES = 4;

    public String getModel();
    public String getColor();
    public Integer getHorsePower();
    String countryProduced();


}
