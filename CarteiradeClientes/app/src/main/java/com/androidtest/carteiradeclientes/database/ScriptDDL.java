package com.androidtest.carteiradeclientes.database;

/**
 * Created by Cleiton on 27/12/2017.
 */

public class ScriptDDL {

    public static String getCreateTableCliente(){

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE ( ");
        sql.append("        CODIGO    INTEGER        PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append("        NOME      VARCHAR (250)  NOT NULL DEFAULT (''), ");
        sql.append("        ENDERECO  VARCHAR (250)  NOT NULL DEFAULT (''), ");
        sql.append("        EMAIL     VARCHAR (250)  NOT NULL DEFAULT (''), ");
        sql.append("        TELEFONE  VARCHAR (250)  NOT NULL DEFAULT ('') ) ");

        return sql.toString();
    }


}
