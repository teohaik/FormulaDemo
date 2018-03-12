package com.intrasoft.ssp.formulademo.api;

public enum ValueType {

    LONG("1","Long"), INTEGER("2","Integer"), STRING("3","String"), BOOLEAN("4","Boolean"), DOUBLE("5","Double");

    ValueType(String id, String description) {
        this.id = id;
        this.description = description;
    }

    private String id;
    private String description;

    public String getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    public static ValueType get(String id){
        for(ValueType et : values()){
            if(et.id.equals(id)){
                return et;
            }
        }
        return LONG;
    }

    @Override
    public String toString() {
        return description;
    }
}
