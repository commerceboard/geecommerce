package com.geecommerce.core.service.mongodb.cmd;

import com.mongodb.DBObject;
import com.geecommerce.core.service.QueryOptions;
import com.geecommerce.core.service.api.Model;

public class Null extends AbstractCommand {
    private static final String CMD_NULL = "$cb.null";

    @Override
    public boolean isOwner(String key, Object value) {
	if (value == null || !(value instanceof String))
	    return false;

	return value.equals(CMD_NULL);
    }

    @Override
    public void process(Class<? extends Model> modelClass, String originalKey, String columnName, Object value, DBObject query, QueryOptions queryOptions) {
	query.put(columnName, null);
    }
}
