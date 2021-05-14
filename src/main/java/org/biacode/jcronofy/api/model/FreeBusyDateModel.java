package org.biacode.jcronofy.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeBusyDateModel implements Serializable , Cloneable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("time")
    private String time;

    @JsonProperty("tzid")
    private String tzid;

    private FreeBusyDateModel(String time, String tzid) {
	this.time = time;
	this.tzid = tzid;
    }

    public static FreeBusyDateModel of(String time) {
	return new FreeBusyDateModel(time, null);
    }

    public static FreeBusyDateModel of(String time, String tzid) {
	return new FreeBusyDateModel(time, tzid);
    }

    public Object clone() throws CloneNotSupportedException {
	return super.clone();
    }

    public String getTime() {
	return time;
    }

    public String getTzid() {
	return tzid;
    }
}

