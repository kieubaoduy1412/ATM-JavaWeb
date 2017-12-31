
package dnb.atm.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dnb.atm.model.CustomerModel;
import dnb.atm.utils.AttributeConstants;

public class AccountMapper {
    public static RowMapper<CustomerModel> getAccount() {
        RowMapper<CustomerModel> mapper = new RowMapper<CustomerModel>() {
            @Override
            public CustomerModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                CustomerModel obj = new CustomerModel();
                obj.setAccountID(rs.getString(AttributeConstants.ACCOUNT_ID));
                obj.setUserName(rs.getString(AttributeConstants.USER_NAME));
                obj.setBalance(rs.getInt(AttributeConstants.BALANCE));
                return obj;
            }
        };
        return mapper;
    }
}
