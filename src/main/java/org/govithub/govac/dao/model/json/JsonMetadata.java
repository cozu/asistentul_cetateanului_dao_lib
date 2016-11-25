package org.govithub.govac.dao.model.json;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class JsonMetadata {
	
	@JsonProperty
	public Map<String, Object> metadataMap = new HashMap<String, Object>();
	
	public JsonMetadata() { }
	
	public void set(String key, Object value) {
		metadataMap.put(key, value);
	}
	
	public Object get(String key) {
		return metadataMap.get(key);
	}
}
