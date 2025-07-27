package JavaPrograms;

import java.sql.*;

public class DBProgramUsingStatement {

    public static void main(String[] args) throws SQLException {

        //create a database connection object
        Connection connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/intro_sql","root","password");
        
        //Create a statement obj using connection obj 
        Statement statementObj = connectionObj.createStatement();
        
        //Construct your sql query
        String query = "select * from customers where country= 'Germany'";

        //by using statement obj execute the query and get the result set
        ResultSet result = statementObj.executeQuery(query);

        System.out.println("Company names in Germany");

        //process the resultset
        while(result.next()){
            String companyName = result.getString("company_name");
            String countryName = result.getString("country");
            System.out.println(companyName +"     "+countryName);
        }

        result.close();
        statementObj.close();
        connectionObj.close();

    }
}
