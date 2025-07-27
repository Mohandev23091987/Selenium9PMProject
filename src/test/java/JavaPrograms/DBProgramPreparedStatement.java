package JavaPrograms;

import java.sql.*;

public class DBProgramPreparedStatement {

    public static void main(String[] args) throws SQLException {

        //create a database connection object
        Connection connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/intro_sql","root","password");

        //create a prepareStatement object with Query
        String query = "select * from customers where country= ? and city =?";

        PreparedStatement preparedStatementobj = connectionObj.prepareStatement(query);
        preparedStatementobj.setString(1,"Germany");
        preparedStatementobj.setString(2,"Brandenburg");


        //execute the query and get the resultset
        ResultSet output = preparedStatementobj.executeQuery();

        //process result
        while(output.next()){
            String companyName = output.getString("company_name");
            String countryName = output.getString("country");
            System.out.println(companyName +"     "+countryName);
        }


        output.close();
        preparedStatementobj.close();
        connectionObj.close();


        //selenium script







    }




}
