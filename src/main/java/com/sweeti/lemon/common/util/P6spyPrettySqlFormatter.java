package com.sweeti.lemon.common.util;

import com.p6spy.engine.logging.Category;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import org.hibernate.engine.jdbc.internal.FormatStyle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class P6spyPrettySqlFormatter implements MessageFormattingStrategy {
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        sql = this.formatSql(category, sql);
        Date currentDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return simpleDateFormat.format(currentDate) + " | " + "OperationTime : " + elapsed + "ms" + sql;
    }

    private String formatSql(String category, String sql) {
        if(sql == null || sql.trim().equals(""))
            return sql;

        if(Category.STATEMENT.getName().equals(category)) {
            String tmsql = sql.trim().toLowerCase(Locale.ROOT);
            if(tmsql.startsWith("create") || tmsql.startsWith("alter") || tmsql.startsWith("comment")) {
                sql = FormatStyle.DDL.getFormatter().format(sql);
            } else {
                sql = FormatStyle.BASIC.getFormatter().format(sql);
            }
            sql = "|\nHeFormatSql(P6Spy sql,Hibernate format):" + sql;
        }

        return sql;
    }
}
