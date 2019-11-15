package com.example.usercwq.medicalmall.bean.shopping_bean;

import java.util.List;

public class WholeBean {

    /**
     * ret : 200
     * info : {"start":6,"end":3,"shop":[{"id":"59","name":"外科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/276d87c91096e7e6fedd52bde25fbaa6.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"58","name":"内科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/f0e97cc2ad56d9eba055523ad0f46af9.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"54","name":"生化三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/64e9e546d43df67eab17b0e0f9ee21ca.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"}],"course":[{"id":"41","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d105d8b5a.jpg","jia_ge":"13990.00","yuan_jia_ge":"14990.00","price_status":"0","type_str":["三科直播课",""]},{"id":"42","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d15d1386f.jpg","jia_ge":"10990.00","yuan_jia_ge":"11990.00","price_status":"0","type_str":["西综直播课"]},{"id":"39","name":"三科百天冲刺直播","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cfcf3b87b.jpg","jia_ge":"9500.00","yuan_jia_ge":"10000.00","price_status":"0","type_str":["","百天冲刺"]}]}
     * mas : 成功!!
     */

    private String ret;
    private InfoBean info;
    private String mas;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public static class InfoBean {
        /**
         * start : 6
         * end : 3
         * shop : [{"id":"59","name":"外科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/276d87c91096e7e6fedd52bde25fbaa6.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"58","name":"内科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/f0e97cc2ad56d9eba055523ad0f46af9.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"54","name":"生化三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/64e9e546d43df67eab17b0e0f9ee21ca.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"}]
         * course : [{"id":"41","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d105d8b5a.jpg","jia_ge":"13990.00","yuan_jia_ge":"14990.00","price_status":"0","type_str":["三科直播课",""]},{"id":"42","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d15d1386f.jpg","jia_ge":"10990.00","yuan_jia_ge":"11990.00","price_status":"0","type_str":["西综直播课"]},{"id":"39","name":"三科百天冲刺直播","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cfcf3b87b.jpg","jia_ge":"9500.00","yuan_jia_ge":"10000.00","price_status":"0","type_str":["","百天冲刺"]}]
         */

        private int start;
        private int end;
        private List<ShopBean> shop;
        private List<CourseBean> course;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public List<ShopBean> getShop() {
            return shop;
        }

        public void setShop(List<ShopBean> shop) {
            this.shop = shop;
        }

        public List<CourseBean> getCourse() {
            return course;
        }

        public void setCourse(List<CourseBean> course) {
            this.course = course;
        }

        public static class ShopBean {
            /**
             * id : 59
             * name : 外科三套卷
             * pic : https://app.yiyanmeng.com:443/Public/shop_xiang_qing/276d87c91096e7e6fedd52bde25fbaa6.jpg
             * hao_ping : 5
             * xian_price : 109.00
             * re_mai : 1
             */

            private String id;
            private String name;
            private String pic;
            private String hao_ping;
            private String xian_price;
            private String re_mai;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getHao_ping() {
                return hao_ping;
            }

            public void setHao_ping(String hao_ping) {
                this.hao_ping = hao_ping;
            }

            public String getXian_price() {
                return xian_price;
            }

            public void setXian_price(String xian_price) {
                this.xian_price = xian_price;
            }

            public String getRe_mai() {
                return re_mai;
            }

            public void setRe_mai(String re_mai) {
                this.re_mai = re_mai;
            }
        }

        public static class CourseBean {
            /**
             * id : 41
             * name : 2021雏鹰计划
             * class_hour : 1
             * type : 0
             * pic : https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d105d8b5a.jpg
             * jia_ge : 13990.00
             * yuan_jia_ge : 14990.00
             * price_status : 0
             * type_str : ["三科直播课",""]
             */

            private String id;
            private String name;
            private String class_hour;
            private String type;
            private String pic;
            private String jia_ge;
            private String yuan_jia_ge;
            private String price_status;
            private List<String> type_str;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getClass_hour() {
                return class_hour;
            }

            public void setClass_hour(String class_hour) {
                this.class_hour = class_hour;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getJia_ge() {
                return jia_ge;
            }

            public void setJia_ge(String jia_ge) {
                this.jia_ge = jia_ge;
            }

            public String getYuan_jia_ge() {
                return yuan_jia_ge;
            }

            public void setYuan_jia_ge(String yuan_jia_ge) {
                this.yuan_jia_ge = yuan_jia_ge;
            }

            public String getPrice_status() {
                return price_status;
            }

            public void setPrice_status(String price_status) {
                this.price_status = price_status;
            }

            public List<String> getType_str() {
                return type_str;
            }

            public void setType_str(List<String> type_str) {
                this.type_str = type_str;
            }
        }
    }
}
