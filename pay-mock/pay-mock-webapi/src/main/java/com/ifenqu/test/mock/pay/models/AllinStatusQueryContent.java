package com.ifenqu.test.mock.pay.models;

/**
 * Created by shi on 2017/1/9.
 */
public class AllinStatusQueryContent {
    public static class TOrder_info_response{

        public static class TMap{

            public static class TEntry{

                private	Integer	value;	/*1*/
                private	Long	key;	/*20161104150827*/

                public void setValue(Integer value){
                    this.value = value;
                }
                public Integer getValue(){
                    return this.value;
                }

                public void setKey(Long value){
                    this.key = value;
                }
                public Long getKey(){
                    return this.key;
                }

            }
            private	TEntry	entry;	/*TEntry*/

            public void setEntry(TEntry value){
                this.entry = value;
            }
            public TEntry getEntry(){
                return this.entry;
            }

        }
        private	Long	res_timestamp;	/*20161104163208*/
        private	TMap	map;	/*TMap*/
        private	String	res_sign;	/*7BA2ED4A343C6633DFF0A06CE158C2FC*/

        public void setRes_timestamp(Long value){
            this.res_timestamp = value;
        }
        public Long getRes_timestamp(){
            return this.res_timestamp;
        }

        public void setMap(TMap value){
            this.map = value;
        }
        public TMap getMap(){
            return this.map;
        }

        public void setRes_sign(String value){
            this.res_sign = value;
        }
        public String getRes_sign(){
            return this.res_sign;
        }

    }
    private	TOrder_info_response	order_info_response;	/*TOrder_info_response*/

    public void setOrder_info_response(TOrder_info_response value){
        this.order_info_response = value;
    }
    public TOrder_info_response getOrder_info_response(){
        return this.order_info_response;
    }
}
