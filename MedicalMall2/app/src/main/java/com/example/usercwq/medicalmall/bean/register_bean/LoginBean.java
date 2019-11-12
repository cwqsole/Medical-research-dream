package com.example.usercwq.medicalmall.bean.register_bean;

public class LoginBean {

    /**
     * ret : 200
     * info : {"token":{"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
     * .eyJ1aWQiOiIyMTIyOCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzYxNzYzN30
     * .vplqe9vlDGF1_cgTXvS80WAx4gX0-wy-g6Tnk-AcqZ4","expires":"2021-10-07 22:40:37",
     * "refreshTokenExpires":"2020-09-02 22:40:37",
     * "refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
     * .eyJ1aWQiOiIyMTIyOCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTU5OTA1NzYzN30
     * .QvBtKHI5dbZ0KNtOmf6A1S9xtcIGw0Kh6B6j2mEuRe4"},"user_info":{"id":"21228",
     * "pass":"4ea867fccd765229f606422ce128eb0d","u_name":"YYM_5bZ3HfWpr","u_pic":"https://app
     * .yiyanmeng.com:443/Public/user/2019-10-31/21228/15725113950.png","phnoe":"17636144176",
     * "sex":null,"yu_bao_ming":"{\"s_id\":\"51\",\"y_id\":\"7\",\"z_id\":\"45\",
     * \"time\":\"2020-12-20\"}","xinxi":"1"}}
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
         * .eyJ1aWQiOiIyMTIyOCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzYxNzYzN30.vplqe9vlDGF1_cgTXvS80WAx4gX0-wy-g6Tnk-AcqZ4","expires":"2021-10-07 22:40:37","refreshTokenExpires":"2020-09-02 22:40:37","refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTIyOCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTU5OTA1NzYzN30.QvBtKHI5dbZ0KNtOmf6A1S9xtcIGw0Kh6B6j2mEuRe4"}
         * user_info : {"id":"21228","pass":"4ea867fccd765229f606422ce128eb0d",
         * "u_name":"YYM_5bZ3HfWpr","u_pic":"https://app.yiyanmeng
         * .com:443/Public/user/2019-10-31/21228/15725113950.png","phnoe":"17636144176",
         * "sex":null,"yu_bao_ming":"{\"s_id\":\"51\",\"y_id\":\"7\",\"z_id\":\"45\",
         * \"time\":\"2020-12-20\"}","xinxi":"1"}
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
             * .eyJ1aWQiOiIyMTIyOCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzYxNzYzN30.vplqe9vlDGF1_cgTXvS80WAx4gX0-wy-g6Tnk-AcqZ4
             * expires : 2021-10-07 22:40:37
             * refreshTokenExpires : 2020-09-02 22:40:37
             * refresh_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9
             * .eyJ1aWQiOiIyMTIyOCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTU5OTA1NzYzN30.QvBtKHI5dbZ0KNtOmf6A1S9xtcIGw0Kh6B6j2mEuRe4
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
             * id : 21228
             * pass : 4ea867fccd765229f606422ce128eb0d
             * u_name : YYM_5bZ3HfWpr
             * u_pic : https://app.yiyanmeng.com:443/Public/user/2019-10-31/21228/15725113950.png
             * phnoe : 17636144176
             * sex : null
             * yu_bao_ming : {"s_id":"51","y_id":"7","z_id":"45","time":"2020-12-20"}
             * xinxi : 1
             */

            private String id;
            private String pass;
            private String u_name;
            private String u_pic;
            private String phnoe;
            private Object sex;
            private String yu_bao_ming;
            private String xinxi;

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

            public String getYu_bao_ming() {
                return yu_bao_ming;
            }

            public void setYu_bao_ming(String yu_bao_ming) {
                this.yu_bao_ming = yu_bao_ming;
            }

            public String getXinxi() {
                return xinxi;
            }

            public void setXinxi(String xinxi) {
                this.xinxi = xinxi;
            }
        }
    }
}
