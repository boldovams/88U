package org.lanit.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostResponse{

    @JsonProperty("add")
    public Add add;

    @JsonProperty("lastUpdate")
    public String lastUpdate;

    @JsonProperty("delete")
    public Delete delete;

    @JsonProperty("uuid")
    public String uuid;

    @JsonProperty("info")
    public Info info;

    public void setAdd(Add add){
        this.add = add;
    }

    public Add getAdd(){
        return add;
    }

    public void setLastUpdate(String lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public String getLastUpdate(){
        return lastUpdate;
    }

    public void setDelete(Delete delete){
        this.delete = delete;
    }

    public Delete getDelete(){
        return delete;
    }

    public void setUuid(String uuid){
        this.uuid = uuid;
    }

    public String getUuid(){
        return uuid;
    }

    public void setInfo(Info info){
        this.info = info;
    }

    public Info getInfo(){
        return info;
    }
}
