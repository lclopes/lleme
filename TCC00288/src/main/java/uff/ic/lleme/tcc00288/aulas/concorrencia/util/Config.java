package uff.ic.lleme.tcc00288.aulas.concorrencia.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Config {

    public static void initBD() {
        try {
            Class.forName("org.postgresql.Driver");
            try ( Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TCC00288", "postgres", "fluminense");) {
                conn.setAutoCommit(true);

                try ( Statement st = conn.createStatement();) {
                    st.execute("drop table if exists tabela cascade;");
                    st.execute("create table tabela(chave char,valor bigint, primary key(chave));");
                    st.execute("insert into tabela values('X',100);");
                    System.out.println("X = 100");
                    st.execute("insert into tabela values('Y',50);");
                    System.out.println("Y = 50");
                    st.execute("insert into tabela values('A',200);");
                    System.out.println("A = 200");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
