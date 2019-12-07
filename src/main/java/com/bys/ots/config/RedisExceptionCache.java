/**
 * redis缓存，解决redis崩掉之后使用内存存储
 */
package com.bys.ots.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bairuihua
 *
 */
 
public class RedisExceptionCache
{
    public static Map<String, Object> backMap = new HashMap<String, Object>(1000);
   
}
