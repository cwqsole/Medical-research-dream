package com.example.usercwq.medicalmall.bean;

import java.util.List;

public class CourselvBean {
    /**
     * ret : 200
     * info : {"kecheng":[{"id":"45","name":"三科冲刺押题","class_hour":"0","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68c259c62a.jpg","jia_ge":"6800.00","yuan_jia_ge":"6800.00","price_status":"0","type_str":["最新","冲刺阶段"]},{"id":"46","name":"西综冲刺押题","class_hour":"0","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68cded9ebf.jpg","jia_ge":"5800.00","yuan_jia_ge":"5800.00","price_status":"0","type_str":["最新"," 冲刺阶段"]},{"id":"43","name":"面授课程咨询","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d1e38b125.jpg","jia_ge":"1.00","yuan_jia_ge":"1.00","price_status":"0","type_str":["咨询课程","免费试学"]},{"id":"41","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d105d8b5a.jpg","jia_ge":"13990.00","yuan_jia_ge":"14990.00","price_status":"0","type_str":["三科直播课"]},{"id":"42","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d15d1386f.jpg","jia_ge":"10990.00","yuan_jia_ge":"11990.00","price_status":"0","type_str":["西综直播课"]},{"id":"39","name":"三科百天冲刺直播","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cfcf3b87b.jpg","jia_ge":"9500.00","yuan_jia_ge":"10000.00","price_status":"0","type_str":["百天冲刺"]},{"id":"30","name":"西综百天冲刺直播","class_hour":"64","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cf6bca5ec.jpg","jia_ge":"7500.00","yuan_jia_ge":"8000.00","price_status":"0","type_str":["百天冲刺"]},{"id":"32","name":"无忧视频课-三科全程","class_hour":"28","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cb9366ce9.jpg","jia_ge":"1680.00","yuan_jia_ge":"1780.00","price_status":"0","type_str":["三科无忧"]},{"id":"40","name":"无忧视频课-西综无忧","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d0635f78b.jpg","jia_ge":"1080.00","yuan_jia_ge":"1180.00","price_status":"0","type_str":["西综无忧"]}],"lunbo":[{"id":"27","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15687845345806.jpg","url":"http://www.52bang.club/landing/exam.html "},{"id":"26","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15687840734158.jpg","url":"http://www.52bang.club/landing/exam.html"},{"id":"24","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15687852356215.jpg","url":"http://m.yiyanmeng.com/col.jsp?id=114"}],"gong_gao":[{"id":"5","name":"八月考研高端优惠活动","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/5.html"},{"id":"4","name":"八月份试听课程","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/4.html"},{"id":"3","name":"20医考全年集训","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/3.html"},{"id":"2","name":"2020医考寒假超越计划","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/2.html"},{"id":"1","name":"2019课程设置","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/1.html"}]}
     * mas : 成功
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
        private List<KechengBean> kecheng;
        private List<LunboBean> lunbo;
        private List<GongGaoBean> gong_gao;

        public List<KechengBean> getKecheng() {
            return kecheng;
        }

        public void setKecheng(List<KechengBean> kecheng) {
            this.kecheng = kecheng;
        }

        public List<LunboBean> getLunbo() {
            return lunbo;
        }

        public void setLunbo(List<LunboBean> lunbo) {
            this.lunbo = lunbo;
        }

        public List<GongGaoBean> getGong_gao() {
            return gong_gao;
        }

        public void setGong_gao(List<GongGaoBean> gong_gao) {
            this.gong_gao = gong_gao;
        }

        public static class KechengBean {
            /**
             * id : 45
             * name : 三科冲刺押题
             * class_hour : 0
             * type : 0
             * pic : https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68c259c62a.jpg
             * jia_ge : 6800.00
             * yuan_jia_ge : 6800.00
             * price_status : 0
             * type_str : ["最新","冲刺阶段"]
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

        public static class LunboBean {
            /**
             * id : 27
             * pic : https://app.yiyanmeng.com:443/Public/lunbo/15687845345806.jpg
             * url : http://www.52bang.club/landing/exam.html
             */

            private String id;
            private String pic;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class GongGaoBean {
            /**
             * id : 5
             * name : 八月考研高端优惠活动
             * url : https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/5.html
             */

            private String id;
            private String name;
            private String url;

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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
