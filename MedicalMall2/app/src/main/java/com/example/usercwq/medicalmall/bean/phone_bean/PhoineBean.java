package com.example.usercwq.medicalmall.bean.phone_bean;

/**
 *
 * 获取验证码
 */
public class PhoineBean {

    /**
     * ret : 200
     * info : {"type":"ture","msg":"短信发送成功","code":144533}
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
        /**
         * type : ture
         * msg : 短信发送成功
         * code : 144533
         */

        private String type;
        private String msg;
        private int code;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
