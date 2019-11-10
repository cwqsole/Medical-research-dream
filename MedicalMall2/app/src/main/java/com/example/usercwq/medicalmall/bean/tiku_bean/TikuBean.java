package com.example.usercwq.medicalmall.bean.tiku_bean;

import java.util.List;

public class TikuBean {

    /**
     * ret : 200
     * info : {"u_type":[{"id":"57","name":"内科学","pid":"0","status":"1","pic":null,"pai":"5",
     * "zong":"0","zuo":"0","ban_ben":"0","jianjie":"医学考研一线名师反复审查","xishu":"1.00","yizuo":"2000",
     * "ti_ping_num":"0","type_id":"57","z_type":[{"id":"112","name":"第一章  诊断学","pid":"58",
     * "status":"0","pic":null,"pai":"0","zong":"60","zuo":"0","ban_ben":"11468","jianjie":"",
     * "xishu":"1.00","yizuo":"4984","ti_ping_num":"0","type_id":"112","biao_name":"T_K_BBC"},{
     * "id":"114","name":"第二章  呼吸系统疾病","pid":"59","status":"0","pic":null,"pai":"0","zong":"220",
     * "zuo":"0","ban_ben":"11479","jianjie":"","xishu":"1.00","yizuo":"6607","ti_ping_num":"0",
     * "type_id":"114","biao_name":"T_K_BBE"},{"id":"116","name":"第三章  循环系统疾病","pid":"60",
     * "status":"0","pic":null,"pai":"0","zong":"258","zuo":"0","ban_ben":"11486","jianjie":"",
     * "xishu":"1.00","yizuo":"4337","ti_ping_num":"0","type_id":"116","biao_name":"T_K_BBG"},{
     * "id":"117","name":"第四章  消化系统疾病和中毒","pid":"61","status":"0","pic":null,"pai":"0",
     * "zong":"243","zuo":"0","ban_ben":"11495","jianjie":"","xishu":"1.00","yizuo":"4080",
     * "ti_ping_num":"0","type_id":"117","biao_name":"T_K_BBH"},{"id":"102","name":"第五章  泌尿系统疾病",
     * "pid":"62","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0","ban_ben":"11500",
     * "jianjie":"","xishu":"1.00","yizuo":"3661","ti_ping_num":"0","type_id":"102",
     * "biao_name":"T_K_BAC"},{"id":"110","name":"第六章  血液系统疾病","pid":"63","status":"0",
     * "pic":null,"pai":"0","zong":"153","zuo":"0","ban_ben":"11505","jianjie":"","xishu":"1.00",
     * "yizuo":"3632","ti_ping_num":"0","type_id":"110","biao_name":"T_K_BBA"},{"id":"109",
     * "name":"第七章  内分泌系统和营养代谢疾病","pid":"64","status":"0","pic":null,"pai":"0","zong":"143",
     * "zuo":"0","ban_ben":"11510","jianjie":"","xishu":"1.00","yizuo":"3540","ti_ping_num":"0",
     * "type_id":"109","biao_name":"T_K_BAJ"},{"id":"122","name":"第八章  风湿性疾病","pid":"65",
     * "status":"0","pic":null,"pai":"0","zong":"37","zuo":"0","ban_ben":"11513","jianjie":"",
     * "xishu":"1.00","yizuo":"3233","ti_ping_num":"0","type_id":"122","biao_name":"T_K_BCC"}]},{
     * "id":"66","name":"外科学","pid":"0","status":"1","pic":null,"pai":"4","zong":"0","zuo":"0",
     * "ban_ben":"0","jianjie":"重新定义九版教材，打破固化教育","xishu":"1.00","yizuo":"2000","ti_ping_num":"0",
     * "type_id":"66","z_type":[{"id":"118","name":"第一章  外科总论","pid":"67","status":"0",
     * "pic":null,"pai":"0","zong":"195","zuo":"0","ban_ben":"11516","jianjie":"","xishu":"1.00",
     * "yizuo":"4819","ti_ping_num":"0","type_id":"118","biao_name":"T_K_BBI"},{"id":"119",
     * "name":"第二章  胸部外科疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"20","zuo":"0",
     * "ban_ben":"11518","jianjie":"","xishu":"1.00","yizuo":"3575","ti_ping_num":"0",
     * "type_id":"119","biao_name":"T_K_BBJ"},{"id":"139","name":"第三章  普通外科","pid":"69",
     * "status":"0","pic":null,"pai":"0","zong":"397","zuo":"0","ban_ben":"11538","jianjie":"",
     * "xishu":"1.00","yizuo":"5538","ti_ping_num":"0","type_id":"139","biao_name":"T_K_BDJ"},{
     * "id":"121","name":"第四章  泌尿、男性生殖系统外科疾病","pid":"70","status":"0","pic":null,"pai":"0",
     * "zong":"20","zuo":"0","ban_ben":"11539","jianjie":"","xishu":"1.00","yizuo":"3368",
     * "ti_ping_num":"0","type_id":"121","biao_name":"T_K_BCB"},{"id":"101","name":"第五章  骨科",
     * "pid":"71","status":"0","pic":null,"pai":"0","zong":"218","zuo":"0","ban_ben":"11549",
     * "jianjie":"","xishu":"1.00","yizuo":"3732","ti_ping_num":"0","type_id":"101",
     * "biao_name":"T_K_BAB"}]},{"id":"22","name":"生理学","pid":"0","status":"1","pic":null,
     * "pai":"3","zong":"0","zuo":"0","ban_ben":"0","jianjie":"针对第九版教材，解析最全，正确率最高","xishu":"1
     * .00","yizuo":"0","ti_ping_num":"264","type_id":"22","z_type":[{"id":"88","name":"第一章  绪论",
     * "pid":"23","status":"0","pic":null,"pai":"10","zong":"25","zuo":"0","ban_ben":"10681",
     * "jianjie":"","xishu":"1.00","yizuo":"6186","ti_ping_num":"0","type_id":"88",
     * "biao_name":"T_K_II"},{"id":"103","name":"第二章  细胞的基本功能","pid":"24","status":"0",
     * "pic":null,"pai":"0","zong":"92","zuo":"0","ban_ben":"10766","jianjie":"","xishu":"1.00",
     * "yizuo":"4686","ti_ping_num":"0","type_id":"103","biao_name":"T_K_BAD"},{"id":"98",
     * "name":"第三章  呼吸","pid":"14","status":"0","pic":null,"pai":"0","zong":"86","zuo":"0",
     * "ban_ben":"11413","jianjie":"","xishu":"1.00","yizuo":"3496","ti_ping_num":"0",
     * "type_id":"98","biao_name":"T_K_JI"},{"id":"106","name":"第四章  消化和吸收","pid":"2",
     * "status":"0","pic":null,"pai":"0","zong":"77","zuo":"0","ban_ben":"11415","jianjie":"",
     * "xishu":"1.00","yizuo":"3111","ti_ping_num":"0","type_id":"106","biao_name":"T_K_BAG"},{
     * "id":"104","name":"第五章  能量代谢和体温","pid":"11","status":"0","pic":null,"pai":"0","zong":"36",
     * "zuo":"0","ban_ben":"11417","jianjie":"","xishu":"1.00","yizuo":"2812","ti_ping_num":"0",
     * "type_id":"104","biao_name":"T_K_BAE"},{"id":"115","name":"第六章  神经系统","pid":"13",
     * "status":"0","pic":null,"pai":"0","zong":"24","zuo":"0","ban_ben":"11157","jianjie":"",
     * "xishu":"1.00","yizuo":"2719","ti_ping_num":"0","type_id":"115","biao_name":"T_K_BBF"},{
     * "id":"105","name":"第七章  内分泌","pid":"19","status":"0","pic":null,"pai":"0","zong":"73",
     * "zuo":"0","ban_ben":"11419","jianjie":"","xishu":"1.00","yizuo":"2755","ti_ping_num":"0",
     * "type_id":"105","biao_name":"T_K_BAF"},{"id":"107","name":"第八章  生殖","pid":"20",
     * "status":"0","pic":null,"pai":"0","zong":"22","zuo":"0","ban_ben":"3648","jianjie":"",
     * "xishu":"1.00","yizuo":"2550","ti_ping_num":"0","type_id":"107","biao_name":"T_K_BAH"},{
     * "id":"161","name":"第八章  生殖（续）","pid":"20","status":"0","pic":null,"pai":"0","zong":"18",
     * "zuo":"0","ban_ben":"11420","jianjie":"","xishu":"1.00","yizuo":"2467","ti_ping_num":"0",
     * "type_id":"161","biao_name":"T_K_BGB"},{"id":"108","name":"第九章  血液","pid":"89",
     * "status":"0","pic":null,"pai":"0","zong":"52","zuo":"0","ban_ben":"11407","jianjie":"",
     * "xishu":"1.00","yizuo":"3120","ti_ping_num":"0","type_id":"108","biao_name":"T_K_BAI"},{
     * "id":"111","name":"第十章  血液循环","pid":"93","status":"0","pic":null,"pai":"0","zong":"125",
     * "zuo":"0","ban_ben":"11411","jianjie":"","xishu":"1.00","yizuo":"3322","ti_ping_num":"0",
     * "type_id":"111","biao_name":"T_K_BBB"},{"id":"100","name":"第十一章  尿的生成和排出","pid":"96",
     * "status":"0","pic":null,"pai":"0","zong":"72","zuo":"0","ban_ben":"11082","jianjie":"",
     * "xishu":"1.00","yizuo":"2892","ti_ping_num":"0","type_id":"100","biao_name":"T_K_BAA"},{
     * "id":"159","name":"第十二章  感觉器官","pid":"157","status":"0","pic":null,"pai":"0","zong":"44",
     * "zuo":"0","ban_ben":"11088","jianjie":"","xishu":"1.00","yizuo":"2553","ti_ping_num":"0",
     * "type_id":"159","biao_name":"T_K_BFJ"},{"id":"163","name":"第十三章  神经系统","pid":"162",
     * "status":"0","pic":null,"pai":"0","zong":"103","zuo":"0","ban_ben":"11181","jianjie":"",
     * "xishu":"1.00","yizuo":"2791","ti_ping_num":"0","type_id":"163","biao_name":"T_K_BGD"}]},{
     * "id":"42","name":"病理学","pid":"0","status":"1","pic":null,"pai":"2","zong":"0","zuo":"0",
     * "ban_ben":"0","jianjie":"全国一线名师提供最精细、权威题库","xishu":"1.00","yizuo":"2000",
     * "ti_ping_num":"0","type_id":"42","z_type":[{"id":"140","name":"第一章  局部血液循环障碍","pid":"45",
     * "status":"0","pic":null,"pai":"0","zong":"36","zuo":"0","ban_ben":"1759","jianjie":"",
     * "xishu":"1.00","yizuo":"4282","ti_ping_num":"0","type_id":"140","biao_name":"T_K_BEA"},{
     * "id":"128","name":"第二章  细胞和组织的适应与损伤","pid":"43","status":"0","pic":null,"pai":"0",
     * "zong":"65","zuo":"0","ban_ben":"11445","jianjie":"","xishu":"1.00","yizuo":"3864",
     * "ti_ping_num":"0","type_id":"128","biao_name":"T_K_BCI"},{"id":"141","name":"第三章  损伤的修复",
     * "pid":"44","status":"0","pic":null,"pai":"0","zong":"22","zuo":"0","ban_ben":"1499",
     * "jianjie":"","xishu":"1.00","yizuo":"3141","ti_ping_num":"0","type_id":"141",
     * "biao_name":"T_K_BEB"},{"id":"143","name":"第四章  炎症","pid":"46","status":"0","pic":null,
     * "pai":"0","zong":"63","zuo":"0","ban_ben":"11448","jianjie":"","xishu":"1.00",
     * "yizuo":"3111","ti_ping_num":"0","type_id":"143","biao_name":"T_K_BED"},{"id":"144",
     * "name":"第五章  肿瘤","pid":"47","status":"0","pic":null,"pai":"0","zong":"74","zuo":"0",
     * "ban_ben":"11450","jianjie":"","xishu":"1.00","yizuo":"2809","ti_ping_num":"0",
     * "type_id":"144","biao_name":"T_K_BEE"},{"id":"146","name":"第六章  免疫病理","pid":"48",
     * "status":"0","pic":null,"pai":"0","zong":"21","zuo":"0","ban_ben":"11451","jianjie":"",
     * "xishu":"1.00","yizuo":"2867","ti_ping_num":"0","type_id":"146","biao_name":"T_K_BEG"},{
     * "id":"147","name":"第七章  心血管系统疾病","pid":"49","status":"0","pic":null,"pai":"0","zong":"51",
     * "zuo":"0","ban_ben":"11453","jianjie":"","xishu":"1.00","yizuo":"2861","ti_ping_num":"0",
     * "type_id":"147","biao_name":"T_K_BEH"},{"id":"148","name":"第八章  呼吸系统疾病","pid":"50",
     * "status":"0","pic":null,"pai":"0","zong":"51","zuo":"0","ban_ben":"11454","jianjie":"",
     * "xishu":"1.00","yizuo":"2699","ti_ping_num":"0","type_id":"148","biao_name":"T_K_BEI"},{
     * "id":"150","name":"第九章  消化系统疾病","pid":"51","status":"0","pic":null,"pai":"0","zong":"72",
     * "zuo":"0","ban_ben":"11457","jianjie":"","xishu":"1.00","yizuo":"2726","ti_ping_num":"0",
     * "type_id":"150","biao_name":"T_K_BFA"},{"id":"152","name":"第十章  淋巴造血系统疾病","pid":"52",
     * "status":"0","pic":null,"pai":"0","zong":"30","zuo":"0","ban_ben":"2931","jianjie":"",
     * "xishu":"1.00","yizuo":"3138","ti_ping_num":"0","type_id":"152","biao_name":"T_K_BFC"},{
     * "id":"153","name":"第十一章  泌尿系统疾病","pid":"53","status":"0","pic":null,"pai":"0","zong":"38",
     * "zuo":"0","ban_ben":"11458","jianjie":"","xishu":"1.00","yizuo":"2760","ti_ping_num":"0",
     * "type_id":"153","biao_name":"T_K_BFD"},{"id":"156","name":"第十二章  生殖系统疾病","pid":"54",
     * "status":"0","pic":null,"pai":"0","zong":"23","zuo":"0","ban_ben":"11459","jianjie":"",
     * "xishu":"1.00","yizuo":"2656","ti_ping_num":"0","type_id":"156","biao_name":"T_K_BFG"},{
     * "id":"158","name":"第十三章  内分泌系统疾病","pid":"55","status":"0","pic":null,"pai":"0",
     * "zong":"13","zuo":"0","ban_ben":"11461","jianjie":"","xishu":"1.00","yizuo":"2856",
     * "ti_ping_num":"0","type_id":"158","biao_name":"T_K_BFI"},{"id":"155","name":"第十四章
     * 传染病及寄生虫病","pid":"56","status":"0","pic":null,"pai":"0","zong":"67","zuo":"0",
     * "ban_ben":"11464","jianjie":"","xishu":"1.00","yizuo":"2954","ti_ping_num":"0",
     * "type_id":"155","biao_name":"T_K_BFF"},{"id":"127","name":"细胞和组织的适用与损伤","pid":"42",
     * "status":"0","pic":null,"pai":"0","zong":"1","zuo":"0","ban_ben":"1606","jianjie":"",
     * "xishu":"1.00","yizuo":"2891","ti_ping_num":"0","type_id":"127","biao_name":"T_K_BCH"}]},{
     * "id":"37","name":"生物化学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0",
     * "ban_ben":"0","jianjie":"手把手让你考研初试冲刺高分","xishu":"1.00","yizuo":"2000","ti_ping_num":"0",
     * "type_id":"37","z_type":[{"id":"135","name":"第一章  生物大分子的结构和功能","pid":"38","status":"0",
     * "pic":null,"pai":"0","zong":"109","zuo":"0","ban_ben":"11423","jianjie":"","xishu":"1.00",
     * "yizuo":"4035","ti_ping_num":"0","type_id":"135","biao_name":"T_K_BDF"},{"id":"142",
     * "name":"第二章  物质代谢及调节","pid":"39","status":"0","pic":null,"pai":"0","zong":"252","zuo":"0",
     * "ban_ben":"11429","jianjie":"","xishu":"1.00","yizuo":"2933","ti_ping_num":"0",
     * "type_id":"142","biao_name":"T_K_BEC"},{"id":"149","name":"第三章  基因的信息传递","pid":"40",
     * "status":"0","pic":null,"pai":"0","zong":"173","zuo":"0","ban_ben":"11438","jianjie":"",
     * "xishu":"1.00","yizuo":"2617","ti_ping_num":"0","type_id":"149","biao_name":"T_K_BEJ"},{
     * "id":"151","name":"第四章  生化专题","pid":"41","status":"0","pic":null,"pai":"0","zong":"85",
     * "zuo":"0","ban_ben":"11442","jianjie":"","xishu":"1.00","yizuo":"2755","ti_ping_num":"0",
     * "type_id":"151","biao_name":"T_K_BFB"}]},{"id":"72","name":"临床医学人文精神","pid":"0",
     * "status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"",
     * "xishu":"1.00","yizuo":"2000","ti_ping_num":"0","type_id":"72","z_type":[{"id":"188",
     * "name":"医学人文","pid":"187","status":"0","pic":null,"pai":"0","zong":"16","zuo":"0",
     * "ban_ben":"11557","jianjie":"","xishu":"1.00","yizuo":"3598","ti_ping_num":"0",
     * "type_id":"188","biao_name":"T_K_BII"}]}],"fen":"0"}
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
         * u_type : [{"id":"57","name":"内科学","pid":"0","status":"1","pic":null,"pai":"5",
         * "zong":"0","zuo":"0","ban_ben":"0","jianjie":"医学考研一线名师反复审查","xishu":"1.00",
         * "yizuo":"2000","ti_ping_num":"0","type_id":"57","z_type":[{"id":"112","name":"第一章
         * 诊断学","pid":"58","status":"0","pic":null,"pai":"0","zong":"60","zuo":"0",
         * "ban_ben":"11468","jianjie":"","xishu":"1.00","yizuo":"4984","ti_ping_num":"0",
         * "type_id":"112","biao_name":"T_K_BBC"},{"id":"114","name":"第二章  呼吸系统疾病","pid":"59",
         * "status":"0","pic":null,"pai":"0","zong":"220","zuo":"0","ban_ben":"11479",
         * "jianjie":"","xishu":"1.00","yizuo":"6607","ti_ping_num":"0","type_id":"114",
         * "biao_name":"T_K_BBE"},{"id":"116","name":"第三章  循环系统疾病","pid":"60","status":"0",
         * "pic":null,"pai":"0","zong":"258","zuo":"0","ban_ben":"11486","jianjie":"","xishu":"1
         * .00","yizuo":"4337","ti_ping_num":"0","type_id":"116","biao_name":"T_K_BBG"},{"id
         * ":"117","name":"第四章  消化系统疾病和中毒","pid":"61","status":"0","pic":null,"pai":"0",
         * "zong":"243","zuo":"0","ban_ben":"11495","jianjie":"","xishu":"1.00","yizuo":"4080",
         * "ti_ping_num":"0","type_id":"117","biao_name":"T_K_BBH"},{"id":"102","name":"第五章
         * 泌尿系统疾病","pid":"62","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0",
         * "ban_ben":"11500","jianjie":"","xishu":"1.00","yizuo":"3661","ti_ping_num":"0",
         * "type_id":"102","biao_name":"T_K_BAC"},{"id":"110","name":"第六章  血液系统疾病","pid":"63",
         * "status":"0","pic":null,"pai":"0","zong":"153","zuo":"0","ban_ben":"11505",
         * "jianjie":"","xishu":"1.00","yizuo":"3632","ti_ping_num":"0","type_id":"110",
         * "biao_name":"T_K_BBA"},{"id":"109","name":"第七章  内分泌系统和营养代谢疾病","pid":"64","status":"0",
         * "pic":null,"pai":"0","zong":"143","zuo":"0","ban_ben":"11510","jianjie":"","xishu":"1
         * .00","yizuo":"3540","ti_ping_num":"0","type_id":"109","biao_name":"T_K_BAJ"},{"id
         * ":"122","name":"第八章  风湿性疾病","pid":"65","status":"0","pic":null,"pai":"0","zong":"37",
         * "zuo":"0","ban_ben":"11513","jianjie":"","xishu":"1.00","yizuo":"3233",
         * "ti_ping_num":"0","type_id":"122","biao_name":"T_K_BCC"}]},{"id":"66","name":"外科学",
         * "pid":"0","status":"1","pic":null,"pai":"4","zong":"0","zuo":"0","ban_ben":"0",
         * "jianjie":"重新定义九版教材，打破固化教育","xishu":"1.00","yizuo":"2000","ti_ping_num":"0",
         * "type_id":"66","z_type":[{"id":"118","name":"第一章  外科总论","pid":"67","status":"0",
         * "pic":null,"pai":"0","zong":"195","zuo":"0","ban_ben":"11516","jianjie":"","xishu":"1
         * .00","yizuo":"4819","ti_ping_num":"0","type_id":"118","biao_name":"T_K_BBI"},{"id
         * ":"119","name":"第二章  胸部外科疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"20",
         * "zuo":"0","ban_ben":"11518","jianjie":"","xishu":"1.00","yizuo":"3575",
         * "ti_ping_num":"0","type_id":"119","biao_name":"T_K_BBJ"},{"id":"139","name":"第三章
         * 普通外科","pid":"69","status":"0","pic":null,"pai":"0","zong":"397","zuo":"0",
         * "ban_ben":"11538","jianjie":"","xishu":"1.00","yizuo":"5538","ti_ping_num":"0",
         * "type_id":"139","biao_name":"T_K_BDJ"},{"id":"121","name":"第四章  泌尿、男性生殖系统外科疾病",
         * "pid":"70","status":"0","pic":null,"pai":"0","zong":"20","zuo":"0","ban_ben":"11539",
         * "jianjie":"","xishu":"1.00","yizuo":"3368","ti_ping_num":"0","type_id":"121",
         * "biao_name":"T_K_BCB"},{"id":"101","name":"第五章  骨科","pid":"71","status":"0",
         * "pic":null,"pai":"0","zong":"218","zuo":"0","ban_ben":"11549","jianjie":"","xishu":"1
         * .00","yizuo":"3732","ti_ping_num":"0","type_id":"101","biao_name":"T_K_BAB"}]},{"id
         * ":"22","name":"生理学","pid":"0","status":"1","pic":null,"pai":"3","zong":"0","zuo":"0",
         * "ban_ben":"0","jianjie":"针对第九版教材，解析最全，正确率最高","xishu":"1.00","yizuo":"0",
         * "ti_ping_num":"264","type_id":"22","z_type":[{"id":"88","name":"第一章  绪论","pid":"23",
         * "status":"0","pic":null,"pai":"10","zong":"25","zuo":"0","ban_ben":"10681",
         * "jianjie":"","xishu":"1.00","yizuo":"6186","ti_ping_num":"0","type_id":"88",
         * "biao_name":"T_K_II"},{"id":"103","name":"第二章  细胞的基本功能","pid":"24","status":"0",
         * "pic":null,"pai":"0","zong":"92","zuo":"0","ban_ben":"10766","jianjie":"","xishu":"1
         * .00","yizuo":"4686","ti_ping_num":"0","type_id":"103","biao_name":"T_K_BAD"},{"id":"98
         * ","name":"第三章  呼吸","pid":"14","status":"0","pic":null,"pai":"0","zong":"86","zuo":"0",
         * "ban_ben":"11413","jianjie":"","xishu":"1.00","yizuo":"3496","ti_ping_num":"0",
         * "type_id":"98","biao_name":"T_K_JI"},{"id":"106","name":"第四章  消化和吸收","pid":"2",
         * "status":"0","pic":null,"pai":"0","zong":"77","zuo":"0","ban_ben":"11415",
         * "jianjie":"","xishu":"1.00","yizuo":"3111","ti_ping_num":"0","type_id":"106",
         * "biao_name":"T_K_BAG"},{"id":"104","name":"第五章  能量代谢和体温","pid":"11","status":"0",
         * "pic":null,"pai":"0","zong":"36","zuo":"0","ban_ben":"11417","jianjie":"","xishu":"1
         * .00","yizuo":"2812","ti_ping_num":"0","type_id":"104","biao_name":"T_K_BAE"},{"id
         * ":"115","name":"第六章  神经系统","pid":"13","status":"0","pic":null,"pai":"0","zong":"24",
         * "zuo":"0","ban_ben":"11157","jianjie":"","xishu":"1.00","yizuo":"2719",
         * "ti_ping_num":"0","type_id":"115","biao_name":"T_K_BBF"},{"id":"105","name":"第七章
         * 内分泌","pid":"19","status":"0","pic":null,"pai":"0","zong":"73","zuo":"0",
         * "ban_ben":"11419","jianjie":"","xishu":"1.00","yizuo":"2755","ti_ping_num":"0",
         * "type_id":"105","biao_name":"T_K_BAF"},{"id":"107","name":"第八章  生殖","pid":"20",
         * "status":"0","pic":null,"pai":"0","zong":"22","zuo":"0","ban_ben":"3648","jianjie":"",
         * "xishu":"1.00","yizuo":"2550","ti_ping_num":"0","type_id":"107","biao_name":"T_K_BAH"}
         * ,{"id":"161","name":"第八章  生殖（续）","pid":"20","status":"0","pic":null,"pai":"0",
         * "zong":"18","zuo":"0","ban_ben":"11420","jianjie":"","xishu":"1.00","yizuo":"2467",
         * "ti_ping_num":"0","type_id":"161","biao_name":"T_K_BGB"},{"id":"108","name":"第九章  血液",
         * "pid":"89","status":"0","pic":null,"pai":"0","zong":"52","zuo":"0","ban_ben":"11407",
         * "jianjie":"","xishu":"1.00","yizuo":"3120","ti_ping_num":"0","type_id":"108",
         * "biao_name":"T_K_BAI"},{"id":"111","name":"第十章  血液循环","pid":"93","status":"0",
         * "pic":null,"pai":"0","zong":"125","zuo":"0","ban_ben":"11411","jianjie":"","xishu":"1
         * .00","yizuo":"3322","ti_ping_num":"0","type_id":"111","biao_name":"T_K_BBB"},{"id
         * ":"100","name":"第十一章  尿的生成和排出","pid":"96","status":"0","pic":null,"pai":"0",
         * "zong":"72","zuo":"0","ban_ben":"11082","jianjie":"","xishu":"1.00","yizuo":"2892",
         * "ti_ping_num":"0","type_id":"100","biao_name":"T_K_BAA"},{"id":"159","name":"第十二章
         * 感觉器官","pid":"157","status":"0","pic":null,"pai":"0","zong":"44","zuo":"0",
         * "ban_ben":"11088","jianjie":"","xishu":"1.00","yizuo":"2553","ti_ping_num":"0",
         * "type_id":"159","biao_name":"T_K_BFJ"},{"id":"163","name":"第十三章  神经系统","pid":"162",
         * "status":"0","pic":null,"pai":"0","zong":"103","zuo":"0","ban_ben":"11181",
         * "jianjie":"","xishu":"1.00","yizuo":"2791","ti_ping_num":"0","type_id":"163",
         * "biao_name":"T_K_BGD"}]},{"id":"42","name":"病理学","pid":"0","status":"1","pic":null,
         * "pai":"2","zong":"0","zuo":"0","ban_ben":"0","jianjie":"全国一线名师提供最精细、权威题库","xishu":"1
         * .00","yizuo":"2000","ti_ping_num":"0","type_id":"42","z_type":[{"id":"140","name":"第一章
         * 局部血液循环障碍","pid":"45","status":"0","pic":null,"pai":"0","zong":"36","zuo":"0",
         * "ban_ben":"1759","jianjie":"","xishu":"1.00","yizuo":"4282","ti_ping_num":"0",
         * "type_id":"140","biao_name":"T_K_BEA"},{"id":"128","name":"第二章  细胞和组织的适应与损伤",
         * "pid":"43","status":"0","pic":null,"pai":"0","zong":"65","zuo":"0","ban_ben":"11445",
         * "jianjie":"","xishu":"1.00","yizuo":"3864","ti_ping_num":"0","type_id":"128",
         * "biao_name":"T_K_BCI"},{"id":"141","name":"第三章  损伤的修复","pid":"44","status":"0",
         * "pic":null,"pai":"0","zong":"22","zuo":"0","ban_ben":"1499","jianjie":"","xishu":"1
         * .00","yizuo":"3141","ti_ping_num":"0","type_id":"141","biao_name":"T_K_BEB"},{"id
         * ":"143","name":"第四章  炎症","pid":"46","status":"0","pic":null,"pai":"0","zong":"63",
         * "zuo":"0","ban_ben":"11448","jianjie":"","xishu":"1.00","yizuo":"3111",
         * "ti_ping_num":"0","type_id":"143","biao_name":"T_K_BED"},{"id":"144","name":"第五章  肿瘤",
         * "pid":"47","status":"0","pic":null,"pai":"0","zong":"74","zuo":"0","ban_ben":"11450",
         * "jianjie":"","xishu":"1.00","yizuo":"2809","ti_ping_num":"0","type_id":"144",
         * "biao_name":"T_K_BEE"},{"id":"146","name":"第六章  免疫病理","pid":"48","status":"0",
         * "pic":null,"pai":"0","zong":"21","zuo":"0","ban_ben":"11451","jianjie":"","xishu":"1
         * .00","yizuo":"2867","ti_ping_num":"0","type_id":"146","biao_name":"T_K_BEG"},{"id
         * ":"147","name":"第七章  心血管系统疾病","pid":"49","status":"0","pic":null,"pai":"0",
         * "zong":"51","zuo":"0","ban_ben":"11453","jianjie":"","xishu":"1.00","yizuo":"2861",
         * "ti_ping_num":"0","type_id":"147","biao_name":"T_K_BEH"},{"id":"148","name":"第八章
         * 呼吸系统疾病","pid":"50","status":"0","pic":null,"pai":"0","zong":"51","zuo":"0",
         * "ban_ben":"11454","jianjie":"","xishu":"1.00","yizuo":"2699","ti_ping_num":"0",
         * "type_id":"148","biao_name":"T_K_BEI"},{"id":"150","name":"第九章  消化系统疾病","pid":"51",
         * "status":"0","pic":null,"pai":"0","zong":"72","zuo":"0","ban_ben":"11457",
         * "jianjie":"","xishu":"1.00","yizuo":"2726","ti_ping_num":"0","type_id":"150",
         * "biao_name":"T_K_BFA"},{"id":"152","name":"第十章  淋巴造血系统疾病","pid":"52","status":"0",
         * "pic":null,"pai":"0","zong":"30","zuo":"0","ban_ben":"2931","jianjie":"","xishu":"1
         * .00","yizuo":"3138","ti_ping_num":"0","type_id":"152","biao_name":"T_K_BFC"},{"id
         * ":"153","name":"第十一章  泌尿系统疾病","pid":"53","status":"0","pic":null,"pai":"0",
         * "zong":"38","zuo":"0","ban_ben":"11458","jianjie":"","xishu":"1.00","yizuo":"2760",
         * "ti_ping_num":"0","type_id":"153","biao_name":"T_K_BFD"},{"id":"156","name":"第十二章
         * 生殖系统疾病","pid":"54","status":"0","pic":null,"pai":"0","zong":"23","zuo":"0",
         * "ban_ben":"11459","jianjie":"","xishu":"1.00","yizuo":"2656","ti_ping_num":"0",
         * "type_id":"156","biao_name":"T_K_BFG"},{"id":"158","name":"第十三章  内分泌系统疾病","pid":"55",
         * "status":"0","pic":null,"pai":"0","zong":"13","zuo":"0","ban_ben":"11461",
         * "jianjie":"","xishu":"1.00","yizuo":"2856","ti_ping_num":"0","type_id":"158",
         * "biao_name":"T_K_BFI"},{"id":"155","name":"第十四章  传染病及寄生虫病","pid":"56","status":"0",
         * "pic":null,"pai":"0","zong":"67","zuo":"0","ban_ben":"11464","jianjie":"","xishu":"1
         * .00","yizuo":"2954","ti_ping_num":"0","type_id":"155","biao_name":"T_K_BFF"},{"id
         * ":"127","name":"细胞和组织的适用与损伤","pid":"42","status":"0","pic":null,"pai":"0","zong":"1",
         * "zuo":"0","ban_ben":"1606","jianjie":"","xishu":"1.00","yizuo":"2891",
         * "ti_ping_num":"0","type_id":"127","biao_name":"T_K_BCH"}]},{"id":"37","name":"生物化学",
         * "pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0",
         * "jianjie":"手把手让你考研初试冲刺高分","xishu":"1.00","yizuo":"2000","ti_ping_num":"0",
         * "type_id":"37","z_type":[{"id":"135","name":"第一章  生物大分子的结构和功能","pid":"38",
         * "status":"0","pic":null,"pai":"0","zong":"109","zuo":"0","ban_ben":"11423",
         * "jianjie":"","xishu":"1.00","yizuo":"4035","ti_ping_num":"0","type_id":"135",
         * "biao_name":"T_K_BDF"},{"id":"142","name":"第二章  物质代谢及调节","pid":"39","status":"0",
         * "pic":null,"pai":"0","zong":"252","zuo":"0","ban_ben":"11429","jianjie":"","xishu":"1
         * .00","yizuo":"2933","ti_ping_num":"0","type_id":"142","biao_name":"T_K_BEC"},{"id
         * ":"149","name":"第三章  基因的信息传递","pid":"40","status":"0","pic":null,"pai":"0",
         * "zong":"173","zuo":"0","ban_ben":"11438","jianjie":"","xishu":"1.00","yizuo":"2617",
         * "ti_ping_num":"0","type_id":"149","biao_name":"T_K_BEJ"},{"id":"151","name":"第四章
         * 生化专题","pid":"41","status":"0","pic":null,"pai":"0","zong":"85","zuo":"0",
         * "ban_ben":"11442","jianjie":"","xishu":"1.00","yizuo":"2755","ti_ping_num":"0",
         * "type_id":"151","biao_name":"T_K_BFB"}]},{"id":"72","name":"临床医学人文精神","pid":"0",
         * "status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"",
         * "xishu":"1.00","yizuo":"2000","ti_ping_num":"0","type_id":"72","z_type":[{"id":"188",
         * "name":"医学人文","pid":"187","status":"0","pic":null,"pai":"0","zong":"16","zuo":"0",
         * "ban_ben":"11557","jianjie":"","xishu":"1.00","yizuo":"3598","ti_ping_num":"0",
         * "type_id":"188","biao_name":"T_K_BII"}]}]
         * fen : 0
         */

        private String fen;
        private List<UTypeBean> u_type;

        public String getFen() {
            return fen;
        }

        public void setFen(String fen) {
            this.fen = fen;
        }

        public List<UTypeBean> getU_type() {
            return u_type;
        }

        public void setU_type(List<UTypeBean> u_type) {
            this.u_type = u_type;
        }

        public static class UTypeBean {
            /**
             * id : 57
             * name : 内科学
             * pid : 0
             * status : 1
             * pic : null
             * pai : 5
             * zong : 0
             * zuo : 0
             * ban_ben : 0
             * jianjie : 医学考研一线名师反复审查
             * xishu : 1.00
             * yizuo : 2000
             * ti_ping_num : 0
             * type_id : 57
             * z_type : [{"id":"112","name":"第一章  诊断学","pid":"58","status":"0","pic":null,
             * "pai":"0","zong":"60","zuo":"0","ban_ben":"11468","jianjie":"","xishu":"1.00",
             * "yizuo":"4984","ti_ping_num":"0","type_id":"112","biao_name":"T_K_BBC"},{"id":"114
             * ","name":"第二章  呼吸系统疾病","pid":"59","status":"0","pic":null,"pai":"0","zong":"220",
             * "zuo":"0","ban_ben":"11479","jianjie":"","xishu":"1.00","yizuo":"6607",
             * "ti_ping_num":"0","type_id":"114","biao_name":"T_K_BBE"},{"id":"116","name":"第三章
             * 循环系统疾病","pid":"60","status":"0","pic":null,"pai":"0","zong":"258","zuo":"0",
             * "ban_ben":"11486","jianjie":"","xishu":"1.00","yizuo":"4337","ti_ping_num":"0",
             * "type_id":"116","biao_name":"T_K_BBG"},{"id":"117","name":"第四章  消化系统疾病和中毒",
             * "pid":"61","status":"0","pic":null,"pai":"0","zong":"243","zuo":"0",
             * "ban_ben":"11495","jianjie":"","xishu":"1.00","yizuo":"4080","ti_ping_num":"0",
             * "type_id":"117","biao_name":"T_K_BBH"},{"id":"102","name":"第五章  泌尿系统疾病",
             * "pid":"62","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0",
             * "ban_ben":"11500","jianjie":"","xishu":"1.00","yizuo":"3661","ti_ping_num":"0",
             * "type_id":"102","biao_name":"T_K_BAC"},{"id":"110","name":"第六章  血液系统疾病",
             * "pid":"63","status":"0","pic":null,"pai":"0","zong":"153","zuo":"0",
             * "ban_ben":"11505","jianjie":"","xishu":"1.00","yizuo":"3632","ti_ping_num":"0",
             * "type_id":"110","biao_name":"T_K_BBA"},{"id":"109","name":"第七章  内分泌系统和营养代谢疾病",
             * "pid":"64","status":"0","pic":null,"pai":"0","zong":"143","zuo":"0",
             * "ban_ben":"11510","jianjie":"","xishu":"1.00","yizuo":"3540","ti_ping_num":"0",
             * "type_id":"109","biao_name":"T_K_BAJ"},{"id":"122","name":"第八章  风湿性疾病","pid":"65",
             * "status":"0","pic":null,"pai":"0","zong":"37","zuo":"0","ban_ben":"11513",
             * "jianjie":"","xishu":"1.00","yizuo":"3233","ti_ping_num":"0","type_id":"122",
             * "biao_name":"T_K_BCC"}]
             */

            private String id;
            private String name;
            private String pid;
            private String status;
            private Object pic;
            private String pai;
            private String zong;
            private String zuo;
            private String ban_ben;
            private String jianjie;
            private String xishu;
            private String yizuo;
            private String ti_ping_num;
            private String type_id;
            private List<ZTypeBean> z_type;

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

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Object getPic() {
                return pic;
            }

            public void setPic(Object pic) {
                this.pic = pic;
            }

            public String getPai() {
                return pai;
            }

            public void setPai(String pai) {
                this.pai = pai;
            }

            public String getZong() {
                return zong;
            }

            public void setZong(String zong) {
                this.zong = zong;
            }

            public String getZuo() {
                return zuo;
            }

            public void setZuo(String zuo) {
                this.zuo = zuo;
            }

            public String getBan_ben() {
                return ban_ben;
            }

            public void setBan_ben(String ban_ben) {
                this.ban_ben = ban_ben;
            }

            public String getJianjie() {
                return jianjie;
            }

            public void setJianjie(String jianjie) {
                this.jianjie = jianjie;
            }

            public String getXishu() {
                return xishu;
            }

            public void setXishu(String xishu) {
                this.xishu = xishu;
            }

            public String getYizuo() {
                return yizuo;
            }

            public void setYizuo(String yizuo) {
                this.yizuo = yizuo;
            }

            public String getTi_ping_num() {
                return ti_ping_num;
            }

            public void setTi_ping_num(String ti_ping_num) {
                this.ti_ping_num = ti_ping_num;
            }

            public String getType_id() {
                return type_id;
            }

            public void setType_id(String type_id) {
                this.type_id = type_id;
            }

            public List<ZTypeBean> getZ_type() {
                return z_type;
            }

            public void setZ_type(List<ZTypeBean> z_type) {
                this.z_type = z_type;
            }

            public static class ZTypeBean {
                /**
                 * id : 112
                 * name : 第一章  诊断学
                 * pid : 58
                 * status : 0
                 * pic : null
                 * pai : 0
                 * zong : 60
                 * zuo : 0
                 * ban_ben : 11468
                 * jianjie :
                 * xishu : 1.00
                 * yizuo : 4984
                 * ti_ping_num : 0
                 * type_id : 112
                 * biao_name : T_K_BBC
                 */

                private String id;
                private String name;
                private String pid;
                private String status;
                private Object pic;
                private String pai;
                private String zong;
                private String zuo;
                private String ban_ben;
                private String jianjie;
                private String xishu;
                private String yizuo;
                private String ti_ping_num;
                private String type_id;
                private String biao_name;

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

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public Object getPic() {
                    return pic;
                }

                public void setPic(Object pic) {
                    this.pic = pic;
                }

                public String getPai() {
                    return pai;
                }

                public void setPai(String pai) {
                    this.pai = pai;
                }

                public String getZong() {
                    return zong;
                }

                public void setZong(String zong) {
                    this.zong = zong;
                }

                public String getZuo() {
                    return zuo;
                }

                public void setZuo(String zuo) {
                    this.zuo = zuo;
                }

                public String getBan_ben() {
                    return ban_ben;
                }

                public void setBan_ben(String ban_ben) {
                    this.ban_ben = ban_ben;
                }

                public String getJianjie() {
                    return jianjie;
                }

                public void setJianjie(String jianjie) {
                    this.jianjie = jianjie;
                }

                public String getXishu() {
                    return xishu;
                }

                public void setXishu(String xishu) {
                    this.xishu = xishu;
                }

                public String getYizuo() {
                    return yizuo;
                }

                public void setYizuo(String yizuo) {
                    this.yizuo = yizuo;
                }

                public String getTi_ping_num() {
                    return ti_ping_num;
                }

                public void setTi_ping_num(String ti_ping_num) {
                    this.ti_ping_num = ti_ping_num;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getBiao_name() {
                    return biao_name;
                }

                public void setBiao_name(String biao_name) {
                    this.biao_name = biao_name;
                }
            }
        }
    }
}
