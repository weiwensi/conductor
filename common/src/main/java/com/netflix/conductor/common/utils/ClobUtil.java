package com.netflix.conductor.common.utils;

import java.io.BufferedReader;
import java.io.Reader;
import java.sql.Clob;

public class ClobUtil {

    /**
     * oracle.sql.Clob类型转换成String类型	 * 	 * @param clob	 * @return
     */
    public static String clobToString(Clob clob)  {
        String reString=null;
        try {
            if (null == clob || clob.length() == 0) {
                return null;
            }
            Reader is = clob.getCharacterStream();
            // 得到流
            BufferedReader br = new BufferedReader(is);
            String str = br.readLine();
            StringBuffer buffer = new StringBuffer();
            while (str != null) {
                buffer.append(str);
                str = br.readLine();
            }
            reString = buffer.toString();
        }catch (Exception e){
throw new RuntimeException("clob to String Exception");
        }

        return reString;
    }


}
