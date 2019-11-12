package com.example.usercwq.medicalmall.bean.register_bean;


/**
 *
 * 注册类
 */
public class Register2Bean {

    /**
     * ret : 200
     * info : {"token":{"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
     * .eyJ1aWQiOjIxNTczLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzM3MjI0MTN9
     * .9WPaLrhHJK5KPnz80E8K-RducrX99Wn01YkqaNNHU-o","expires":"2019-11-14 17:06:53",
     * "refreshTokenExpires":"2019-12-07 17:06:53",
     * "refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
     * .eyJ1aWQiOjIxNTczLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzU3MDk2MTN9
     * .exxroBaXxtm35hScrxot5DOSwsTTvoEJpETlMOh0uCw"},"user_info":{"id":"21573",
     * "pass":"a4b4a777d704346280fc18fc9ca1d6b1","u_name":"YYM_5bhtyY1b5","u_pic":"https://app
     * .yiyanmeng.com:443/Public/user/","phnoe":"13293661182","sex":null,"yu_bao_ming":null,
     * "xinxi":0}}
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
         * token : {"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
         * .eyJ1aWQiOjIxNTczLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzM3MjI0MTN9
         * .9WPaLrhHJK5KPnz80E8K-RducrX99Wn01YkqaNNHU-o","expires":"2019-11-14 17:06:53",
         * "refreshTokenExpires":"2019-12-07 17:06:53",
         * "refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
         * .eyJ1aWQiOjIxNTczLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzU3MDk2MTN9
         * .exxroBaXxtm35hScrxot5DOSwsTTvoEJpETlMOh0uCw"}
         * user_info : {"id":"21573","pass":"a4b4a777d704346280fc18fc9ca1d6b1",
         * "u_name":"YYM_5bhtyY1b5","u_pic":"https://app.yiyanmeng.com:443/Public/user/",
         * "phnoe":"13293661182","sex":null,"yu_bao_ming":null,"xinxi":0}
         */

        private TokenBean token;
        private UserInfoBean user_info;

        public TokenBean getToken() {
            return token;
        }

        public void setToken(TokenBean token) {
            this.token = token;
        }

        public UserInfoBean getUser_info() {
            return user_info;
        }

        public void setUser_info(UserInfoBean user_info) {
            this.user_info = user_info;
        }

        public static class TokenBean {
            /**
             * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
             * .eyJ1aWQiOjIxNTczLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzM3MjI0MTN9.9WPaLrhHJK5KPnz80E8K-RducrX99Wn01YkqaNNHU-o
             * expires : 2019-11-14 17:06:53
             * refreshTokenExpires : 2019-12-07 17:06:53
             * refresh_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
             * .eyJ1aWQiOjIxNTczLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzU3MDk2MTN9.exxroBaXxtm35hScrxot5DOSwsTTvoEJpETlMOh0uCw
             */

            private String access_token;
            private String expires;
            private String refreshTokenExpires;
            private String refresh_token;

            public String getAccess_token() {
                return access_token;
            }

            public void setAccess_token(String access_token) {
                this.access_token = access_token;
            }

            public String getExpires() {
                return expires;
            }

            public void setExpires(String expires) {
                this.expires = expires;
            }

            public String getRefreshTokenExpires() {
                return refreshTokenExpires;
            }

            public void setRefreshTokenExpires(String refreshTokenExpires) {
                this.refreshTokenExpires = refreshTokenExpires;
            }

            public String getRefresh_token() {
                return refresh_token;
            }

            public void setRefresh_token(String refresh_token) {
                this.refresh_token = refresh_token;
            }
        }

        public static class UserInfoBean {
            /**
             * id : 21573
             * pass : a4b4a777d704346280fc18fc9ca1d6b1
             * u_name : YYM_5bhtyY1b5
             * u_pic : https://app.yiyanmeng.com:443/Public/user/
             * phnoe : 13293661182
             * sex : null
             * yu_bao_ming : null
             * xinxi : 0
             */

            private String id;
            private String pass;
            private String u_name;
            private String u_pic;
            private String phnoe;
            private Object sex;
            private Object yu_bao_ming;
            private int xinxi;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPass() {
                return pass;
            }

            public void setPass(String pass) {
                this.pass = pass;
            }

            public String getU_name() {
                return u_name;
            }

            public void setU_name(String u_name) {
                this.u_name = u_name;
            }

            public String getU_pic() {
                return u_pic;
            }

            public void setU_pic(String u_pic) {
                this.u_pic = u_pic;
            }

            public String getPhnoe() {
                return phnoe;
            }

            public void setPhnoe(String phnoe) {
                this.phnoe = phnoe;
            }

            public Object getSex() {
                return sex;
            }

            public void setSex(Object sex) {
                this.sex = sex;
            }

            public Object getYu_bao_ming() {
                return yu_bao_ming;
            }

            public void setYu_bao_ming(Object yu_bao_ming) {
                this.yu_bao_ming = yu_bao_ming;
            }

            public int getXinxi() {
                return xinxi;
            }

            public void setXinxi(int xinxi) {
                this.xinxi = xinxi;
            }
        }
    }
}
