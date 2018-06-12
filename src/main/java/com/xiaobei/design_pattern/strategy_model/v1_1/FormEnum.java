package com.xiaobei.design_pattern.strategy_model.v1_1;

public enum FormEnum {
    ;

    private String key;
    private String desc;
    private Double value;

    FormEnum(String key, String desc, Double value) {
        this.key = key;
        this.desc = desc;
        this.value = value;
    }

    /**
     * 通过下拉框的key找到相应的优惠
     * @param key
     * @return
     */
    public static FormEnum getValueByKey(String key){
        for(FormEnum form : FormEnum.values()){
            if(null != key && form.getKey().equals(key)){
                return form;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
