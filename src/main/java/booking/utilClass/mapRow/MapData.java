package booking.utilClass.mapRow;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MapData <T>{
	T mapData(ResultSet rs) throws SQLException;
}
