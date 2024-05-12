package booking.utilClass.mapRow.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import booking.entity.CategoryTouristEntity;
import booking.utilClass.mapRow.MapData;

public class CategoryMapRow implements MapData<CategoryTouristEntity>{

	@Override
	public CategoryTouristEntity mapData(ResultSet rs) throws SQLException {
		CategoryTouristEntity result = new CategoryTouristEntity();
		result.setCateoryTouristId(rs.getString(1));
		result.setCategoryTouristName(rs.getString(2));
		return result;
	}
}
